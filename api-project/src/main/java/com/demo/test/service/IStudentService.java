package com.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.test.entity.Student;
import com.demo.test.req.StudentReq;
import com.github.pagehelper.PageInfo;

public interface IStudentService extends IService<Student> {

    PageInfo<Student> queryList(StudentReq Req);

}
