package com.jzsh.service.impl;

import com.jzsh.entity.UserInfo;
import com.jzsh.mapper.UserInfoMapper;
import com.jzsh.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
