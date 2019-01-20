package com.ppoox.board.dao;

import java.util.List;

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

	@Override
	public List<BoardDto> getList(BoardDto dto) {
		List<BoardDto> list=sqlSession.selectList("selectList",dto);
		return list;
	}

	@Override
	public int rowCount() {
		int rowCount=sqlSession.selectOne("rowCount");
		return rowCount;
	}

}
