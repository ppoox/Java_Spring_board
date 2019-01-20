package com.ppoox.board;

import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ppoox.board.dto.BoardDto;
import com.ppoox.board.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		BoardDto dto=new BoardDto();
		ModelAndView mView=boardService.getList(dto);
		mView.setViewName("home");
		return mView;
	}
}
