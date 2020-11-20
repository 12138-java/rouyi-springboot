package com.ruoyi.common.core.domain.req;

/**
 * @auther:caishihao
 * @Creation time:2020/11/18 08:19
 * @description:
 */
public class ReqUserSalary {
    private Long id;

    private Long sysUserId;

    private String sysUserName;

    /**
     * 基本工资
     */
    private String basic;

    /**
     * 绩效
     */
    private String performance;


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

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public ReqUserSalary() {
    }

    public ReqUserSalary(Long id, Long sysUserId, String sysUserName, String basic, String performance) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.sysUserName = sysUserName;
        this.basic = basic;
        this.performance = performance;
    }
}
