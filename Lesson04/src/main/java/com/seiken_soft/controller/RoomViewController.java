/**
 * 
 */
package com.seiken_soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seiken_soft.entity.TRoom;
import com.seiken_soft.model.impl.RoomViewModelImpl;

/**
 *
 *
 */
@Controller
@RequestMapping("/roomView")
public class RoomViewController {
	

	@Autowired
	@Qualifier("roomViewModelImpl")

	private RoomViewModelImpl roomViewModelImpl;

	/**
	４）入室ボタン押下時に、ルームメンバーテーブルの該当ルームナンバーの該当ログインユーザーのチェックインフラグを「1：入室済」に更新する
	５）ルームメンバーテーブルの該当ルームナンバーの全てのチェックインフラグが「1：入室済」になった場合、ルームテーブルのロックフラグを「1：ロック済」に更新する
	　　その後、ルームトーク画面に遷移する
	 */

	@RequestMapping(value = "/checkin", method = RequestMethod.POST, params = "nyushitsuBtn")
	public ModelAndView checkin(TRoom form, ModelAndView mav, HttpServletRequest request) {


		String roomNumber = request.getParameter("nyushitsuBtn");
//		ルームメンバーテーブルの該当ルームナンバーの該当ログインユーザーのチェックインフラグを「1：入室済」に更新する
		

		roomViewModelImpl.updateCheckFlg(roomNumber);
		
		
		
		mav.setViewName("roomTalk");
		return mav;
	}


}
