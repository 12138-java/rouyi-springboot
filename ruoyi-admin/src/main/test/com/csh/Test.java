package com.csh;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.mapper.SysUserSalaryMapper;
import com.ruoyi.system.service.ISysUserSalaryService;
import com.ruoyi.system.service.impl.SysUserSalaryServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @auther:caishihao
 * @Creation time:2020/11/17 17:43
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class Test {


    ISysUserSalaryService sysUserSalaryService = new SysUserSalaryServiceImpl();

//    @Autowired
//    private SysUserSalaryMapper sysUserSalaryMapper;
//
//    @Autowired
//    private SysUserMapper sysUserMapper;

    @org.junit.Test
    public void test1(){
        SysUserSalaryExample example = new SysUserSalaryExample();
        SysUserSalaryExample.Criteria criteria = example.createCriteria();
        List<SysUserSalary> sysUserSalaries = sysUserSalaryService.selectByExample(example);
        for (SysUserSalary sysUserSalary : sysUserSalaries) {
            System.out.println(sysUserSalary);
        }
    }


//    @org.junit.Test
//    public void test2(){
//        SysUserSalary sysUserSalary1 = sysUserSalaryMapper.selectByPrimaryKey(Long.valueOf(1));
//        System.out.println(sysUserSalary1);
//    }

//    @org.junit.Test
//    public void test3(){
//        SysUser sysUser = sysUserMapper.selectUserById(Long.valueOf(1));
//        System.out.println(sysUser);
//    }
}
