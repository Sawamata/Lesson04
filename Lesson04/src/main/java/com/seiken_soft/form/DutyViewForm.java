/**
 * 
 */
package com.seiken_soft.form;

import java.util.List;

import com.seiken_soft.bean.TDutyBean;

/**
 * 当月出退勤画面Form
 * @author Masashi_T
 *
 */
public class DutyViewForm {
	
	/** 社員ID */
	private String employeeId;
	
	/** 出退勤リスト */
	private List<TDutyBean> workingJobList;
	
	/**
	 * 社員IDの取得
	 * @return employeeId 社員ID
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * 社員IDのセット
	 * @parma employeeId 社員ID
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * 出退勤リストの取得
	 * @return workingJobList 出退勤リスト
	 */
	public List<TDutyBean> getWorkingJobList() {
		return workingJobList;
	}

	/**
	 * 出退勤リストのセット
	 * @param workingJobList 出退勤リスト
	 */
	public void setWorkingJobList(List<TDutyBean> workingJobList) {
		this.workingJobList = workingJobList;
	}

}
