package ch12_map.ex03;

public class MemberDTO {
        private String memberEmail;
        private String memberPassword;
        private String memberName;
        private String memberMobile;
        private Long memberId;

        @Override
        public String toString() {
            return "memberDTO{" +
                    "memberEmail='" + memberEmail + '\'' +
                    ", memberPassword='" + memberPassword + '\'' +
                    ", memberName='" + memberName + '\'' +
                    ", memberMobile='" + memberMobile + '\'' +
                    ", memberId=" + memberId +
                    '}';
        }

        private static Long idValue = 1L;

        public MemberDTO(String memberEmail, String memberPassword, String memberName, String memberMobile) {
            this.memberId = idValue++;
            this.memberEmail = memberEmail;
            this.memberPassword = memberPassword;
            this.memberName = memberName;
            this.memberMobile = memberMobile;
        }

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

        public Long getMemberId() {
            return memberId;
        }

        public void setMemberId(Long memberId) {
            this.memberId = memberId;
        }
}
