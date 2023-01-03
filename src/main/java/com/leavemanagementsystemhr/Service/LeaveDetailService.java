package com.leavemanagementsystemhr.Service;

import java.util.List;

import com.leavemanagementsystemhr.entities.LeaveDetailEntity;
import com.leavemanagementsystemhr.enums.LeaveType;


public interface LeaveDetailService {
	LeaveDetailEntity medicalReport(long leaveId, boolean isValid);

}
	
//	LeaveDetailEntity getLeaveById(long leaveId);
//	List<LeaveDetailEntity> getAllLeaves();
//	LeaveDetailEntity createLeave(LeaveDetailEntity leaveDetail);
//	LeaveDetailEntity updateLeave(LeaveDetailEntity leaveDetail);
//	void deleteLeave(long leaveId);


