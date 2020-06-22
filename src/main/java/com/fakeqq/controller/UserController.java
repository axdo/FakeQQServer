package com.fakeqq.controller;

import com.alibaba.fastjson.JSONObject;
import com.fakeqq.model.User;
import com.fakeqq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, Model model){
        response.setContentType("application/json");
        PrintWriter out = null;
        JSONObject json = new JSONObject();

        String account = request.getParameter("account");
        String password = request.getParameter("password");
        try {
            out = response.getWriter();

//            user = testService.queryByID(user);
//            User user = userService.getUserByAccount("aaa");
            User user = userService.getUserByAccount(account);
            System.out.println("password  " + user.getPassword());
            if (user != null) {
                if (password.equals(user.getPassword())) {
                    //正确返回
                    json.put("status", 1);
                    json.put("user", user);
                    out.write(json.toString());
                } else {
                    //密码错误
                    json.put("status", 2);
                    json.put("user", user);
                    out.write(json.toString());
                }
            } else {
                //账号不对
                json.put("status", 0);
                json.put("user", null);
                out.write(json.toString());
            }
        } catch (Exception e) {
            e.toString();
            json.put("status", -1);
            json.put("user", null);
            out.write(json.toString());
        } finally{
            out.flush();
            out.close();
        }
        System.out.println(json);
//        return json;

    }


    //注册
    @RequestMapping("/register")
    public void register(HttpServletRequest request, HttpServletResponse response, Model model){
        response.setContentType("application/json");
        PrintWriter out = null;
        JSONObject json = new JSONObject();

        String account = request.getParameter("account");
        String password = request.getParameter("password");
        try {
            out = response.getWriter();

            User user = new User();
            System.out.println("password  " + user.getPassword());
            user.setAccount(account);
            if (userService.getUserByAccount(account)!=null){
                //判断存在
                json.put("status", 2);
                json.put("user", user);
                out.write(json.toString());
            } else {
                user.setPassword(password);
                if (userService.addUser(user)!=0){
                    json.put("status", 1);
                    json.put("user", user);
                    out.write(json.toString());
                } else {
                    json.put("status", 0);
                    json.put("user", null);
                    out.write(json.toString());
                }
            }

        } catch (Exception e) {
            e.toString();
            json.put("status", -1);
            json.put("user", null);
            out.write(json.toString());
        } finally{
            out.flush();
            out.close();
        }
//        return json;

    }
}
