package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.shiro.service.SysPasswordService;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ISysUserSalaryService;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户信息
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/system/salary")
public class SysUserSalaryController extends BaseController
{
    private String prefix = "system/salary";

    @Autowired
    private ISysUserService userService;

    @Autowired
    private ISysUserSalaryService sysUserSalaryService;

    @RequiresPermissions("system:salary:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/salary";
    }

    /**
     * 用户名输入框显示待选用户名
     * @param userName
     * @return
     */
    @RequiresPermissions("system:salary:selectUserName")
    @PostMapping("/selectUserName")
    @ResponseBody
    public List<SysUser> selectUserName(String userName) {
        List<SysUser> sysUsers = null;
        if (userName != null && !"".equals(userName)){
            sysUsers = userService.selectUserByLoginNameLike(userName);
            return sysUsers;
        }else{
            return sysUsers;
        }


    }

    @RequiresPermissions("system:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        SysUserSalaryExample example = new SysUserSalaryExample();
        SysUserSalaryExample.Criteria criteria = example.createCriteria();
        List<RespUserSalary> respUserSalaries = sysUserSalaryService.selectByExampleResp(example);

        for (RespUserSalary respUserSalary : respUserSalaries) {
            SysUser sysUser = userService.selectUserById(respUserSalary.getSysUserId());
            respUserSalary.setSysUserName(sysUser.getUserName());
        }
        return getDataTable(respUserSalaries);
    }

    /**
     * 新增用户
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存用户
     */
    @RequiresPermissions("system:salary:add")
    @Log(title = "工资管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated SysUserSalary sysUserSalary) throws IllegalAccessException {
        if ("".equals(sysUserSalary.getBasic()) && "".equals(sysUserSalary.getPerformance())){
            return error("有数据为空");
        }else if(sysUserSalaryService.selectByPrimaryKey(sysUserSalary.getSysUserId()) != null){
            return error("该员工工资数据已存在");
        }
        sysUserSalary.setSysUserId(Long.valueOf(3));

        return toAjax(sysUserSalaryService.insertSelective(sysUserSalary));

    }
}