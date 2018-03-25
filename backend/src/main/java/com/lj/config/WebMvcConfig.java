package com.lj.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lj.common.DateConverter;

/**
 * Created by sang on 2018/1/2.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConverter());
    }

    @Bean
    public ExecutorService executorService() {
        return Executors.newCachedThreadPool();
    }
    
    /**
     * 重写静态资源的配置路径
     * @author yt.wei
     * @param 
     * @return 
     * @date 2018/2/11 9:30
     */
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
      /* registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
       registry.addResourceHandler("swagger-ui.html")
               .addResourceLocations("classpath:/META-INF/resources/");
       registry.addResourceHandler("/webjars/**")
               .addResourceLocations("classpath:/META-INF/resources/webjars/");*/
   }
    
}
