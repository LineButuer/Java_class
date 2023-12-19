package practice.ex;

public class MemberDTO {
    private String memberEmail;
    private String memberPassword;
    private String membername;
    private String memberMobile;
    private Long memberId;

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public MemberDTO(){

}
    private static Long idValue = 1L;
    public MemberDTO(String memberEmail, String memberPassword, String membername, String memberMobile) {
        this.memberId = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.membername = membername;
        this.memberMobile = memberMobile;
    }

}
