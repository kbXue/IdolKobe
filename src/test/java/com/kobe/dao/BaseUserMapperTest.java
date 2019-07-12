package com.kobe.dao;

import com.kobe.entity.BaseUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.*;

public class BaseUserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        baseUserMapper = applicationContext.getBean(BaseUserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        BaseUser baseUser = new BaseUser();
        baseUser.setId(UUID.randomUUID().toString().replace("-",""));
        baseUser.setUsername("yj");
        baseUser.setPassword("123");
        baseUser.setCreatetime(new Date());
        int result = baseUserMapper.insert(baseUser);
        System.out.println(result);
        assert (result == 1);
    }
}