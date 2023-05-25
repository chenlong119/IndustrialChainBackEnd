package com.ruoyi.project.task.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.task.mapper.TaskMapper;
import com.ruoyi.project.task.domain.Task;
import com.ruoyi.project.task.service.ITaskService;

/**
 * 任务表 Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
@Service
public class TaskServiceImpl implements ITaskService 
{
    @Autowired
    private TaskMapper taskMapper;

    /**
     * 查询任务表 
     * 
     * @param id 任务表 主键
     * @return 任务表 
     */
    @Override
    public Task selectTaskById(Long id)
    {
        return taskMapper.selectTaskById(id);
    }

    /**
     * 查询任务表 列表
     * 
     * @param task 任务表 
     * @return 任务表 
     */
    @Override
    public List<Task> selectTaskList(Task task)
    {
        return taskMapper.selectTaskList(task);
    }

    /**
     * 新增任务表 
     * 
     * @param task 任务表 
     * @return 结果
     */
    @Override
    public int insertTask(Task task)
    {
        return taskMapper.insertTask(task);
    }

    /**
     * 修改任务表 
     * 
     * @param task 任务表 
     * @return 结果
     */
    @Override
    public int updateTask(Task task)
    {
        return taskMapper.updateTask(task);
    }

    /**
     * 批量删除任务表 
     * 
     * @param ids 需要删除的任务表 主键
     * @return 结果
     */
    @Override
    public int deleteTaskByIds(Long[] ids)
    {
        return taskMapper.deleteTaskByIds(ids);
    }

    /**
     * 删除任务表 信息
     * 
     * @param id 任务表 主键
     * @return 结果
     */
    @Override
    public int deleteTaskById(Long id)
    {
        return taskMapper.deleteTaskById(id);
    }
}
