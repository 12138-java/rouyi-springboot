package com.ruoyi.system.mapper;


import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther:caishihao
 * @Creation time:2020/11/19 15:42
 * @description:
 */
public interface SysUserSalaryMapper {
    long countByExample(SysUserSalaryExample example);

    int deleteByExample(SysUserSalaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserSalary record);

    int insertSelective(SysUserSalary record);

    List<SysUserSalary> selectByExample(SysUserSalaryExample example);

    List<RespUserSalary> selectByExampleResp(SysUserSalaryExample example);

    SysUserSalary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserSalary record, @Param("example") SysUserSalaryExample example);

    int updateByExample(@Param("record") SysUserSalary record, @Param("example") SysUserSalaryExample example);

    int updateByPrimaryKeySelective(SysUserSalary record);

    int updateByPrimaryKey(SysUserSalary record);
}