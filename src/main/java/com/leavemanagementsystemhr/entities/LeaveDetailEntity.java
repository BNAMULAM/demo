package com.leavemanagementsystemhr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.leavemanagementsystemhr.enums.LeaveStatus;
import com.leavemanagementsystemhr.enums.LeaveType;

@Entity
@Table(name = "LeaveDetail")
public class LeaveDetailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long leaveId;
	private long employeeId;
	private LeaveType leaveType;
	private int noOfDays;
	private long approverId;
	private LeaveStatus  status;
	private String comments;
	private boolean medicalReport;
	
	public LeaveDetailEntity() {
		super();
	
	}

	public LeaveDetailEntity(long leaveId, long employeeId, LeaveType leaveType, int noOfDays, long approverId,
			LeaveStatus status, String comments, boolean medicalReport) {
		super();
		this.leaveId = leaveId;
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.noOfDays = noOfDays;
		this.approverId = approverId;
		this.status = status;
		this.comments = comments;
		this.medicalReport = medicalReport;
	}

	public long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public long getApproverId() {
		return approverId;
	}

	public void setApproverId(long approverId) {
		this.approverId = approverId;
	}

	public LeaveStatus getStatus() {
		return status;
	}

	public void setStatus(LeaveStatus status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean getMedicalReport() {
		return medicalReport;
	}

	public void setMedicalReport(boolean medicalReport) {
		this.medicalReport = medicalReport;
	}

	@Override
	public String toString() {
		return "LeaveDetailEntity [leaveId=" + leaveId + ", employeeId=" + employeeId + ", leaveType=" + leaveType
				+ ", noOfDays=" + noOfDays + ", approverId=" + approverId + ", status=" + status + ", comments="
				+ comments + ", medicalReport=" + medicalReport + "]";
	}



}
