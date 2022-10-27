package com.seiken_soft.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiken_soft.dao.MUserMapper;
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
//	@Autowired
//	private MEmployeeMapper employeeInfo;


	/** MUserマッパー */
	@Autowired
	private MUserMapper userInfo;

	/**
	 * 社員存在チェック
	 * 
	 * @param employeeId 社員ID
	 * @param deleteFlg 削除フラグ
	 * @param lockFlg ロックフラグ
	 * @param password パスワード
	 * @return 社員情報
	 */
	
	public List<String> mUser (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);

//		// 削除フラグを取得
		String del_Flg = mUserInfo.getDeleteFlg();
//		// ロックフラグを取得
		String lock_Flg = mUserInfo.getLockFlg();
//
//		// パスワードを取得
		String Pass = mUserInfo.getPassword();

		List<String> values = new ArrayList<>();
		
		values.add(del_Flg);
		values.add(lock_Flg);
		values.add(Pass);

		return values;
	}
	public int retryPlus (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);
		int retryCount = mUserInfo.getRetryCount();

//		// リトライ回数を＋1
		retryCount = retryCount + 1;
		
		System.out.println(retryCount);

//		// DBアップデート
		mUserInfo.setRetryCount(retryCount);
//		mUserInfo.retryCount = retryCount + 1;		
		userInfo.updateByPrimaryKey(mUserInfo);

		return retryCount;
	}
	public void userLock (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);		

//		// DBアップデート
//		// ロックフラグを1（ロック済み）にする
		mUserInfo.setLockFlg("1");
//		mUserInfo.retryCount = retryCount + 1;		
		userInfo.updateByPrimaryKey(mUserInfo);

	}
	public void userUnlock (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);		

//		// DBアップデート
//		// ロックフラグを0（未ロック）にする
		mUserInfo.setLockFlg("0");
//		mUserInfo.retryCount = retryCount + 1;		
		userInfo.updateByPrimaryKey(mUserInfo);

	}
	public void delFlgZero (String employeeId) {

		MUserWithBLOBs mUserInfo = userInfo.selectByPrimaryKey(employeeId);		

//		// DBアップデート
//		// 削除フラグを0（未ロック）にする
		mUserInfo.setDeleteFlg("0");
//		mUserInfo.retryCount = retryCount + 1;		
		userInfo.updateByPrimaryKey(mUserInfo);

	}

}
