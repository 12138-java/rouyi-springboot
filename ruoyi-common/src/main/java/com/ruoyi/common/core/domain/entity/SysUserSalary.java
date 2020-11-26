package com.ruoyi.common.core.domain.entity;

import java.util.Date;

/**
 * @auther:caishihao
 * @Creation time:2020/11/26 15:49
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
    private Date createTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 0删除 1未删除
     */
    private Integer delFlag;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新者
     */
    private String regenerator;

    /**
     * 备注
     */
    private String remark;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRegenerator() {
        return regenerator;
    }

    public void setRegenerator(String regenerator) {
        this.regenerator = regenerator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public SysUserSalary(Long id, Long sysUserId, Integer basic, Integer performance, Date createTime, String creator, Integer delFlag, Date updateTime, String regenerator, String remark) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.basic = basic;
        this.performance = performance;
        this.createTime = createTime;
        this.creator = creator;
        this.delFlag = delFlag;
        this.updateTime = updateTime;
        this.regenerator = regenerator;
        this.remark = remark;
    }

    public SysUserSalary() {
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
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", regenerator=").append(regenerator);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}