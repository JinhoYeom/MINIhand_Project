package com.greedy.member.service;
import static com.greedy.common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.greedy.DTO.MemberDTO;
import com.greedy.member.dao.MemberLoginMapper;

public class MemberLoginService {
		
		public MemberDTO loginCheck(MemberDTO member) {
			
			SqlSession sqlSession = getSqlSession();
			
			MemberLoginMapper memberMapper = sqlSession.getMapper(MemberLoginMapper.class);
			
			MemberDTO result = memberMapper.loginCheckMember(member);
			
			sqlSession.close();
			
			return result;
		
	}

}
