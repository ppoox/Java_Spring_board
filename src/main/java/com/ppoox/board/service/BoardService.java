package com.ppoox.board.service;

import org.springframework.web.servlet.ModelAndView;
import com.ppoox.board.dto.BoardDto;

public interface BoardService {
	public void boardInsert(BoardDto dto);
	public void boardDelete(int dNum);
	public ModelAndView getList(BoardDto dto);

}
