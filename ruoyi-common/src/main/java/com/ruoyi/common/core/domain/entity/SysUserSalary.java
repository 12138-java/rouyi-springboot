package com.ruoyi.common.core.domain.entity;

import java.util.Date;

/**
 * @auther:caishihao
 * @Creation time:2020/11/20 11:05
 * @description:
 */

/**
 * 员工薪资表
 */
public class SysUserSalary {
    /**
     * 工资id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long sysUserId;

    /**
     * 基本工资
     */
    private Integer basic;

    /**
     * 绩效
     */
    private Integer performance;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 0删除 1未删除
     */
    private Integer delFlag;

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

    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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
        sb.append(", delFlag=").append(delFlag);
        sb.append("]");
        return sb.toString();
    }
}