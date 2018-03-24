package com.cuit.springboot.gentry;

import java.io.Serializable;

public class Sysmsg implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysmsg.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysmsg.mid
     *
     * @mbggenerated
     */
    private Integer mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysmsg.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysmsg.hrid
     *
     * @mbggenerated
     */
    private Integer hrid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysmsg.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sysmsg
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysmsg.id
     *
     * @return the value of sysmsg.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysmsg.id
     *
     * @param id the value for sysmsg.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysmsg.mid
     *
     * @return the value of sysmsg.mid
     *
     * @mbggenerated
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysmsg.mid
     *
     * @param mid the value for sysmsg.mid
     *
     * @mbggenerated
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysmsg.type
     *
     * @return the value of sysmsg.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysmsg.type
     *
     * @param type the value for sysmsg.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysmsg.hrid
     *
     * @return the value of sysmsg.hrid
     *
     * @mbggenerated
     */
    public Integer getHrid() {
        return hrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysmsg.hrid
     *
     * @param hrid the value for sysmsg.hrid
     *
     * @mbggenerated
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysmsg.state
     *
     * @return the value of sysmsg.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysmsg.state
     *
     * @param state the value for sysmsg.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mid=").append(mid);
        sb.append(", type=").append(type);
        sb.append(", hrid=").append(hrid);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}