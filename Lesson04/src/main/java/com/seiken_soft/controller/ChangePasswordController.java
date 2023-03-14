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
		/** 社員ID */
		String employeeId= "";
		// 新パスワード
		String currentPass = "";
		// 新パスワード
		String newPass = "";
		// 新パスワード（確認）
		String newPassKknn = "";
		// ハッシュ化回数
		int hashCount = 0;


		// 初期値は空欄を表示	99999の削除フラグ9にもどしてためすこと！
		changePasswordForm.setEmployeeId(employeeId);

		changePasswordForm.setCurrentPass(currentPass);

		changePasswordForm.setNewPass(newPass);

		changePasswordForm.setNewPassKknn(newPassKknn);

		changePasswordForm.setHashCount(hashCount);
		
		mav.addObject("changePasswordForm", changePasswordForm);
		mav.setViewName("changePassword");
		return mav;
	}
	/**
	 * ログインボタン押下時
	 * @return mav 画面
	 */
	@RequestMapping(value = "/passCheck", method = RequestMethod.POST)
	public ModelAndView passCheck(ChangePasswordForm form, ModelAndView mav) {


		// 社員ID
		String employeeId = form.getEmployeeId();
		// 旧パスワード
		String currentPass = form.getCurrentPass();
		// 新パスワード
		String newPass = form.getNewPass();
		// 新パスワード（確認）
		String newPassKknn = form.getNewPassKknn();
		// ハッシュ化回数
		int hashCount = form.getHashCount();
		
//		①aと②c新パスワードと新パスワード（確認）の内容が一致しない場合はエラーメッセージを表示する
		if (!newPass.equals(newPassKknn)) {			
	        mav.addObject("msg", "新パスワードと新パスワード（確認）の内容が違います。");
			mav.addObject("changePasswordForm", form);
			mav.setViewName("changePassword");
			return mav;
		}

		// 社員IDで検索し削除フラグを取得する
		String delFlg = changePasswordModel.getDelFlg(employeeId);
		// 社員IDで検索し現パスワードを取得する
		String dbCurrentPass = changePasswordModel.getCurrentPass(employeeId);
		
		// 取得した現パスワードをハッシュ化回数分ハッシュ化する
		String hashDbCurrentPass = changePasswordModel.getHashStr(dbCurrentPass, hashCount);
		System.out.println(hashDbCurrentPass); 

		// パスワード変更可否フラグ
//		boolean changeFlg = false;
		
if (delFlg.equals("0")) {

			if (!dbCurrentPass.equals(currentPass)) {
//				a取得したパスワードと現パスワードの内容が一致しない場合はエラーメッセージを表示する
		        mav.addObject("msg", "現パスワードが間違っています。");
				mav.addObject("changePasswordForm", form);
				mav.setViewName("changePassword");
				return mav;
			} else if (newPass.equals(currentPass)) {
//				b現パスワードと新パスワードの内容が一致する場合はエラーメッセージを表示する
		        mav.addObject("msg", "新パスワードは、すでに現パスワードとして使用されています。");
				mav.addObject("changePasswordForm", form);
				mav.setViewName("changePassword");
				return mav;
				
			}
			
			
			/**a）
		　　　　e）パスワード履歴テーブルを社員IDで検索し、パスワードのリストを取得する。
		パスワードのリストが新パスワードと一致する場合はエラーメッセージを表示する
		mysql> SELECT * FROM T_Password_History;
+-------------+--------+------------+------------+
| EMPLOYEE_ID | RENBAN | PASSWORD   | HASH_COUNT |
+-------------+--------+------------+------------+
| 9999999999  |      1 | 9999999990 |          1 |
+-------------+--------+------------+------------+
	 */

			// 過去に使用したことのあるパスワードかどうかのチェック
			if (changePasswordModel.checkPassHistory(employeeId)) {
				// 過去に使用したことがない場合
				// 新パスワードの内容をハッシュ化回数分だけハッシュ化
				String hashNewPass = changePasswordModel.getHashStr(newPass, hashCount);

				// ユーザーマスタのパスワードを更新
				changePasswordModel.updatePass(hashNewPass);

				if (delFlg.equals("9")) {
					// 削除フラグが「9：初期フラグ」の場合は削除フラグを「0：未削除」に更新する

						changePasswordModel.delFlgZero(employeeId);
//						　　　またパスワード履歴テーブルに社員ID、連番＋１の値、ハッシュ化した新パスワードで登録する。

				        mav.addObject("msg", "パスワードを変更しました。");
				} 
				
			} else {
				// 過去に使用したことがある場合
		        mav.addObject("msg", "新パスワードは、過去に使用したことがあります。違うパスワードを新パスワードにしてください。");
				mav.addObject("changePasswordForm", form);
				mav.setViewName("changePassword");
				return mav;
				
			};
			
			
//			
		}
		/**３）　２）①と２）②でエラーとならなかった場合、新パスワードの内容をハッシュ化回数分だけハッシュ化し、
		 * ユーザーマスタのパスワードを更新する。
		　　　その際、削除フラグが「9：初期フラグ」の場合は削除フラグを「0：未削除」に更新する
		　　　またパスワード履歴テーブルに社員ID、連番＋１の値、ハッシュ化した新パスワードで登録する。
		４）メニュー画面を作成し、ルーム作成ボタン、ルーム一覧ボタン、パスワード変更ボタンを配置する
	 */

		


		// タイムスタンプのセット
//		mav.addObject("strDateTime", strDateTime);

			mav.addObject("changePasswordForm", form);
			mav.setViewName("changePassword");
		return mav;

	}


}
