package com.ruoyi.common.core.domain.entity;

import java.util.Date;

/**
 * @auther:caishihao
 * @Creation time:2020/11/19 15:42
 * @description:
 */

/**
 * 员工薪资表
 */
public class SysUserSalary {
    private Long id;

    private Long sysUserId;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", basic=").append(basic);
        sb.append(", performance=").append(performance);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }

    public SysUserSalary() {
    }

    public SysUserSalary(Long id, Long sysUserId, Double basic, Double performance, Date createtime) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.basic = basic;
        this.performance = performance;
        this.createtime = createtime;
    }
}