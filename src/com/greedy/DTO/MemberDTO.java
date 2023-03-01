package com.greedy.DTO;

public class MemberDTO {
	int memberCode;
	String	memberId;
	String memberpwd;
	int memberscore;


	public MemberDTO(){}


	public MemberDTO(int memberCode, String memberId, String memberpwd, int memberscore) {
		super();
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberpwd = memberpwd;
		this.memberscore = memberscore;
	}


	public int getMemberCode() {
		return memberCode;
	}


	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberpwd() {
		return memberpwd;
	}


	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}


	public int getMemberscore() {
		return memberscore;
	}


	public void setMemberscore(int memberscore) {
		this.memberscore = memberscore;
	}


	@Override
	public String toString() {
		return "MemberDTO [memberCode=" + memberCode + ", memberId=" + memberId + ", memberpwd=" + memberpwd
				+ ", memberscore=" + memberscore + "]";
	}
}
