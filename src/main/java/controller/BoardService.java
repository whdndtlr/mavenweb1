package controller;

import org.springframework.stereotype.Service;

import board.model.PageBoard;


public interface BoardService {

	PageBoard list(int requestPage);

	PageBoard searchList(String field, String search, int requestPage);
	

}
