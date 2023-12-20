package ch11_array.ex6;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientDTOList = new ArrayList<>();
    List<AccountDTO> accountDTOList = new ArrayList<>();

    public boolean register(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);

    }

    public boolean accountCheck(String accountNumber) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    public ClientDTO balance(String account) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (account.equals(clientDTO.getAccountNumber())) {
                return clientDTO;
            }
        }
        return null;
    }

    public boolean deposit(String account, long deposit ) {


        for(ClientDTO clientDTO : clientDTOList){
            if(account.equals(clientDTO.getAccountNumber())){
                long a = clientDTO.getBalance();
                a+=deposit;
                clientDTO.setBalance(a);

                String at ="";
                AccountDTO accountDTO =new AccountDTO(account, deposit, 0, at);
                accountDTOList.add(accountDTO);


            }
        }
        return true;
        //        for (int i = 0; i < clientDTOList.size(); i++) {
//            if (account.equals(clientDTOList.get(i).getAccountNumber())) {
//                long a=clientDTOList.get(i).getBalance();
//                a+=deposit;
//                clientDTOList.get(i).setBalance(a);
//            }
//        }
    }
}

