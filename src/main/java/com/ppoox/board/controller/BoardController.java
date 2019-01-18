package com.ppoox.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ppoox.board.dto.BoardDto;
import com.ppoox.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/boardinsert", method=RequestMethod.POST)
	public String boardInsert(HttpServletRequest request) {
		BoardDto dto=new BoardDto();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardInsert(dto);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/home");
		return "redirect:/";
	}
	
	@RequestMapping(value="/boarddelete", method=RequestMethod.POST)
	public ModelAndView boardDelete(HttpServletRequest request) {
//		int dNum=Integer.parseInt(request.getParameter("dNum"));
//		boardService.boardDelete(dNum);
		System.out.println("delete");
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/home");
		return mView;
	}
	
}
