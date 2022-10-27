/**
 * 
 */
package com.seiken_soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seiken_soft.form.ChangePasswordForm;
import com.seiken_soft.form.LoginForm;
import com.seiken_soft.model.impl.ChangePasswordModelImpl;

/**
 *
 *
 */
@Controller
@RequestMapping("/changePassword")
public class ChangePasswordController {
	
	@Autowired
	@Qualifier("changePasswordModelImpl")

	private ChangePasswordModelImpl changePasswordModel;
//	private LoginModel loginl;

	/**
	 * 初期表示
	 * 
	 * @return mav 画面					
２）現パスワードのテキストボックスに現在のパスワードを入力し、新パスワードのテキストボックスに新しいパスワードを入力して、
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
		ChangePasswordForm changePasswordForm = new ChangePasswordForm();
		
		// 画面初期表示null回避用
		String eId = "";
		String pass = "";
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
////		MEmployee employee = changePasswordModel.existMember(employeeId);
//		if (employee == null) {
////			社員IDが存在しませんと表示させる
//	        mav.addObject("msg", "社員IDが存在しません");
//			mav.addObject("loginForm", form);
//			mav.setViewName("login");
//			return mav;
//		}
		


		// タイムスタンプのセット
//		mav.addObject("strDateTime", strDateTime);

		mav.addObject("loginForm", form);
		mav.setViewName("login");
		return mav;

	}

}
