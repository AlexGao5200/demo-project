package com.demo.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.test.entity.Student;
import com.demo.test.mapper.StudentMapper;
import com.demo.test.req.StudentReq;
import com.demo.test.service.IStudentService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Override
    public PageInfo<Student> queryList(StudentReq req) {
        PageMethod.startPage(req.getPageNum(), req.getPageSize());
        List<Student> pageList = baseMapper.queryList(req);
        return new PageInfo<>(pageList);
    }
}
