package com.demo.test.req;

import lombok.Data;

@Data
public class StudentReq {

    private Integer pageNum = 1;

    private Integer pageSize = 10;
}
