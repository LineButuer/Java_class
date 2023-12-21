package ch11_array.ex7_memberboard.repository;

import ch11_array.ex7_memberboard.common.CommonVariables;
import ch11_array.ex7_memberboard.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    static List<MemberDTO> memberDTOList=new ArrayList<>();
    public boolean signUp(MemberDTO memberDTO){
        return memberDTOList.add(memberDTO);

    }

    public boolean emailCheck(String memberEmail){
        for(MemberDTO memberDTO : memberDTOList){
            if(memberEmail.equals(memberDTO.getMemberEmail())){
                return true;
            }
        }return false;
    }

    public MemberDTO login(String memberEmail, String memberPassword){
        for(MemberDTO memberDTO : memberDTOList){
            if(memberEmail.equals(memberDTO.getMemberEmail())&&memberPassword.equals(memberDTO.getMemberPassword())){
                return memberDTO;
            }
        }return null;
    }
    public MemberDTO memberList(){
        for(MemberDTO memberDTO : memberDTOList){
            return memberDTO;
        }return null;
    }

    public boolean editPassword(String email, String password){
        for(MemberDTO memberDTO : memberDTOList){
            if (email.equals(memberDTO.getMemberEmail())){
                memberDTO.setMemberPassword(password);
                return true;
            }
        } return false;
    }
    public boolean editName(String email, String password){
        for(MemberDTO memberDTO : memberDTOList){
            if (email.equals(memberDTO.getMemberEmail())){
                memberDTO.setMemberPassword(password);
                return true;
            }
        } return false;
    }
}



