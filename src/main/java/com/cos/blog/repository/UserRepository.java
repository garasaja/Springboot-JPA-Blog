package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;
import com.sun.el.stream.Optional;

//dao
// 자동으로 bean등록이 된다.
//@Repository // 생략가능하다
public interface UserRepository extends JpaRepository<User, Integer>{ // user테이블의 primarykey는 integer
	
	java.util.Optional<User> findByUsername(String username);
	
	//JPA naming 전략
	//SELECT * FROM user where username = ? AND password = ?;
//	User findByUsernameAndPassword(String username,String password);
	
	//@Query(value = "SELECT * FROM user where username = ? AND password = ?", nativeQuery = true)
	//User login(String username, String password);
}
