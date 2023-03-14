package com.seiken_soft.model.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiken_soft.model.RoomViewModel;

@Transactional
@Service
public class RoomViewModelImpl implements RoomViewModel {
	
	/** 　４）作成ボタン押下時にルームテーブルに「ルーム番号（連番）」、「ルーム名」、「ロックフラグ（0：未ロック）」を登録し、
　　ルームメンバーテーブルに「ルーム番号（連番）」、「社員ID」、「社員名」、「チェックインフラグ（0：未入室）」を登録する
　　その後、ルーム一覧画面に遷移する	


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


//	/** TRoomマッパー */
//	@Autowired
//	private TRoomMapper room;
//
//
//	/** TRoommemberマッパー */
//	@Autowired
//	private TRoommemberMapper roommember;
//
//	/**
//	 * ルームテーブル・ルームメンバーテーブル登録
//	 * 
//	 * @param roomNo ルーム番号
//	 * @param roomName ルーム名
//	 * @param lockFlg ロックフラグ
//	 * @param roomName 社員ID　ログインしたユーザーのをもってくるかここで取得
//	 * @param roomName 社員名　ログインしたユーザーのをもってくるかここで取得
//	 */	
//	public void makeRecordRoomAndRoomMenber (String roomName, List<String> idList,List<String> nameList) {
//		
////		ルームテーブル登録
//
////		TRoom updateInfoTroom = new TRoom();	
//		TRoom updateInfoTroom = new TRoom();		
//		TRoomExample tRoomExample = new TRoomExample();
//		
//		com.seiken_soft.entity.TRoomExample.Criteria criteriaTroom = tRoomExample.createCriteria();
//		criteriaTroom.andRoomNumberIsNotNull();
//		
//		long roomCount = room.countByExample(tRoomExample);
//		
//
//		String roomNumber = "";
//		if (roomCount == 0) {
//			roomNumber = "1";
//		} else {
//			roomNumber = Long.toString(roomCount + 1);
//		}
//		System.out.println(roomNumber);
//
////		// ルーム番号（連番）
//		updateInfoTroom.setRoomNumber(roomNumber);
////		// ルーム名は入力した値
//		updateInfoTroom.setRoomName(roomName);
////		// ロックフラグを1（ロック済み）にする
//		updateInfoTroom.setLockFlg("1");
////		mUserInfo.retryCount = retryCount + 1;		
//		room.insert(updateInfoTroom);
//		
//
////		ルームメンバーテーブル登録
//
//
//		TRoommember updateInfoTRoommember = new TRoommember();
////		TRoommemberExample updateInfoTRoommemberE = new TRoommemberExample();
//
////		入力したメンバー分登録
//		for (int i = 0; i < idList.size(); i++) {
//			String eId = idList.get(i);
//			String eName = nameList.get(i);
//			
////			// ルーム番号（連番）
//			updateInfoTRoommember.setRoomNumber(roomNumber);
////			// 社員ID
//			updateInfoTRoommember.setEmployeeId(eId);
////			// 社員名
//			updateInfoTRoommember.setEmployeeName(eName);
////			// チェックインフラグ（0：未入室）
//			updateInfoTRoommember.setCheckInFlg("0");
////			// チェックインフラグ（0：未入室）
//			updateInfoTRoommember.setCheckInFlg("0");
//			
//			roommember.insert(updateInfoTRoommember);
//			
//			}
//
//	}

}
