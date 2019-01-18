package com.ppoox.board.dao;

import com.ppoox.board.dto.BoardDto;

public interface BoardDao {
	public void boardInsert(BoardDto dto);
	public void boardDelete(int dNum);
}
