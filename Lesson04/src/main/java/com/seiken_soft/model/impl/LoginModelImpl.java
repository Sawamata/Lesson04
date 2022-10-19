package com.seiken_soft.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiken_soft.dao.MEmployeeMapper;
import com.seiken_soft.dao.MUserMapper;
import com.seiken_soft.entity.MEmployee;
import com.seiken_soft.entity.MUser;
import com.seiken_soft.entity.MUserWithBLOBs;
import com.seiken_soft.model.LoginModel;

@Transactional
@Service
public class LoginModelImpl implements LoginModel {
	
	/** 　⇒パッケージ名を「com.seiken_soft.model」とし、インターフェース名を「LoginModel」（ログイン画面用のモデルインターフェース）とする
	　⇒パッケージ名を「com.seiken_soft.model.impl」とし、クラス名を「LoginModelImpl」（ログイン画面用のモデル）とする
	　　※実装するメソッド名、変数名は任意だが、見て用途がわかる名前にすること
	　　　ただし、「LoginModelImpl」クラスでSQLの実行結果を返却するところまでを行う
	　　　⇒DB接続はフレームワーク側で行うため実装しない。
	　　　　またSQLはMyBatisを使用するためｘｍｌに記載するため実装しない。ただしテーブル結合を行うようなSQLを作成する場合は「Login.xml」の名前でxml形式で作成する。
	　　　beanクラスを作成してもよい。ただしパッケージは分けること
	
	３）正しい社員IDと正しいパスワードを入力し、ログインボタンを押下した場合に、
	その社員IDでログインするのが初めての場合はパスワード変更画面が表示されることを確認する
４）正しい社員IDと正しいパスワードを入力し、ログインボタンを押下した場合に、
その社員IDでログインするのが2回目以降の場合はメニュー画面が表示されることを確認する


	社員ID
	パスワードをマスターからとってくる
	
	*/


	/** MEmployeeマッパー */
	@Autowired
	private MEmployeeMapper employeeInfo;


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
	@Override
	public MEmployee existMember(String employeeId) {

		// 社員情報を取得
		MEmployee employee = employeeInfo.selectByPrimaryKey(employeeId);
		return employee;
	}
	
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
public MUser retryPlus(String employeeId) {

	// 社員情報を取得
	MUser mUser = userInfo.selectByPrimaryKey(employeeId);
	return mUser;
}
}
