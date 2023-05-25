package com.ruoyi.project.wtask.controller;

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
import com.ruoyi.project.wtask.domain.Wtask;
import com.ruoyi.project.wtask.service.IWtaskService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 等待中的任务表 Controller
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
@RestController
@RequestMapping("/wtask/show")
public class WtaskController extends BaseController
{
    @Autowired
    private IWtaskService wtaskService;

    /**
     * 查询等待中的任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:list')")
    @GetMapping("/list")
    public TableDataInfo list(Wtask wtask)
    {
        startPage();
        List<Wtask> list = wtaskService.selectWtaskList(wtask);
        return getDataTable(list);
    }

    /**
     * 导出等待中的任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:export')")
    @Log(title = "等待中的任务表 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Wtask wtask)
    {
        List<Wtask> list = wtaskService.selectWtaskList(wtask);
        ExcelUtil<Wtask> util = new ExcelUtil<Wtask>(Wtask.class);
        util.exportExcel(response, list, "等待中的任务表 数据");
    }

    /**
     * 获取等待中的任务表 详细信息
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wtaskService.selectWtaskById(id));
    }

    /**
     * 新增等待中的任务表 
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:add')")
    @Log(title = "等待中的任务表 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Wtask wtask)
    {
        return toAjax(wtaskService.insertWtask(wtask));
    }

    /**
     * 修改等待中的任务表 
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:edit')")
    @Log(title = "等待中的任务表 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Wtask wtask)
    {
        return toAjax(wtaskService.updateWtask(wtask));
    }

    /**
     * 删除等待中的任务表 
     */
    @PreAuthorize("@ss.hasPermi('wtask:show:remove')")
    @Log(title = "等待中的任务表 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtaskService.deleteWtaskByIds(ids));
    }
}
