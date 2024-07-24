package com.demo.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.test.entity.Student;
import com.demo.test.req.StudentReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> queryList(@Param("req") StudentReq req);

}
