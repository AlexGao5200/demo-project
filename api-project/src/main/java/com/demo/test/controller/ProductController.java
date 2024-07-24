package com.demo.test.controller;

import com.demo.test.common.ReturnResult;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(tags = "测试网页")
@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/service/test")
public class ProductController {

    @GetMapping("/demo")
    public ReturnResult demo() {
        return ReturnResult.success(new Date());
    }
}
