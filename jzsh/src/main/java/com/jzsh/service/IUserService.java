package com.jzsh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzsh.dto.LoginFormDTO;
import com.jzsh.dto.Result;
import com.jzsh.entity.User;

import javax.servlet.http.HttpSession;


public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
