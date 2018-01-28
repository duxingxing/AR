package com.dx.service.login.impl;

import com.dx.data.mybatis.mapper.TestDao;
import com.dx.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/28.
 */
@Service
public class SimpleLoginService implements LoginService {
    @Autowired
    private TestDao testDao;
    @Override
    public boolean login(String user, String ped) {
        System.out.print(testDao.list(0));
        return false;
    }
}
