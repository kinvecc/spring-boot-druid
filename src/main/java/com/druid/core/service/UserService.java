package com.druid.core.service;

import com.druid.core.model.User;
import com.druid.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/5
 * 描述：
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Page<User> findByPage(int page,int size){
        Page<User> pages = userRepository.findAll(new PageRequest(page, size));
        return pages;
    }
}
