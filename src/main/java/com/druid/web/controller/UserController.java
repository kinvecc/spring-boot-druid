package com.druid.web.controller;

import com.druid.core.model.User;
import com.druid.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/5
 * 描述：
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(@RequestParam(name = "page",defaultValue = "0",required = false)int page,
                     @RequestParam(name = "size",defaultValue = "10",required = false) int size){
        Page<User> pages = userService.findByPage(page, size);
        return pages.getContent();
    }


}
