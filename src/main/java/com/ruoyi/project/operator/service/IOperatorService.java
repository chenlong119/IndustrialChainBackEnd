package com.ruoyi.project.operator.service;

import java.util.List;
import com.ruoyi.project.operator.domain.Operator;

/**
 * 操作员表Service接口
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
public interface IOperatorService 
{
    /**
     * 查询操作员表
     * 
     * @param id 操作员表主键
     * @return 操作员表
     */
    public Operator selectOperatorById(Long id);

    /**
     * 查询操作员表列表
     * 
     * @param operator 操作员表
     * @return 操作员表集合
     */
    public List<Operator> selectOperatorList(Operator operator);

    /**
     * 新增操作员表
     * 
     * @param operator 操作员表
     * @return 结果
     */
    public int insertOperator(Operator operator);

    /**
     * 修改操作员表
     * 
     * @param operator 操作员表
     * @return 结果
     */
    public int updateOperator(Operator operator);

    /**
     * 批量删除操作员表
     * 
     * @param ids 需要删除的操作员表主键集合
     * @return 结果
     */
    public int deleteOperatorByIds(Long[] ids);

    /**
     * 删除操作员表信息
     * 
     * @param id 操作员表主键
     * @return 结果
     */
    public int deleteOperatorById(Long id);
}
