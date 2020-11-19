package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import com.ruoyi.system.mapper.SysUserSalaryMapper;
import com.ruoyi.system.service.ISysUserSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther:caishihao
 * @Creation time:2020/11/17 16:59
 * @description:
 */
@Service
public class SysUserSalaryServiceImpl implements ISysUserSalaryService {

    @Autowired
    private SysUserSalaryMapper sysUserSalaryMapper;


    public long countByExample(SysUserSalaryExample example) {
        return sysUserSalaryMapper.countByExample(example);
    }


    public int deleteByExample(SysUserSalaryExample example) {
        return sysUserSalaryMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Long id) {
        return sysUserSalaryMapper.deleteByPrimaryKey(id);
    }


    public int insert(SysUserSalary record) {
        return sysUserSalaryMapper.insert(record);
    }


    public int insertSelective(SysUserSalary record) {
        return sysUserSalaryMapper.insertSelective(record);
    }


    public List<SysUserSalary> selectByExample(SysUserSalaryExample example) {
        return sysUserSalaryMapper.selectByExample(example);
    }

    @Override
    public List<RespUserSalary> selectByExampleResp(SysUserSalaryExample example) {
        return sysUserSalaryMapper.selectByExampleResp(example);
    }


    public SysUserSalary selectByPrimaryKey(Long id) {
        return sysUserSalaryMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(SysUserSalary record,SysUserSalaryExample example) {
        return sysUserSalaryMapper.updateByExampleSelective(record,example);
    }


    public int updateByExample(SysUserSalary record,SysUserSalaryExample example) {
        return sysUserSalaryMapper.updateByExample(record,example);
    }


    public int updateByPrimaryKeySelective(SysUserSalary record) {
        return sysUserSalaryMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(SysUserSalary record) {
        return sysUserSalaryMapper.updateByPrimaryKey(record);
    }

}
