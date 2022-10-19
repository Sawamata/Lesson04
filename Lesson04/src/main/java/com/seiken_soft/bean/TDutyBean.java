/**
 * 
 */
package com.seiken_soft.bean;

/**
 * T_DutyのBean
 * @author Masashi_T
 *
 */
public class TDutyBean {
	
	/** 日付 */
	private String dutyDate;
	
	/** 出勤時刻 */
	private String workFromTime;
	
	/** 退勤時刻 */
	private String workToTime;

	/**
	 * 日付の取得
	 * @return dutyDate 日付
	 */
	public String getDutyDate() {
		return dutyDate;
	}

	/**
	 * 日付のセット
	 * @param dutyDate 日付
	 */
	public void setDutyDate(String dutyDate) {
		this.dutyDate = dutyDate;
	}

	/**
	 * 出勤時刻の取得
	 * @return workFromTime 出勤時刻
	 */
	public String getWorkFromTime() {
		return workFromTime;
	}

	/**
	 * 出勤時刻のセット
	 * @param workFromTime 出勤時刻
	 */
	public void setWorkFromTime(String workFromTime) {
		this.workFromTime = workFromTime;
	}

	/**
	 * 退勤時刻の取得
	 * @return workToTime 退勤時刻
	 */
	public String getWorkToTime() {
		return workToTime;
	}

	/**
	 * 退勤時刻のセット
	 * @param workToTime 退勤時刻
	 */
	public void setWorkToTime(String workToTime) {
		this.workToTime = workToTime;
	}
	

}
