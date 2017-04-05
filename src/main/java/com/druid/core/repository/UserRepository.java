package com.druid.core.repository;

import com.druid.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/5
 * 描述：
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
