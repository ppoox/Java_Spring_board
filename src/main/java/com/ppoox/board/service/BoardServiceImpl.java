package com.ppoox.board.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppoox.board.dao.BoardDao;
import com.ppoox.board.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void boardInsert(BoardDto dto) {
		boardDao.boardInsert(dto);
	}

	@Override
	public void boardDelete(int dNum) {
		boardDao.boardDelete(dNum);
		
	}

}
