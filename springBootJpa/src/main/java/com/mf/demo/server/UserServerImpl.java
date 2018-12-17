package com.mf.demo.server;


import com.mf.demo.dao.QueryUserDao;
import com.mf.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServerImpl implements UserServer {

    @Autowired
    private QueryUserDao queryUserDao;

    @Override
    public String analysis(int id,String name) {
        User user = queryUserDao.findByUserId(id);
        user.setName(name);
        queryUserDao.save(user);
        return user.toString();
    }
}
