package com.greedy.member.service;

import org.apache.ibatis.session.SqlSession;

import com.greedy.DTO.MemberDTO;
import com.greedy.member.dao.MemberinMapper;
import static com.greedy.common.Template.getSqlSession;

public class MemberinService {

	MemberinMapper mapper;
	
	public boolean memberJoin(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberinMapper.class);
		
		int result = mapper.memberJoin(member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result>0? true: false;
		
	}


}
