package com.csh;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.req.ReqUserSalary;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.mapper.SysUserSalaryMapper;
import com.ruoyi.system.service.ISysUserSalaryService;
import com.ruoyi.system.service.impl.SysUserSalaryServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
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



    @org.junit.Test
    public void test(){
        Date date = new Date();
        System.out.println(date);
        String formatStr2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(formatStr2);
    }


}
