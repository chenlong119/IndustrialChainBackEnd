package com.ruoyi.project.wtask.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.wtask.mapper.WtaskMapper;
import com.ruoyi.project.wtask.domain.Wtask;
import com.ruoyi.project.wtask.service.IWtaskService;

/**
 * 等待中的任务表 Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
@Service
public class WtaskServiceImpl implements IWtaskService 
{
    @Autowired
    private WtaskMapper wtaskMapper;

    /**
     * 查询等待中的任务表 
     * 
     * @param id 等待中的任务表 主键
     * @return 等待中的任务表 
     */
    @Override
    public Wtask selectWtaskById(Long id)
    {
        return wtaskMapper.selectWtaskById(id);
    }

    /**
     * 查询等待中的任务表 列表
     * 
     * @param wtask 等待中的任务表 
     * @return 等待中的任务表 
     */
    @Override
    public List<Wtask> selectWtaskList(Wtask wtask)
    {
        return wtaskMapper.selectWtaskList(wtask);
    }

    /**
     * 新增等待中的任务表 
     * 
     * @param wtask 等待中的任务表 
     * @return 结果
     */
    @Override
    public int insertWtask(Wtask wtask)
    {
        return wtaskMapper.insertWtask(wtask);
    }

    /**
     * 修改等待中的任务表 
     * 
     * @param wtask 等待中的任务表 
     * @return 结果
     */
    @Override
    public int updateWtask(Wtask wtask)
    {
        return wtaskMapper.updateWtask(wtask);
    }

    /**
     * 批量删除等待中的任务表 
     * 
     * @param ids 需要删除的等待中的任务表 主键
     * @return 结果
     */
    @Override
    public int deleteWtaskByIds(Long[] ids)
    {
        return wtaskMapper.deleteWtaskByIds(ids);
    }

    /**
     * 删除等待中的任务表 信息
     * 
     * @param id 等待中的任务表 主键
     * @return 结果
     */
    @Override
    public int deleteWtaskById(Long id)
    {
        return wtaskMapper.deleteWtaskById(id);
    }
}
