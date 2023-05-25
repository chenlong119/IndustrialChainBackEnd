package com.ruoyi.project.task.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 任务表 对象 task
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
public class Task extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 任务编号 */
    @Excel(name = "任务编号")
    private Long id;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String name;

    /** 任务类型  */
    @Excel(name = "任务类型 ")
    private Long type;

    /** 任务截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ddl;

    /** 任务持续时长 */
    @Excel(name = "任务持续时长")
    private Long duration;

    /** 任务状态  */
    @Excel(name = "任务状态 ")
    private Long state;

    /** 任务价值 */
    @Excel(name = "任务价值")
    private Long value;

    /** 任务优先级  */
    @Excel(name = "任务优先级 ")
    private Long priority;

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
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setDdl(Date ddl) 
    {
        this.ddl = ddl;
    }

    public Date getDdl() 
    {
        return ddl;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }
    public void setValue(Long value) 
    {
        this.value = value;
    }

    public Long getValue() 
    {
        return value;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("ddl", getDdl())
            .append("duration", getDuration())
            .append("state", getState())
            .append("value", getValue())
            .append("priority", getPriority())
            .toString();
    }
}
