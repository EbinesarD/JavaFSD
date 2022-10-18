package com.payroll.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payroll.app.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
	List<User> findByEmployeeid(String employeeid);
}
