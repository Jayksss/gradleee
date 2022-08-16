package com.jayksss.gradleee.bbs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayksss.gradleee.bbs.model.Bbs;
import com.jayksss.gradleee.bbs.service.BbsService;

@RestController
@RequestMapping("/bbs")
public class BbsController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BbsService bbsService;
	
	/**
	 * 게시판 목록 조회
	 * @param model
	 * @return List
	 */
	@PostMapping("/bbsList")
	public List<Bbs> bbsList(Model model) {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		List<Bbs> list = bbsService.selectBbsList();
		logger.info("list >>> {}", list);
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return list;
	}
}