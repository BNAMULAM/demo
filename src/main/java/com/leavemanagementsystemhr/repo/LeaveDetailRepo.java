package com.leavemanagementsystemhr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leavemanagementsystemhr.entities.LeaveDetailEntity;

@Repository
public interface LeaveDetailRepo extends JpaRepository<LeaveDetailEntity, Long>{


	
}
