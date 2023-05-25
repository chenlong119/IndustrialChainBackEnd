package com.ruoyi.project.coalition.mapper;

import java.util.List;
import com.ruoyi.project.coalition.domain.Enterprise;

/**
 * 企业表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
public interface EnterpriseMapper 
{
    /**
     * 查询企业表
     * 
     * @param id 企业表主键
     * @return 企业表
     */
    public Enterprise selectEnterpriseById(Long id);

    /**
     * 查询企业表列表
     * 
     * @param enterprise 企业表
     * @return 企业表集合
     */
    public List<Enterprise> selectEnterpriseList(Enterprise enterprise);

    /**
     * 新增企业表
     * 
     * @param enterprise 企业表
     * @return 结果
     */
    public int insertEnterprise(Enterprise enterprise);

    /**
     * 修改企业表
     * 
     * @param enterprise 企业表
     * @return 结果
     */
    public int updateEnterprise(Enterprise enterprise);

    /**
     * 删除企业表
     * 
     * @param id 企业表主键
     * @return 结果
     */
    public int deleteEnterpriseById(Long id);

    /**
     * 批量删除企业表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEnterpriseByIds(Long[] ids);
}
