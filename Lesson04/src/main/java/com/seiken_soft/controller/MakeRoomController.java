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
import com.seiken_soft.entity.TRoom;
import com.seiken_soft.entity.TRoomplus;
import com.seiken_soft.form.MakeRoomForm;
import com.seiken_soft.model.impl.LoginModelImpl;
import com.seiken_soft.model.impl.MakeRoomModelImpl;
import com.seiken_soft.model.impl.RoomViewModelImpl;

/**
 *
 *
 */
@Controller
@RequestMapping("/makeRoom")
public class MakeRoomController {
	
	@Autowired
	@Qualifier("makeRoomModelImpl")

	private MakeRoomModelImpl makeRoomModel;

	@Autowired
	@Qualifier("loginModelImpl")

	private LoginModelImpl loginModel;
	
	@Autowired
	@Qualifier("roomViewModelImpl")

	private RoomViewModelImpl roomViewModelImpl;

	/**
	 * ログインボタン押下時
	 * @return mav 画面
	 */
	@RequestMapping(value = "/makeRoomSakusei", method = RequestMethod.POST)
	public ModelAndView makeRoomsakusei(MakeRoomForm form, ModelAndView mav) {


		// ルーム名
		String roomNameId = form.getRoomName();
		// 参加メンバーユーザーID　一人目
		String firstUserId = form.getFirstUserId();
		// 参加メンバーユーザーID　二人目
		String secondUserId = form.getSecondUserId();
		// 参加メンバーユーザーID　三人目
		String thirdUserId = form.getThirdUserId();
		// 参加メンバーユーザーID　四人目
		String forthUserId = form.getForthUserId();
		// 参加メンバーユーザーID　五人目
		String fifthUserId = form.getFifthUserId();

		// 社員IDリスト
		List<String> idList = new ArrayList<>();
		// 社員名リスト
		List<String> nameList = new ArrayList<>();

//		if (!firstUserId.equals("")) {
//		if (StringUtils.isEmpty(firstUserId)) {
		if (firstUserId != null) {
			// 一人目の社員IDに入力がある場合
			// 社員の存在チェック
			MEmployee firstUserEmployee = loginModel.existMember(firstUserId);
			if (firstUserEmployee == null) {
				// 社員が存在していなかったらエラーメッセージ表示
		        mav.addObject("msg", "参加メンバーユーザーID　一人目の社員IDが存在しません");
				mav.addObject("makeRoomForm", form);
				mav.setViewName("makeRoom");
				return mav;				
			} else {
				// 社員が存在してたら社員名を取得
				String firstUserName = firstUserEmployee.getEmployeeName();	
	//			リストにつめる
				idList.add(firstUserId);
				nameList.add(firstUserName);
			}
		}
		
		if (secondUserId != null) {
			// 二人目の社員IDに入力がある場合
			// 社員の存在チェック
			MEmployee secondUserEmployee = loginModel.existMember(secondUserId);
			if (secondUserEmployee == null) {
				// 社員が存在していなかったらエラーメッセージ表示
		        mav.addObject("msg", "参加メンバーユーザーID　二人目の社員IDが存在しません");
				mav.addObject("makeRoomForm", form);
				mav.setViewName("makeRoom");
				return mav;				
			} else {
				// 社員が存在してたら社員名を取得
				String secondUserName = secondUserEmployee.getEmployeeName();	
	//			リストにつめる
				idList.add(secondUserId);
				nameList.add(secondUserName);	
			}
		}
		
		if (thirdUserId != null) {
			
			// 三人目の社員IDに入力がある場合
			// 社員の存在チェック
			MEmployee thirdUserEmployee = loginModel.existMember(thirdUserId);
			if (thirdUserEmployee == null) {
				// 社員が存在していなかったらエラーメッセージ表示
		        mav.addObject("msg", "参加メンバーユーザーID　三人目の社員IDが存在しません");
				mav.addObject("makeRoomForm", form);
				mav.setViewName("makeRoom");
				return mav;
			} else {
				// 社員が存在してたら社員名を取得
				String thirdUserName = thirdUserEmployee.getEmployeeName();		
//				リストにつめる
				idList.add(thirdUserId);
				nameList.add(thirdUserName);			
			}
		}
		
		if (forthUserId != null) {
			// 四人目の社員IDに入力がある場合
			// 社員の存在チェック
			MEmployee forthUserEmployee = loginModel.existMember(forthUserId);
			if (forthUserEmployee == null) {
				// 社員が存在していなかったらエラーメッセージ表示
		        mav.addObject("msg", "参加メンバーユーザーID　四人目の社員IDが存在しません");
				mav.addObject("makeRoomForm", form);
				mav.setViewName("makeRoom");
				return mav;
			} else {
				// 社員が存在してたら社員名を取得
				String forthUserName = forthUserEmployee.getEmployeeName();				
//				リストにつめる
				idList.add(forthUserId);
				nameList.add(forthUserName);			
			}
		}
		
		if (fifthUserId != null) {
			// 五人目の社員IDに入力がある場合
			// 社員の存在チェック
			MEmployee fifthUserEmployee = loginModel.existMember(fifthUserId);
			if (fifthUserEmployee == null) {
				// 社員が存在していなかったらエラーメッセージ表示
		        mav.addObject("msg", "参加メンバーユーザーID　五人目の社員IDが存在しません");
				mav.addObject("makeRoomForm", form);
				mav.setViewName("makeRoom");
				return mav;
			} else {
				// 社員が存在してたら社員名を取得
				String fifthUserName = fifthUserEmployee.getEmployeeName();					
//				リストにつめる
				idList.add(fifthUserId);
				nameList.add(fifthUserName);			
			}
		}


//		　　　ルームテーブル・ルームメンバーテーブルに情報登録する
		makeRoomModel.makeRecordRoomAndRoomMenber(roomNameId, idList, nameList);
		

//		ルーム一覧を配置し、ルームナンバー、ルーム名、入室ボタンを配置する（ルームテーブルの行数分）
//		ルームテーブル取得
		List<TRoom>  tableList = roomViewModelImpl.selectAllRoomTable();
		System.out.println(tableList.size());
		
		

		// 入室ボタン表示判定フラグリスト
		List<TRoomplus> tRoomplusList = new ArrayList<>();

		for (int i = 0; i < tableList.size(); i++) {
				TRoom tRoombean = tableList.get(i);
				String lockFlg =tRoombean.getLockFlg();
				String roomNumber =tRoombean.getRoomNumber();
				String roomName =tRoombean.getRoomName();
				TRoomplus tRoomplus = new TRoomplus();
				
				tRoomplus.setLockFlg(lockFlg);
				tRoomplus.setRoomNumber(roomNumber);
				tRoomplus.setRoomName(roomName);
				
				if (lockFlg.equals("1")) {
//					３）ルームテーブルのロックフラグが「１：ロック済」の場合は、入室ボタンを非活性にする
	//				1 非活性をセット
					tRoomplus.setNyushitsuButtonHyojiFlg("1");
				} else {
	//				３）入室ボタンはルームメンバーテーブルにログインユーザーが未登録の場合は非表示とする
	//				roommember.insert(updateInfoTRoommember);
	
					if (roomViewModelImpl.checkLoginUser(tRoombean.getRoomNumber())) {
						//	0 表示をセット
						tRoomplus.setNyushitsuButtonHyojiFlg("0");
	
					} else {
	//					2 非表示をセット
						tRoomplus.setNyushitsuButtonHyojiFlg("2");

					}
					
				}
				tRoomplusList.add(tRoomplus);
			}
		
		
		
		
		

		mav.addObject("tRoomList", tRoomplusList);
//		mav.addObject("buttonList", nyushitsuButtonHyojiList);
//			mav.addObject("makeRoomForm", form);
//			mav.setViewName("makeRoom");
			mav.setViewName("makeView");
			return mav;

	}

}
