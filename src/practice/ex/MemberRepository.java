package practice.ex;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean sign(MemberDTO memberDTO) {

        return memberDTOList.add(memberDTO);
    }


    public boolean login(String email, String password) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++)
            if (email.equals(memberDTOList.get(i).getMemberEmail()) && password.equals(memberDTOList.get(i).getMemberPassword())) {
                result = true;

            }

        return result;
    }
}
