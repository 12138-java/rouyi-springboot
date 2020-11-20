package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.req.ReqUserSalary;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ISysUserSalaryService
{
    long countByExample(SysUserSalaryExample example);


    int deleteByExample(SysUserSalaryExample example);


    int deleteByPrimaryKey(Long id);


    int insert(SysUserSalary record);


    int insertSelective(SysUserSalary record);


    List<SysUserSalary> selectByExample(SysUserSalaryExample example);

    List<RespUserSalary> selectByExampleResp(SysUserSalaryExample example);

    SysUserSalary selectByPrimaryKey(Long id);

    List<RespUserSalary> selectByCondition(ReqUserSalary reqUserSalary);

    int updateByExampleSelective(SysUserSalary record,SysUserSalaryExample example);


    int updateByExample(SysUserSalary record,SysUserSalaryExample example);


    int updateByPrimaryKeySelective(SysUserSalary record);

    int deleteUserByIds(String ids);

    int updateByPrimaryKey(SysUserSalary record);

}
