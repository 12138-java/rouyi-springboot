package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ISysUserSalaryService
{
    public long countByExample(SysUserSalaryExample example);


    public int deleteByExample(SysUserSalaryExample example);


    public int deleteByPrimaryKey(Long id);


    public int insert(SysUserSalary record);


    public int insertSelective(SysUserSalary record);


    public List<SysUserSalary> selectByExample(SysUserSalaryExample example);

    List<RespUserSalary> selectByExampleResp(SysUserSalaryExample example);

    public SysUserSalary selectByPrimaryKey(Long id);


    public int updateByExampleSelective(SysUserSalary record,SysUserSalaryExample example);


    public int updateByExample(SysUserSalary record,SysUserSalaryExample example);


    public int updateByPrimaryKeySelective(SysUserSalary record);


    public int updateByPrimaryKey(SysUserSalary record);

}
