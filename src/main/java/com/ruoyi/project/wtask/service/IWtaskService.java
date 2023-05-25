package com.ruoyi.project.wtask.service;

import java.util.List;
import com.ruoyi.project.wtask.domain.Wtask;

/**
 * 等待中的任务表 Service接口
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
public interface IWtaskService 
{
    /**
     * 查询等待中的任务表 
     * 
     * @param id 等待中的任务表 主键
     * @return 等待中的任务表 
     */
    public Wtask selectWtaskById(Long id);

    /**
     * 查询等待中的任务表 列表
     * 
     * @param wtask 等待中的任务表 
     * @return 等待中的任务表 集合
     */
    public List<Wtask> selectWtaskList(Wtask wtask);

    /**
     * 新增等待中的任务表 
     * 
     * @param wtask 等待中的任务表 
     * @return 结果
     */
    public int insertWtask(Wtask wtask);

    /**
     * 修改等待中的任务表 
     * 
     * @param wtask 等待中的任务表 
     * @return 结果
     */
    public int updateWtask(Wtask wtask);

    /**
     * 批量删除等待中的任务表 
     * 
     * @param ids 需要删除的等待中的任务表 主键集合
     * @return 结果
     */
    public int deleteWtaskByIds(Long[] ids);

    /**
     * 删除等待中的任务表 信息
     * 
     * @param id 等待中的任务表 主键
     * @return 结果
     */
    public int deleteWtaskById(Long id);
}
