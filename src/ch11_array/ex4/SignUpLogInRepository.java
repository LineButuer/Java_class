package ch11_array.ex4;


import java.util.ArrayList;
import java.util.List;

public class SignUpLogInRepository {
   private static List<SignUpLogInDTO>signUpLogInDTOList = new ArrayList<>();

   public boolean signUp(SignUpLogInDTO signUpLogInDTO){
      return signUpLogInDTOList.add(signUpLogInDTO);

   }

   public List<SignUpLogInDTO> findAll(){
      return signUpLogInDTOList;
   }


   public boolean login(String loginEmail, String password) {
     boolean result = false;

     for(int i =0; i<signUpLogInDTOList.size(); i++){
         if(loginEmail.equals(signUpLogInDTOList.get(i).getMemberEmail())){
            if(password.equals(signUpLogInDTOList.get(i).getMemberPassword())){
               result = true;
            }
         }else {
            result = false;
         }
      } return result;
   }

   public SignUpLogInDTO findById(Long id){
      SignUpLogInDTO signUpLogInDTO = null;
      for(SignUpLogInDTO signUpLogInDTO1 : signUpLogInDTOList) {
         if (id.equals(signUpLogInDTO1.getId())) {
            signUpLogInDTO = signUpLogInDTO1;
         }
      }return signUpLogInDTO;
   }


   public boolean update(String email ,String mobile) {
      boolean result = false;
       for (SignUpLogInDTO signUpLogInDTO : signUpLogInDTOList) {
           if (mobile.equals(signUpLogInDTO.getMemberMobile())) {
               signUpLogInDTO.setMemberMobile(mobile);
           }
       }
       return true;
   }

   public boolean delete(String email){
      boolean result = false;

      for (int i = 0; i < signUpLogInDTOList.size(); i++) {
         if (email.equals(signUpLogInDTOList.get(i).getMemberEmail())) {
            signUpLogInDTOList.remove(i);
            result = true;
         }
      }
      return result;
   }
}
