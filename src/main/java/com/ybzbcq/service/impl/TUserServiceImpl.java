package com.ybzbcq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybzbcq.mapper.TUserMapper;
import com.ybzbcq.model.TUser;
import com.ybzbcq.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0", timeout = 10000)
@Component
public class TUserServiceImpl implements TUserService {


    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public String sayHI(String name) {
        return "i'm say to you, " + name;
    }

    @Override
    public TUser getUserById(Integer id) {
        TUser tUser = tUserMapper.selectByPrimaryKey(id);
        return tUser;
    }
}
