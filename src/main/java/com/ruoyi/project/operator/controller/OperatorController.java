package com.ruoyi.project.operator.controller;

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
import com.ruoyi.project.operator.domain.Operator;
import com.ruoyi.project.operator.service.IOperatorService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 操作员表Controller
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
@RestController
@RequestMapping("/operator/manage")
public class OperatorController extends BaseController
{
    @Autowired
    private IOperatorService operatorService;

    /**
     * 查询操作员表列表
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(Operator operator)
    {
        startPage();
        List<Operator> list = operatorService.selectOperatorList(operator);
        return getDataTable(list);
    }

    /**
     * 导出操作员表列表
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:export')")
    @Log(title = "操作员表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Operator operator)
    {
        List<Operator> list = operatorService.selectOperatorList(operator);
        ExcelUtil<Operator> util = new ExcelUtil<Operator>(Operator.class);
        util.exportExcel(response, list, "操作员表数据");
    }

    /**
     * 获取操作员表详细信息
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(operatorService.selectOperatorById(id));
    }

    /**
     * 新增操作员表
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:add')")
    @Log(title = "操作员表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Operator operator)
    {
        return toAjax(operatorService.insertOperator(operator));
    }

    /**
     * 修改操作员表
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:edit')")
    @Log(title = "操作员表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Operator operator)
    {
        return toAjax(operatorService.updateOperator(operator));
    }

    /**
     * 删除操作员表
     */
    @PreAuthorize("@ss.hasPermi('operator:manage:remove')")
    @Log(title = "操作员表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(operatorService.deleteOperatorByIds(ids));
    }
}
