/**
 * 
 */
package com.seiken_soft.model;

import com.seiken_soft.entity.MEmployee;

/**
 * 勤怠画面業務インターフェース
 * 
 * @author Masashi_T
 */
public interface LoginModel {

	/**
	 * 社員存在チェック
	 * 
	 * @param employeeId 社員ID
	 * @return 社員情報
	 */
	public MEmployee existMember(String employeeId);


}
