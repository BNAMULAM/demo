package com.leavemanagementsystemhr.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leavemanagementsystemhr.entities.LeaveDetailEntity;
import com.leavemanagementsystemhr.repo.LeaveDetailRepo;

@Service
public class LeaveDetailServiceImpl implements LeaveDetailService{
	
	@Autowired
	private LeaveDetailRepo leavedetailrepo;
	

	@Override
	public LeaveDetailEntity medicalReport(long leaveId, boolean isValid) {
		LeaveDetailEntity leaveDetailEntity = leavedetailrepo.findById(leaveId).orElse(null);
		if(leaveDetailEntity!=null) {
			leaveDetailEntity.setMedicalReport(isValid);
			leavedetailrepo.save(leaveDetailEntity);
			
		}
		return leaveDetailEntity;
	}
}
