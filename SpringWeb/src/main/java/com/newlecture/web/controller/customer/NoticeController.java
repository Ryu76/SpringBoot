package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@RequestMapping("list") // 기능 : list, detail, edit, reg, del
	public String list(Model model) {
		
		model.addAttribute("test", "Hello~ ");
		
//		return "customer/notice/list"; ResourceViewResolver
		return "customer.notice.list"; // TileVIewResolver
		
	}
	
	@RequestMapping("detail") // 기능 : list, detail, edit, reg, del
	public String detail() {
		
		
		return "customer.notice.detail";
		
	}
}
