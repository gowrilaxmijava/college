package com.org.tcs.repository;

import com.org.tcs.model.College;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer> {
}
