package com.ruoyi.project.ctask.controller;

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
import com.ruoyi.project.ctask.domain.Ctask;
import com.ruoyi.project.ctask.service.ICtaskService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 正在执行的任务表 Controller
 * 
 * @author ruoyi
 * @date 2023-05-25
 */
@RestController
@RequestMapping("/ctask/manage")
public class CtaskController extends BaseController
{
    @Autowired
    private ICtaskService ctaskService;

    /**
     * 查询正在执行的任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ctask ctask)
    {
        startPage();
        List<Ctask> list = ctaskService.selectCtaskList(ctask);
        return getDataTable(list);
    }

    /**
     * 导出正在执行的任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:export')")
    @Log(title = "正在执行的任务表 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Ctask ctask)
    {
        List<Ctask> list = ctaskService.selectCtaskList(ctask);
        ExcelUtil<Ctask> util = new ExcelUtil<Ctask>(Ctask.class);
        util.exportExcel(response, list, "正在执行的任务表 数据");
    }

    /**
     * 获取正在执行的任务表 详细信息
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ctaskService.selectCtaskById(id));
    }

    /**
     * 新增正在执行的任务表 
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:add')")
    @Log(title = "正在执行的任务表 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ctask ctask)
    {
        return toAjax(ctaskService.insertCtask(ctask));
    }

    /**
     * 修改正在执行的任务表 
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:edit')")
    @Log(title = "正在执行的任务表 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ctask ctask)
    {
        return toAjax(ctaskService.updateCtask(ctask));
    }

    /**
     * 删除正在执行的任务表 
     */
    @PreAuthorize("@ss.hasPermi('ctask:manage:remove')")
    @Log(title = "正在执行的任务表 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ctaskService.deleteCtaskByIds(ids));
    }
}
