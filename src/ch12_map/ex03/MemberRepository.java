package ch12_map.ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean save(MemberDTO memberDTO){
        MemberDTO mbDTO = memberDTOMap.put(memberDTO.getMemberId(), memberDTO);
        System.out.println("mbDTO = " + mbDTO);
        if(mbDTO==null){
            return true;
        }
        return false;
    }

    public MemberDTO login(String memberemail, String memberpassword){
        for(Long i : memberDTOMap.keySet()) {
            if (memberemail.equals(memberDTOMap.get(i).getMemberEmail()) && memberpassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                return memberDTOMap.get(i);
            }
        } return null;
    }

    public Map<Long, MemberDTO>findAll(){
        return memberDTOMap;
    }

    public boolean update(String email, String mobile){
        for(Long i : memberDTOMap.keySet()){
            if(email.equals(memberDTOMap.get(i).getMemberEmail())){
                memberDTOMap.get(i).setMemberMobile(mobile);
                return true;
            }
        }return false;
    }

    public boolean delete(String email, String password){
        for(Long i : memberDTOMap.keySet()){
            if(password.equals(memberDTOMap.get(i).getMemberPassword())&&email.equals(memberDTOMap.get(i).getMemberEmail())){

                memberDTOMap.remove(i);
                return true;
            }
        }return false;
    }
}
