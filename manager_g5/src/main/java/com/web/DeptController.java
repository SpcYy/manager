package com.web;

import com.bean.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;
}