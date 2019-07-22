package com.kobe.service;

import com.kobe.dao.BaseUserMapper;
import com.kobe.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    private BaseUserMapper mapper;

    @Override
    public boolean userLogin(String username, String password) {
        BaseUser user = mapper.selectByUserNameAndPassword(username,password);
        if(null!= user){
            return true;
        }
        return false;
    }
}
