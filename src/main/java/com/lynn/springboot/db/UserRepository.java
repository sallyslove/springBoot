package com.lynn.springboot.db;

import com.lynn.springboot.datamodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eligshn on 2018/12/7.
 */
public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUserName(String userName);
//
//    User findByUserNameOrEmail(String username, String email);
}
