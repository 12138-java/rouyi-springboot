package com.ruoyi.common.core.domain.resp;

import com.ruoyi.common.annotation.Excel;

import java.util.Date;

/**
 * @auther:caishihao
 * @Creation time:2020/11/18 08:19
 * @description:
 */
public class RespUserSalary {
    @Excel(name = "工资序号", cellType = Excel.ColumnType.NUMERIC, prompt = "工资编号")
    private Long id;
    @Excel(name = "用户ID")
    private Long sysUserId;
    @Excel(name = "用户名")
    private String sysUserName;

    /**
     * 基本工资
     */
    @Excel(name = "基本工资")
    private int basic;

    /**
     * 绩效
     */
    @Excel(name = "绩效")
    private int performance;

    @Excel(name = "创建时间",dateFormat="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 创建者
     */
    @Excel(name = "创建者")
    private String creator;

    /**
     * 更新时间
     */
    @Excel(name = "更新时间",dateFormat="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 更新者
     */
    @Excel(name = "更新者")
    private String regenerator;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;

    public RespUserSalary(Long id, Long sysUserId, String sysUserName, int basic, int performance, Date createTime, String creator, Date updateTime, String regenerator, String remark) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.sysUserName = sysUserName;
        this.basic = basic;
        this.performance = performance;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.regenerator = regenerator;
        this.remark = remark;
    }

    public RespUserSalary() {
    }

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

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
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
}
