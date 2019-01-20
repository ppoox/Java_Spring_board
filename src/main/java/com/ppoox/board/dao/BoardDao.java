package com.ppoox.board.dao;

import java.util.List;

import com.ppoox.board.dto.BoardDto;

public interface BoardDao {
	public void boardInsert(BoardDto dto);
	public void boardDelete(int dNum);
	public List<BoardDto> getList(BoardDto dto);
	public int rowCount();
}
