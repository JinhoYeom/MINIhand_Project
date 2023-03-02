package com.greedy.member.controller;

import javax.swing.JOptionPane;

import com.greedy.DTO.MemberDTO;
import com.greedy.member.service.MemberLoginService;
import com.greedy.member.service.MemberinService;

public class MemberController {
	
	MemberLoginService memberLoginService = new MemberLoginService();
	MemberinService memberinService = new MemberinService();
	MemberDTO member;

	public boolean joinMember(String memberId, String memberPwd, char[] pwd) {

		String strPwd = new StringBuilder().append(pwd).toString();
		boolean result = false;
		
		if(strPwd != null && strPwd != "" && memberPwd != "") {
			if(strPwd.equals(strPwd)) {

				member = new MemberDTO();
				member.setMemberId(memberId);
				member.setMemberpwd(memberPwd);
				
				result = memberinService.memberJoin(member);
			} else {
				JOptionPane.showMessageDialog(null, "입력한 아이디와 비밀번호 확인이 일치하지 않습니다.",
						"비밀번호 재입력!", JOptionPane.DEFAULT_OPTION);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "아이디, 비밀번호, 닉네임 중 하나를 비워두었습니다.",
					"모든 항목을 작성해주세요", JOptionPane.DEFAULT_OPTION);
		}
		
		return result;
	}

	public MemberDTO loginMember(String memberId, char[] pw) {
		

		MemberDTO member = new MemberDTO();
		
		member.setMemberId(memberId);
		member.setMemberpwd(new StringBuilder().append(pw).toString());
		
		MemberDTO result = memberLoginService.loginCheck(member);
		
		return result;
	}

}
