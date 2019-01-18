package com.ppoox.board.service;

import javax.servlet.http.HttpServletRequest;

import com.ppoox.board.dto.BoardDto;

public interface BoardService {
	public void boardInsert(BoardDto dto);
	public void boardDelete(int dNum);

}
