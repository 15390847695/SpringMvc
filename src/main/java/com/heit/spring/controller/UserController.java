package com.heit.spring.controller;

import com.heit.spring.req.CreateReq;
import com.heit.spring.req.QueryReq;
import com.heit.spring.resp.CreateUserResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//这种畸形的请求语法，一般是参数传了，但是数据类型有问题，或者获取数据的方式有问题
@Controller
@RequestMapping("/User")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CreateUserResp Createuser(@RequestBody CreateReq createReq){
        String openid=createReq.getOpenid();
        String username=createReq.getUsername();
        System.out.println("openid"+openid);
        //TODO
        CreateUserResp createUserResp=new CreateUserResp();
        //TODO
        createUserResp.setRet(0);
        createUserResp.setMsg("成功");
        createUserResp.setUid("100001");
        createUserResp.setAccess_token("希望很大");
        createUserResp.setExpires_in(10000098);
        createUserResp.setToken_type("圆");
        return createUserResp;



    }
}
