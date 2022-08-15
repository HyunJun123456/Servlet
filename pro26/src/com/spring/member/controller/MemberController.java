package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.member.vo.MemberVO;

public interface MemberController {

	ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	ModelAndView addMember(MemberVO member, HttpServletRequest request, HttpServletResponse response) throws Exception;
	ModelAndView removeMember(String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception;


}
