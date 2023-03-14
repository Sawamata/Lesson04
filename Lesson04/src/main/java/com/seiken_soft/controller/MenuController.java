/**
 * 
 */
package com.seiken_soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seiken_soft.form.MakeRoomForm;

/**
 *
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
	

	/**
	 * ログインボタン押下時
	 * @return mav 画面
	 */
	@RequestMapping(value = "/makeRoom", method = RequestMethod.POST)
	public ModelAndView makeRoom(MakeRoomForm form, ModelAndView mav) {
		
			mav.addObject("makeRoomForm", form);
			mav.setViewName("makeRoom");
			return mav;

	}

}
