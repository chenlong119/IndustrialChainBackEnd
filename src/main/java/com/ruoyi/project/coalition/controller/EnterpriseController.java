package com.ruoyi.project.coalition.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.coalition.domain.Enterprise;
import com.ruoyi.project.coalition.service.IEnterpriseService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 企业表Controller
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
@RestController
@RequestMapping("/coalition/enterprise")
public class EnterpriseController extends BaseController
{
    @Autowired
    private IEnterpriseService enterpriseService;

    /**
     * 查询企业表列表
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:list')")
    @GetMapping("/list")
    public TableDataInfo list(Enterprise enterprise)
    {
        startPage();
        List<Enterprise> list = enterpriseService.selectEnterpriseList(enterprise);
        return getDataTable(list);
    }

    /**
     * 导出企业表列表
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:export')")
    @Log(title = "企业表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Enterprise enterprise)
    {
        List<Enterprise> list = enterpriseService.selectEnterpriseList(enterprise);
        ExcelUtil<Enterprise> util = new ExcelUtil<Enterprise>(Enterprise.class);
        util.exportExcel(response, list, "企业表数据");
    }

    /**
     * 获取企业表详细信息
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(enterpriseService.selectEnterpriseById(id));
    }

    /**
     * 新增企业表
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:add')")
    @Log(title = "企业表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Enterprise enterprise)
    {
        return toAjax(enterpriseService.insertEnterprise(enterprise));
    }

    /**
     * 修改企业表
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:edit')")
    @Log(title = "企业表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Enterprise enterprise)
    {
        return toAjax(enterpriseService.updateEnterprise(enterprise));
    }

    /**
     * 删除企业表
     */
    @PreAuthorize("@ss.hasPermi('coalition:enterprise:remove')")
    @Log(title = "企业表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(enterpriseService.deleteEnterpriseByIds(ids));
    }
}
