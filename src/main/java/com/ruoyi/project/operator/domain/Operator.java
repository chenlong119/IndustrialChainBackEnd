package com.ruoyi.project.operator.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 操作员表对象 operator
 * 
 * @author ruoyi
 * @date 2023-05-23
 */
public class Operator extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 操作员编号 */
    @Excel(name = "操作员编号")
    private Long id;

    /** 操作员姓名 */
    @Excel(name = "操作员姓名")
    private String name;

    /** 当前任务编号 */
    @Excel(name = "当前任务编号")
    private Long tid;

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
    public void setTid(Long tid) 
    {
        this.tid = tid;
    }

    public Long getTid() 
    {
        return tid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("tid", getTid())
            .toString();
    }
}
