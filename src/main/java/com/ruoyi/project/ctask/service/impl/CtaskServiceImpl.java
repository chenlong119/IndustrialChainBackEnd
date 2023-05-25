package com.ruoyi.project.ctask.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.ctask.mapper.CtaskMapper;
import com.ruoyi.project.ctask.domain.Ctask;
import com.ruoyi.project.ctask.service.ICtaskService;

/**
 * 正在执行的任务表 Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-25
 */
@Service
public class CtaskServiceImpl implements ICtaskService 
{
    @Autowired
    private CtaskMapper ctaskMapper;

    /**
     * 查询正在执行的任务表 
     * 
     * @param id 正在执行的任务表 主键
     * @return 正在执行的任务表 
     */
    @Override
    public Ctask selectCtaskById(Long id)
    {
        return ctaskMapper.selectCtaskById(id);
    }

    /**
     * 查询正在执行的任务表 列表
     * 
     * @param ctask 正在执行的任务表 
     * @return 正在执行的任务表 
     */
    @Override
    public List<Ctask> selectCtaskList(Ctask ctask)
    {
        return ctaskMapper.selectCtaskList(ctask);
    }

    /**
     * 新增正在执行的任务表 
     * 
     * @param ctask 正在执行的任务表 
     * @return 结果
     */
    @Override
    public int insertCtask(Ctask ctask)
    {
        return ctaskMapper.insertCtask(ctask);
    }

    /**
     * 修改正在执行的任务表 
     * 
     * @param ctask 正在执行的任务表 
     * @return 结果
     */
    @Override
    public int updateCtask(Ctask ctask)
    {
        return ctaskMapper.updateCtask(ctask);
    }

    /**
     * 批量删除正在执行的任务表 
     * 
     * @param ids 需要删除的正在执行的任务表 主键
     * @return 结果
     */
    @Override
    public int deleteCtaskByIds(Long[] ids)
    {
        return ctaskMapper.deleteCtaskByIds(ids);
    }

    /**
     * 删除正在执行的任务表 信息
     * 
     * @param id 正在执行的任务表 主键
     * @return 结果
     */
    @Override
    public int deleteCtaskById(Long id)
    {
        return ctaskMapper.deleteCtaskById(id);
    }
}
