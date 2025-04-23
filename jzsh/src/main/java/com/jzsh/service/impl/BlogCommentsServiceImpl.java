package com.jzsh.service.impl;

import com.jzsh.entity.BlogComments;
import com.jzsh.mapper.BlogCommentsMapper;
import com.jzsh.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
