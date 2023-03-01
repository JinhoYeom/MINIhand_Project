package com.greedy.DTO;

public class MemberDTO {
	int memberCode;
	int	memberId;
	int memberpwd;
	String memberName;
	public MemberDTO(int memberCode, int memberId, int memberpwd, String memberName) {
		super();
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberpwd = memberpwd;
		this.memberName = memberName;
	}
	public int getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberpwd() {
		return memberpwd;
	}
	public void setMemberpwd(int memberpwd) {
		this.memberpwd = memberpwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "MemberDTO [memberCode=" + memberCode + ", memberId=" + memberId + ", memberpwd=" + memberpwd
				+ ", memberName=" + memberName + "]";
	}
}
