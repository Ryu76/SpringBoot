package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

//@RestController
@Controller("adminNoticeCOntroller")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list") // 기능 : list, detail, edit, reg, del
	public String list(Model model) {
		
		model.addAttribute("test", "Hello~ ");
		
		List<Notice> list = service.getList();
		
		return "admin.board.notice.list";
		
	}
	
	@RequestMapping("detail") // 기능 : list, detail, edit, reg, del
	public String detail() {
		
		Notice notice = service.get(1);
		
		return "admin.board.notice.detail";
		
	}
	@RequestMapping("reg") // 기능 : list, detail, edit, reg, del
	public String reg() {
		
		
		return "admin.board.notice.reg";
		
	}
}
