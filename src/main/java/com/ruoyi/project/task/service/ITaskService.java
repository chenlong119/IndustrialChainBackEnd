package com.ruoyi.project.task.service;

import java.util.List;
import com.ruoyi.project.task.domain.Task;

/**
 * 任务表 Service接口
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
public interface ITaskService 
{
    /**
     * 查询任务表 
     * 
     * @param id 任务表 主键
     * @return 任务表 
     */
    public Task selectTaskById(Long id);

    /**
     * 查询任务表 列表
     * 
     * @param task 任务表 
     * @return 任务表 集合
     */
    public List<Task> selectTaskList(Task task);

    /**
     * 新增任务表 
     * 
     * @param task 任务表 
     * @return 结果
     */
    public int insertTask(Task task);

    /**
     * 修改任务表 
     * 
     * @param task 任务表 
     * @return 结果
     */
    public int updateTask(Task task);

    /**
     * 批量删除任务表 
     * 
     * @param ids 需要删除的任务表 主键集合
     * @return 结果
     */
    public int deleteTaskByIds(Long[] ids);

    /**
     * 删除任务表 信息
     * 
     * @param id 任务表 主键
     * @return 结果
     */
    public int deleteTaskById(Long id);
}
