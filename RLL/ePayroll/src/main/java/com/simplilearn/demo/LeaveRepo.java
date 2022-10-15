package com.simplilearn.demo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@EnableJpaRepositories
public interface LeaveRepo extends JpaRepository<Leaves, Long>{

	Optional<Leaves> findByEmployeeid(String employeeid);
	void deleteByEmployeeid(String employeeid);
}
