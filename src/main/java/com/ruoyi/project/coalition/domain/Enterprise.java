package com.ruoyi.project.coalition.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 企业表对象 enterprise
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
public class Enterprise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业编号 */
    @Excel(name = "企业编号")
    private Long id;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String name;

    /** 企业所在地 */
    @Excel(name = "企业所在地")
    private String city;

    /** 所属产业链 */
    @Excel(name = "所属产业链")
    private String chain;

    /** 任务资源满足度 */
    @Excel(name = "任务资源满足度")
    private Float satisfy;

    /** 加入联盟个数 */
    @Excel(name = "加入联盟个数")
    private Long cnum;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setChain(String chain) 
    {
        this.chain = chain;
    }

    public String getChain() 
    {
        return chain;
    }
    public void setSatisfy(Float satisfy)
    {
        this.satisfy = satisfy;
    }

    public Float getSatisfy()
    {
        return satisfy;
    }
    public void setCnum(Long cnum) 
    {
        this.cnum = cnum;
    }

    public Long getCnum() 
    {
        return cnum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("city", getCity())
            .append("chain", getChain())
            .append("satisfy", getSatisfy())
            .append("cnum", getCnum())
            .toString();
    }
}
