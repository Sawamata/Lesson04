/**
 * 
 */
package com.seiken_soft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seiken_soft.entity.MEmployee;
import com.seiken_soft.form.LoginForm;
import com.seiken_soft.model.impl.LoginModelImpl;

/**
 *
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	/** 勤怠登録業務 */
//	@Autowired
//	@Qualifier("loginModel")
//	@Qualifier("loginModelImpl")
//	private LoginModel loginModel;
//	private LoginModel loginl;
	
	@Autowired
	@Qualifier("loginModelImpl")

	private LoginModelImpl loginModel;
//	private LoginModel loginl;

	/**
	 * 初期表示
	 * 
	 * @return mav 画面					
２）社員IDのテキストボックスに社員IDを入力し、パスワードのテキストボックスにパスワードを入力し、ログインボタンを押下する						
　　①ユーザーマスタに社員IDが存在し、削除フラグが「9：初期フラグ」の場合、パスワード変更画面に遷移する						
　　②ユーザーマスタに社員IDが存在し、削除フラグが「1：削除済」の場合、ログインエラーメッセージを表示する						
　　③ユーザーマスタに社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが「1：ロック済」の場合、ログインエラーメッセージを表示する						
　　④ユーザーマスタの社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが「０：未ロック」の場合かつ、パスワードが一致しない場合、ログインエラーメッセージを表示する。						
　　　またユーザーマスタのリトライ回数を＋1して更新する						
　　　ユーザーマスタのリトライ回数が３になったら、ロックフラグを「1：ロック済」に更新する						
　　⑤ユーザーマスタの社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが「０：未ロック」の場合かつ、パスワードが一致する場合、メニュー画面に遷移する。						
　　　またユーザーマスタのリトライ回数を0に更新する						
+------------------+----------+------+-----+---------+-------+
| Field            | Type     | Null | Key | Default | Extra |
+------------------+----------+------+-----+---------+-------+
| EMPLOYEE_ID      | char(10) | NO   | PRI | NULL    |       |
| PASSWORD         | text     | YES  |     | NULL    |       |
| HASH_COUNT       | int(11)  | YES  |     | NULL    |       |
| FONT_COLOR       | char(7)  | YES  |     | NULL    |       |
| BACKGROUND_COLOR | char(7)  | YES  |     | NULL    |       |
| USER_IMAGE       | text     | YES  |     | NULL    |       |
| RETRY_COUNT      | int(11)  | YES  |     | NULL    |       |
| LOCK_FLG         | char(1)  | YES  |     | NULL    |       |
| DELETE_FLG       | char(1)  | YES  |     | NULL    |       |
+------------------+----------+------+-----+---------+-------+
+-------------+------------+------------+------------+------------------+------------+-------------+----------+------------+
| EMPLOYEE_ID | PASSWORD   | HASH_COUNT | FONT_COLOR | BACKGROUND_COLOR | USER_IMAGE | RETRY_COUNT | LOCK_FLG | DELETE_FLG |
+-------------+------------+------------+------------+------------------+------------+-------------+----------+------------+
| 1010101010  | 1010101010 | 1010101010 | #000000    | #cccccc          | image      |  1010101010 | 1        | 0          |
| 1111111111  | 1111111111 | 1111111111 | #000000    | #cccccc          | image      |  1111111111 | 0        | 1          |
| 1234567891  | 1234567891 | 1234567891 | #000000    | #cccccc          | image      |  1234567891 | 0        | 0          |
| 9999999999  | 9999999999 |  999999999 | #000000    | #cccccc          | image      |   999999999 | 0        | 9          |
+-------------+------------+------------+------------+------------------+------------+-------------+----------+------------+

	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView init(ModelAndView mav) {



		// 勤怠画面フォームのインスタンスを生成
		LoginForm loginForm = new LoginForm();
		
		// 画面初期表示null回避用
		String eId = "";
		String pass = "";

		loginForm.setEmployeeId(eId);

		loginForm.setPass(pass);
		
		mav.addObject("loginForm", loginForm);
		mav.setViewName("login");
		return mav;
	}

	/**
	 * ログインボタン押下時
	 * @return mav 画面
	 */
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(LoginForm form, ModelAndView mav) {
		

		// 社員ID
		String employeeId = form.getEmployeeId();

		// 画面入力したパスワード
		String inputPass = form.getPass();

		// 社員の存在チェック
		MEmployee employee = loginModel.existMember(employeeId);
		if (employee == null) {
//			社員IDが存在しませんと表示させる
	        mav.addObject("msg", "社員IDが存在しません");
			mav.addObject("loginForm", form);
			mav.setViewName("login");
			return mav;
		}
		
//		String del_Flg = null;
//		String lock_Flg = null;
//		String dbPass = null;


		List<String> values = new ArrayList<>();
		String deleteFlg = null;
		String lockFlg = null;
		String password = null;
		values = loginModel.mUser(employeeId);
		
		deleteFlg = values.get(0);
		lockFlg = values.get(1);
		password = values.get(2);
		// 削除フラグ
////		String del_Flg = form.getDel_Flg ();
//		deleteFlg = "0";
//		// ロックフラグ
//		lockFlg = "0";
//		// DBに登録されてるパスワード
//		password = "0";
		

		// 入力したパスワード
//		String inPass = form.getPass ();
		

			if (deleteFlg.equals("9")) {
//				ユーザーマスタに社員IDが存在し、削除フラグが「9：初期フラグ」の場合、パスワード変更画面に遷移する
				mav.setViewName("changePassword");
			} else if (deleteFlg.equals("1")) {
//				②ユーザーマスタに社員IDが存在し、削除フラグが「1：削除済」の場合、ログインエラーメッセージを表示する
//				mav.addObject("message", "削除済みです");
				
			} else if (deleteFlg.equals("0")) {
				if (lockFlg.equals("1")) {
//					③ユーザーマスタに社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが
//					「1：ロック済」の場合、ログインエラーメッセージを表示する
				} else if (lockFlg.equals("0")) {
//					ユーザーマスタの社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが「０：未ロック」の場合かつ、
					
					if (!inputPass.equals(password)) {
//						パスワードが一致しない場合、ログインエラーメッセージを表示する。	
//						　　　またユーザーマスタのリトライ回数を＋1して更新する						
//						　　　ユーザーマスタのリトライ回数が３になったら、ロックフラグを「1：ロック済」に更新する
						
											
					} else if(inputPass.equals(password)) {
//						⑤ユーザーマスタの社員IDが存在し、削除フラグが「0：未削除」の場合、かつロックフラグが「０：未ロック」の場合かつ、
//						パスワードが一致する場合、メニュー画面に遷移する。						
//						　　　またユーザーマスタのリトライ回数を0に更新する	

						mav.setViewName("menu");
					}
					
				}
//			②ユーザーマスタに社員IDが存在し、削除フラグが「1：削除済」の場合、ログインエラーメッセージを表示する
			}
			


		// タイムスタンプのセット
//		mav.addObject("strDateTime", strDateTime);

		mav.addObject("loginForm", form);
		mav.setViewName("login");
		return mav;

	}

}
