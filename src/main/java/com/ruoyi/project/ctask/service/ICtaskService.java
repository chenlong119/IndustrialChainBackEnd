package com.ruoyi.project.ctask.service;

import java.util.List;
import com.ruoyi.project.ctask.domain.Ctask;

/**
 * 正在执行的任务表 Service接口
 * 
 * @author ruoyi
 * @date 2023-05-25
 */
public interface ICtaskService 
{
    /**
     * 查询正在执行的任务表 
     * 
     * @param id 正在执行的任务表 主键
     * @return 正在执行的任务表 
     */
    public Ctask selectCtaskById(Long id);

    /**
     * 查询正在执行的任务表 列表
     * 
     * @param ctask 正在执行的任务表 
     * @return 正在执行的任务表 集合
     */
    public List<Ctask> selectCtaskList(Ctask ctask);

    /**
     * 新增正在执行的任务表 
     * 
     * @param ctask 正在执行的任务表 
     * @return 结果
     */
    public int insertCtask(Ctask ctask);

    /**
     * 修改正在执行的任务表 
     * 
     * @param ctask 正在执行的任务表 
     * @return 结果
     */
    public int updateCtask(Ctask ctask);

    /**
     * 批量删除正在执行的任务表 
     * 
     * @param ids 需要删除的正在执行的任务表 主键集合
     * @return 结果
     */
    public int deleteCtaskByIds(Long[] ids);

    /**
     * 删除正在执行的任务表 信息
     * 
     * @param id 正在执行的任务表 主键
     * @return 结果
     */
    public int deleteCtaskById(Long id);
}
