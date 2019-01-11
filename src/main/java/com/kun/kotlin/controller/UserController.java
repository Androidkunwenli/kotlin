package com.kun.kotlin.controller;

import com.kun.kotlin.bean.UserBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api("用户信息管理")
@RestController
@RequestMapping("/user/*")
public class UserController {
    private final static List<UserBean> userList = new ArrayList<>();

    {
        userList.add(new UserBean("赵亚坤", "男", "13263181110", "自己"));
    }


    @ApiOperation("获取列表")
    @GetMapping("list")
    public List userList() {
        return userList;
    }
}
