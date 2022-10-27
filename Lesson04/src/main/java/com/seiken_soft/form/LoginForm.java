/**
 * 
 */
package com.seiken_soft.form;

/**
 * 勤怠画面Form
 * @author Masashi_T
 *
 */
public class LoginForm {
	
	/** 社員ID */
	private String employeeId;
	// パスワード
	private String pass;

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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
