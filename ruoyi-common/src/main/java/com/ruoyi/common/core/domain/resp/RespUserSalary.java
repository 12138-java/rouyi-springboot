package com.ruoyi.common.core.domain.resp;

import java.util.Date;

/**
 * @auther:caishihao
 * @Creation time:2020/11/18 08:19
 * @description:
 */
public class RespUserSalary {
    private Long id;

    private Long sysUserId;

    private String sysUserName;

    /**
     * 基本工资
     */
    private Double basic;

    /**
     * 绩效
     */
    private Double performance;


    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getPerformance() {
        return performance;
    }

    public void setPerformance(Double performance) {
        this.performance = performance;
    }



    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public RespUserSalary(Long id, Long sysUserId, String sysUserName, Double basic, Double performance, Date createtime) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.sysUserName = sysUserName;
        this.basic = basic;
        this.performance = performance;
        this.createtime = createtime;
    }

    public RespUserSalary() {
    }
}
