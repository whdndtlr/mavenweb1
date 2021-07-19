package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.model.PageBoard;

@Service("boardservice")
public class BoardServiceImpl implements BoardService{
	@Resource(name="boarddao")
	BoardDAO dao;

	public PageBoard list(int requestPage) {
		
		return dao.list(requestPage);
	}
	
	public PageBoard searchList(String field, String search, int requestPage) {
		
		return dao.searchList(field, search, requestPage);
	}

}
