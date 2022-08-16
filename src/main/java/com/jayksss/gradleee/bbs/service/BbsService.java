package com.jayksss.gradleee.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayksss.gradleee.bbs.mapper.BbsMapper;
import com.jayksss.gradleee.bbs.model.Bbs;

@Service
public class BbsService {

	@Autowired
	public BbsMapper bbsMapper;

	/**
	 * 게시판 목록 조회
	 */
	public List<Bbs> selectBbsList() {
		return bbsMapper.selectBbsList();
	}
}