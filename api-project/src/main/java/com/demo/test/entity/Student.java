package com.demo.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sno", type = IdType.AUTO)
    private Integer sno;

    @TableField("sname")
    private String sname;

    @TableField("sage")
    private Integer sage;

    @TableField("saddress")
    private String saddress;

    @TableField("spwd")
    private String spwd;

    @TableField("temperature")
    private String temperature;


    @TableField("situation")
    private String situation;

    @TableField("atschool")
    private String atschool;

    @TableField("time")
    private Date time;

}
