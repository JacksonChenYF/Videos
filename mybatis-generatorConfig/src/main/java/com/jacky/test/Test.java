package com.jacky.test;

import com.jacky.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: ChenYF
 * @Date: 2019/11/2 15:29
 * @Description:
 */
public class Test {

    @Autowired
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }
}
