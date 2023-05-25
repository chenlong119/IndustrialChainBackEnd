package com.ruoyi.project.operator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.operator.mapper.OperatorMapper;
import com.ruoyi.project.operator.domain.Operator;
import com.ruoyi.project.operator.service.IOperatorService;

/**
 * 操作员表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
@Service
public class OperatorServiceImpl implements IOperatorService 
{
    @Autowired
    private OperatorMapper operatorMapper;

    /**
     * 查询操作员表
     * 
     * @param id 操作员表主键
     * @return 操作员表
     */
    @Override
    public Operator selectOperatorById(Long id)
    {
        return operatorMapper.selectOperatorById(id);
    }

    /**
     * 查询操作员表列表
     * 
     * @param operator 操作员表
     * @return 操作员表
     */
    @Override
    public List<Operator> selectOperatorList(Operator operator)
    {
        return operatorMapper.selectOperatorList(operator);
    }

    /**
     * 新增操作员表
     * 
     * @param operator 操作员表
     * @return 结果
     */
    @Override
    public int insertOperator(Operator operator)
    {
        return operatorMapper.insertOperator(operator);
    }

    /**
     * 修改操作员表
     * 
     * @param operator 操作员表
     * @return 结果
     */
    @Override
    public int updateOperator(Operator operator)
    {
        return operatorMapper.updateOperator(operator);
    }

    /**
     * 批量删除操作员表
     * 
     * @param ids 需要删除的操作员表主键
     * @return 结果
     */
    @Override
    public int deleteOperatorByIds(Long[] ids)
    {
        return operatorMapper.deleteOperatorByIds(ids);
    }

    /**
     * 删除操作员表信息
     * 
     * @param id 操作员表主键
     * @return 结果
     */
    @Override
    public int deleteOperatorById(Long id)
    {
        return operatorMapper.deleteOperatorById(id);
    }
}
