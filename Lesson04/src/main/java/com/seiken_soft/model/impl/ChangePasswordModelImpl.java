package com.seiken_soft.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiken_soft.dao.MEmployeeMapper;
import com.seiken_soft.dao.MUserMapper;
import com.seiken_soft.dao.TPasswordHistoryMapper;
import com.seiken_soft.entity.MUserWithBLOBs;
import com.seiken_soft.model.ChangePasswordModel;

@Transactional
@Service
public class ChangePasswordModelImpl implements ChangePasswordModel {
	
	/** 　２）現パスワードのテキストボックスに現在のパスワードを入力し、新パスワードのテキストボックスに新しいパスワードを入力して、
　新パスワード（確認）のテキストボックスに新しいパスワードを入力し、ハッシュ化回数のテキストボックスに数値を入力し、変更ボタンを押下する
　　①ユーザーマスタを社員IDで検索しデータを取得する。そのデータの削除フラグが「9：初期フラグ」の場合
　　　　a）新パスワードと新パスワード（確認）の内容が一致しない場合はエラーメッセージを表示する
　　　　b）ハッシュ化回数が数値でない場合はエラーメッセージを表示する
　　②ユーザーマスタを社員IDで検索しデータを取得する。そのデータの削除フラグが「0：未削除」の場合
　　　　a）取得したパスワードと現パスワードの内容が一致しない場合はエラーメッセージを表示する
　　　　b）現パスワードと新パスワードの内容が一致する場合はエラーメッセージを表示する
　　　　c）新パスワードと新パスワード（確認）の内容が一致しない場合はエラーメッセージを表示する
　　　　d）ハッシュ化回数が数値でない場合はエラーメッセージを表示する
　　　　e）パスワード履歴テーブルを社員IDで検索し、パスワードのリストを取得する。パスワードのリストが新パスワードと一致する場合はエラーメッセージを表示する
３）　２）①と２）②でエラーとならなかった場合、新パスワードの内容をハッシュ化回数分だけハッシュ化し、ユーザーマスタのパスワードを更新する。
　　　その際、削除フラグが「9：初期フラグ」の場合は削除フラグを「0：未削除」に更新する
　　　またパスワード履歴テーブルに社員ID、連番＋１の値、ハッシュ化した新パスワードで登録する。
４）メニュー画面を作成し、ルーム作成ボタン、ルーム一覧ボタン、パスワード変更ボタンを配置する

	
	*/


	/** MEmployeeマッパー */
	@Autowired
	private MEmployeeMapper employeeInfo;


	/** MUserマッパー */
	@Autowired
	private MUserMapper userInfo;
	
	/** TPasswordHistoryマッパー */
	@Autowired
	private TPasswordHistoryMapper tPassHistory;

	

	/**
	 * 削除フラグ取得
	 * 
	 * @param employeeId 社員ID
	 * @return 削除フラグ
	 */
	public String getDelFlg (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);

//		// 削除フラグを取得
		String del_Flg = mUserInfo.getDeleteFlg();

		return del_Flg;
	}
	
	/**
	 * 現パスワード取得
	 * 
	 * @param employeeId 社員ID
	 * @return 現パスワード
	 */
	public String getCurrentPass (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);

//		// 現パスワードを取得
		String currentPass = mUserInfo.getPassword();

		return currentPass;
	}
	
	/**
	 * パスワードリストチェック
	 * 
	 * @param employeeId 社員ID
	 * @return 過去に使用されたことのあるパスワードかどうか
	 */
	/**a）
　　　　e）パスワード履歴テーブルを社員IDで検索し、パスワードのリストを取得する。
パスワードのリストが新パスワードと一致する場合はエラーメッセージを表示する	 */
//	public String checkPassHistory (String employeeId) {
//
//		TPasswordHistory tPasswordHistory = tPassHistory.selectByPrimaryKey(employeeId);
//
////		// 現パスワードを取得
//		String currentPass = mUserInfo.getPassword();
//
//		return currentPass;
//	}

}
