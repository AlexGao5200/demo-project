package com.demo.test.controller;


import com.demo.test.common.ReturnResult;
import com.demo.test.entity.Student;
import com.demo.test.req.StudentReq;
import com.demo.test.service.IStudentService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "学生管理")
@Validated
@RestController
@RequestMapping("/api/service/student")
@RequiredArgsConstructor
public class StudentController{

    private final IStudentService StudentService;

    @PostMapping("/queryList")
    public ReturnResult<PageInfo<Student>> queryList(@RequestBody StudentReq req) {
        return ReturnResult.success(StudentService.queryList(req));
    }

}
