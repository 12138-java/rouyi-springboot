package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.entity.SysUserSalary;
import com.ruoyi.common.core.domain.entity.SysUserSalaryExample;
import com.ruoyi.common.core.domain.req.ReqUserSalary;
import com.ruoyi.common.core.domain.resp.RespUserSalary;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ISysUserSalaryService;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    /**
     * 删除数据（伪删除）
     * @param ids
     * @return
     */
    @RequiresPermissions("system:salary:remove")
    @Log(title = "工资管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        try
        {
            Long[] salaryIds = Convert.toLongArray(ids);
            for (Long salaryId : salaryIds) {
                sysUserSalaryService.deleteByPrimaryKey(salaryId);
            }
            return toAjax(1);
        }
        catch (Exception e)
        {
            return error(e.getMessage());
        }
    }

    @RequiresPermissions("system:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(@Validated ReqUserSalary reqUserSalary) {

        List<RespUserSalary> respUserSalaries = sysUserSalaryService.selectByCondition(reqUserSalary);


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

        sysUserSalary.setCreateTime(new Date());
        String loginName = ShiroUtils.getLoginName();
        sysUserSalary.setCreator(loginName);
        return toAjax(sysUserSalaryService.insertSelective(sysUserSalary));

    }


    /**
     * 到修改用户界面，回显数据
     */
    @GetMapping("/edit/{salaryId}")
    public String edit(@PathVariable("salaryId") Long salaryId, ModelMap modelMap)  {
        SysUserSalaryExample example = new SysUserSalaryExample();
        SysUserSalaryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(salaryId);
        List<RespUserSalary> respUserSalaries = sysUserSalaryService.selectByExampleResp(example);

        for (RespUserSalary respUserSalary : respUserSalaries) {
            SysUser sysUser = userService.selectUserById(respUserSalary.getSysUserId());
            respUserSalary.setSysUserName(sysUser.getUserName());
        }

        try {
            modelMap.put("id", respUserSalaries.get(0).getId());
            modelMap.put("userName", respUserSalaries.get(0).getSysUserName());
            modelMap.put("userId", respUserSalaries.get(0).getSysUserId());
            modelMap.put("basic", respUserSalaries.get(0).getBasic());
            modelMap.put("performance", respUserSalaries.get(0).getPerformance());
            modelMap.put("createTime", dateConversion(respUserSalaries.get(0).getCreateTime()));
            modelMap.put("creator", respUserSalaries.get(0).getCreator());
            modelMap.put("updateTime", dateConversion(respUserSalaries.get(0).getUpdateTime()));
            modelMap.put("regenerator", respUserSalaries.get(0).getRegenerator());
            modelMap.put("remark", respUserSalaries.get(0).getRemark());
        }catch (Exception e){
            e.printStackTrace();
        }

        return prefix + "/edit";
    }

    /**
     * 时间转为yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     * @throws ParseException
     */
    public String dateConversion(Date date) {
        String formatStr2 = null;
        try {
            formatStr2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }catch (Exception e){
            e.printStackTrace();
        }

        return formatStr2;
    }

    @Log(title = "工资管理", businessType = BusinessType.EXPORT)
    @RequiresPermissions("system:salary:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysUserSalary sysUserSalary) {
        SysUserSalaryExample example = new SysUserSalaryExample();
        SysUserSalaryExample.Criteria criteria = example.createCriteria();
        List<RespUserSalary> respUserSalaries = sysUserSalaryService.selectByExampleResp(example);

        for (RespUserSalary respUserSalary : respUserSalaries) {
            SysUser sysUser = userService.selectUserById(respUserSalary.getSysUserId());
            respUserSalary.setSysUserName(sysUser.getUserName());
        }
        ExcelUtil<RespUserSalary> util = new ExcelUtil<RespUserSalary>(RespUserSalary.class);
        return util.exportExcel(respUserSalaries, "用户工资数据");
    }

    /**
     * 修改保存用户
     */
    @RequiresPermissions("system:salary:edit")
    @Log(title = "工资管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated SysUserSalary sysUserSalary) {
        sysUserSalary.setUpdateTime(new Date());
        String loginName = ShiroUtils.getLoginName();
        sysUserSalary.setRegenerator(loginName);
        return toAjax(sysUserSalaryService.updateByPrimaryKeySelective(sysUserSalary));
    }
}