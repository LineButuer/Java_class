package ch10_class.ex10;

public class Member_teacher {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public Member_teacher() {
    }

    public Member_teacher(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }

    /*
     *  로그인 처리 메서드
     *    name: memberLogin
     *    parameter: memberEmail, memberPassword
     *    return type: boolean
     *    실행내용: 이메일, 비밀번호가 일치하면 true,
     *              일치하지 않으면 false 리턴
     */
    public boolean memberLogin(String memberEmail, String memberPassword) {
        boolean result = false;
        if (memberEmail.equals(this.memberEmail) && memberPassword.equals(this.memberPassword)) {
//            return true;
            result = true;
        } else {
//            return false;
            result = false;
        }
        return result;
    }
}
