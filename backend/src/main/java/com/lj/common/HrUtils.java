package com.lj.common;

import com.lj.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

import com.lj.bean.Hr;

/**
 * Created by sang on 2017/12/30.
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
