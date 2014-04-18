package com.myfeike.boot.repository;

import com.myfeike.boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by izerui.com on 14-4-18.
 */
public interface UserRepository extends JpaRepository<User,String> {
}
