package com.ruoyi.project.task.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.project.task.domain.Task;
import com.ruoyi.project.task.service.ITaskService;
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

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 任务表 Controller
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
@RestController
@RequestMapping("/task/taskAllocation")
public class TaskController extends BaseController
{
    @Autowired
    private ITaskService taskService;

    /**
     * 查询任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:list')")
    @GetMapping("/list")
    public TableDataInfo list(Task task)
    {
        startPage();
        List<Task> list = taskService.selectTaskList(task);
        return getDataTable(list);
    }

    /**
     * 导出任务表 列表
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:export')")
    @Log(title = "任务表 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Task task)
    {
        List<Task> list = taskService.selectTaskList(task);
        ExcelUtil<Task> util = new ExcelUtil<Task>(Task.class);
        util.exportExcel(response, list, "任务表 数据");
    }

    /**
     * 获取任务表 详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(taskService.selectTaskById(id));
    }

    /**
     * 新增任务表 
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:add')")
    @Log(title = "任务表 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Task task)
    {
        return toAjax(taskService.insertTask(task));
    }

    /**
     * 修改任务表 
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:edit')")
    @Log(title = "任务表 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Task task)
    {
        return toAjax(taskService.updateTask(task));
    }

    /**
     * 删除任务表 
     */
    @PreAuthorize("@ss.hasPermi('task:taskAllocation:remove')")
    @Log(title = "任务表 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(taskService.deleteTaskByIds(ids));
    }
}
