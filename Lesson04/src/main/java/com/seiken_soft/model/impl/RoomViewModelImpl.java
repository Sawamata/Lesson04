package com.seiken_soft.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiken_soft.dao.TRoomMapper;
import com.seiken_soft.dao.TRoommemberMapper;
import com.seiken_soft.entity.TRoom;
import com.seiken_soft.entity.TRoomExample;
import com.seiken_soft.entity.TRoommember;
import com.seiken_soft.entity.TRoommemberExample;
import com.seiken_soft.entity.TRoommemberKey;
import com.seiken_soft.model.RoomViewModel;

@Transactional
@Service
public class RoomViewModelImpl implements RoomViewModel {
	
	/** 　４）
	４）入室ボタン押下時に、ルームメンバーテーブルの該当ルームナンバーの該当ログインユーザーのチェックインフラグを「1：入室済」に更新する
	５）ルームメンバーテーブルの該当ルームナンバーの全てのチェックインフラグが「1：入室済」になった場合、ルームテーブルのロックフラグを「1：ロック済」に更新する
	　　その後、ルームトーク画面に遷移する


T_ROOM
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| ROOM_NUMBER | char(10)    | NO   | PRI | NULL    |       |
| ROOM_NAME   | varchar(40) | YES  |     | NULL    |       |
| BACK_COLOR  | char(7)     | YES  |     | NULL    |       |
| LOCK_FLG    | char(1)     | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+

T_ROOMMember
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| ROOM_NUMBER   | char(10)    | NO   | PRI | NULL    |       |
| EMPLOYEE_ID   | char(10)    | NO   | PRI | NULL    |       |
| EMPLOYEE_NAME | varchar(20) | YES  |     | NULL    |       |
| CHECK_IN_FLG  | char(1)     | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
	*/


	/** TRoomマッパー */
	@Autowired
	private TRoomMapper room;


	/** TRoommemberマッパー */
	@Autowired
	private TRoommemberMapper roommember;

	/**
	 * ルームテーブル取得
	 * 
	 */	
	public List<TRoom> selectAllRoomTable () {
		

//		TRoom updateInfoTroom = new TRoom();		
		TRoomExample tRoomExample = new TRoomExample();
		
		com.seiken_soft.entity.TRoomExample.Criteria criteriaTroom = tRoomExample.createCriteria();
		criteriaTroom.getAllCriteria();
				
		List<TRoom> allRoom = room.selectByExample(tRoomExample);
		return allRoom;
			

	}
	
	/**
	 * ルームメンバーテーブルのログインユーザー有無判定
	 * 
	 */	
	public boolean checkLoginUser(String roonNumber) {
	    Long renban = (long) 1;

		TRoommemberExample tRoommemberExample = new TRoommemberExample();
//		TPasswordHistoryWithBLOBs tPasswordHistoryWithBLOBs = new TPasswordHistoryWithBLOBs();
		
//		String joken = "EMPLOYEE_ID = " + employeeId;
		
		com.seiken_soft.entity.TRoommemberExample.Criteria criteriaTroommember = tRoommemberExample.createCriteria();
		criteriaTroommember.andRoomNumberEqualTo(roonNumber);
		
		List tRoomMemberCheckList = roommember.selectByExample(tRoommemberExample);


//		TPasswordHistoryExampleb tPasswordHistoryExample = PassList.get(i);

		if (tRoomMemberCheckList.size() == 0) {
			
				return false;
		} else {

		return true;
	}
	}

//	MUserWithBLOBs mUserInfo = roommember.selectByPrimaryKey(employeeId);
//
////	// DBアップデート
////	// ロックフラグを1（ロック済み）にする
//	mUserInfo.setPassword("1");
////	mUserInfo.retryCount = retryCount + 1;		
//	userInfo.updateByPrimaryKey(mUserInfo);
	

	public void updateCheckFlg (String roomNumber) {
		TRoommemberKey tRoommemberKey = new TRoommemberKey();
		tRoommemberKey.setRoomNumber(roomNumber);
		
		
		
//		TRoomExample tRoomExample = new TRoomExample();
//		
//		com.seiken_soft.entity.TRoomExample.Criteria criteriaTroomT = tRoomExample.createCriteria();
//		criteriaTroomT.andRoomNumberEqualTo(roomNumber);
		
		tRoommemberKey.setEmployeeId("9999999999");
		TRoommember tRoommember = roommember.selectByPrimaryKey(tRoommemberKey);
//		tRoommember.setRoomNumber(roomNumber);
//		int tRoommemberr = roommember.updateByPrimaryKey(tRoommember);
//		tRoommember.setRoomNumber(roomNumber);

//		// DBアップデート
//		// チェックインフラグを「1：入室済」
		tRoommember.setCheckInFlg("1");
//		mUserInfo.retryCount = retryCount + 1;		
		roommember.updateByPrimaryKey(tRoommember);
		
//		ルームメンバーテーブルの該当ルームナンバーの全てのチェックインフラグが「1：入室済」になった場合、ルームテーブルのロックフラグを「1：ロック済」に更新する
//		　　その後、ルームトーク画面に遷移する

		TRoommemberExample tRoommemberExample = new TRoommemberExample();
		
		com.seiken_soft.entity.TRoommemberExample.Criteria criteriaTroomTm = tRoommemberExample.createCriteria();
		criteriaTroomTm.andRoomNumberEqualTo(roomNumber).andCheckInFlgNotEqualTo("1");
		

		long roomMCount = roommember.countByExample(tRoommemberExample);
		

		if (roomMCount == 0) {

			TRoom tRoomM = room.selectByPrimaryKey(roomNumber);
//			tRoommember.setRoomNumber(roomNumber);
//			int tRoommemberr = roommember.updateByPrimaryKey(tRoommember);
//			tRoommember.setRoomNumber(roomNumber);

//			// DBアップデート
//			// ロックフラグを「1：ロック済」
			tRoomM.setLockFlg("1");
//			mUserInfo.retryCount = retryCount + 1;		
			room.updateByPrimaryKey(tRoomM);
		} 

	}


}
