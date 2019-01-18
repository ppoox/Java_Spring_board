package com.ppoox.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ppoox.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void boardInsert(BoardDto dto) {
		sqlSession.insert("insert",dto);
	}

	@Override
	public void boardDelete(int dNum) {
		sqlSession.delete("delete",dNum);
	}

}
