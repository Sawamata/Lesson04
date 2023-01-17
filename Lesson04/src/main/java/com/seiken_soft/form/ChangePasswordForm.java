/**
 * 
 */
package com.seiken_soft.form;

/**
 * 勤怠画面Form
 * @author Masashi_T
 *
 */
public class ChangePasswordForm {
	
	/** 社員ID */
	private String employeeId;
	// 現パスワード
	private String currentPass;
	// 新パスワード
	private String newPass;
	// 新パスワード（確認）
	private String newPassKknn;
	// ハッシュ化回数
	private int hashCount;

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
	 * @return currentPass
	 */
	public String getCurrentPass() {
		return currentPass;
	}

	/**
	 * @param currentPass セットする currentPass
	 */
	public void setCurrentPass(String currentPass) {
		this.currentPass = currentPass;
	}

	/**
	 * @return newPass
	 */
	public String getNewPass() {
		return newPass;
	}

	/**
	 * @param newPass セットする newPass
	 */
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	/**
	 * @return newPassKknn
	 */
	public String getNewPassKknn() {
		return newPassKknn;
	}

	/**
	 * @param newPassKknn セットする newPassKknn
	 */
	public void setNewPassKknn(String newPassKknn) {
		this.newPassKknn = newPassKknn;
	}

	/**
	 * @return hashCount
	 */
	public int getHashCount() {
		return hashCount;
	}

	/**
	 * @param hashCount セットする hashCount
	 */
	public void setHashCount(int hashCount) {
		this.hashCount = hashCount;
	}

}
