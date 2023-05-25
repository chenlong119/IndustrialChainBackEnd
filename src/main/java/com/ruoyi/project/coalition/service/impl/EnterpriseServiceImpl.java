package com.ruoyi.project.coalition.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.coalition.mapper.EnterpriseMapper;
import com.ruoyi.project.coalition.domain.Enterprise;
import com.ruoyi.project.coalition.service.IEnterpriseService;

/**
 * 企业表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
@Service
public class EnterpriseServiceImpl implements IEnterpriseService 
{
    @Autowired
    private EnterpriseMapper enterpriseMapper;

    /**
     * 查询企业表
     * 
     * @param id 企业表主键
     * @return 企业表
     */
    @Override
    public Enterprise selectEnterpriseById(Long id)
    {
        return enterpriseMapper.selectEnterpriseById(id);
    }

    /**
     * 查询企业表列表
     * 
     * @param enterprise 企业表
     * @return 企业表
     */
    @Override
    public List<Enterprise> selectEnterpriseList(Enterprise enterprise)
    {
        return enterpriseMapper.selectEnterpriseList(enterprise);
    }

    /**
     * 新增企业表
     * 
     * @param enterprise 企业表
     * @return 结果
     */
    @Override
    public int insertEnterprise(Enterprise enterprise)
    {
        return enterpriseMapper.insertEnterprise(enterprise);
    }

    /**
     * 修改企业表
     * 
     * @param enterprise 企业表
     * @return 结果
     */
    @Override
    public int updateEnterprise(Enterprise enterprise)
    {
        return enterpriseMapper.updateEnterprise(enterprise);
    }

    /**
     * 批量删除企业表
     * 
     * @param ids 需要删除的企业表主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseByIds(Long[] ids)
    {
        return enterpriseMapper.deleteEnterpriseByIds(ids);
    }

    /**
     * 删除企业表信息
     * 
     * @param id 企业表主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseById(Long id)
    {
        return enterpriseMapper.deleteEnterpriseById(id);
    }
}
