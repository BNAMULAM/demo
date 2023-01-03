package com.leavemanagementsystemhr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagementsystemhr.Service.LeaveDetailService;
import com.leavemanagementsystemhr.entities.LeaveDetailEntity;

@RestController
@RequestMapping("/LeaveDetail")
public class LeaveDetailController {
	@Autowired
	private LeaveDetailService leaveRequestService;
	
	@GetMapping("/test")
	public String test() {
		System.out.println("test");
		return "bindhu";
	}
	
	
	
	@PostMapping("/leave-requests/{leaveId}/validate-medical-report")
	public LeaveDetailEntity medicalReport(@PathVariable long leaveId, @RequestBody boolean isValid) {
		System.out.println("Controller");
		return leaveRequestService.medicalReport(leaveId, isValid);
	
	
//	@PostMapping("/MedicalReport")
//	public LeaveDetailEntity MedicalReport(@RequestBody LeaveDetailEntity leaveDetailEntity) {
//		return
//				LeaveDetailService.medicalReport(leaveDetailEntity.getLeaveId(),
//				leaveDetailEntity.getMedicalReport());
//	}		
		
	}
	

}
