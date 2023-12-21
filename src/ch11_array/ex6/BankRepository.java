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

    public boolean deposit(String accountNumber, long deposit ) {


        for(ClientDTO clientDTO : clientDTOList){
            if(accountNumber.equals(clientDTO.getAccountNumber())){
                long a = clientDTO.getBalance(); // 기존 잔액값을 가져와야 함
                a+=deposit; // 기존 잔액 + 입금액 => 잔액
                clientDTO.setBalance(a); // 해당 고객의 잔액 값으로 저장

                AccountDTO accountDTO =new AccountDTO(accountNumber, deposit, 0);
                accountDTOList.add(accountDTO);
                return true;

            }
        }

        //        for (int i = 0; i < clientDTOList.size(); i++) {
//            if (account.equals(clientDTOList.get(i).getAccountNumber())) {
//                long a=clientDTOList.get(i).getBalance();
//                a+=deposit;
//                clientDTOList.get(i).setBalance(a);
//            }
//        }
    return false;
    }

    public boolean withdraw(String accountNumber, long money) {
        for (ClientDTO clientDTO : clientDTOList){
            if (accountNumber.equals(clientDTO.getAccountNumber())){
                if (money>clientDTO.getBalance()){
                    System.out.println("잔액이 부족 합니다.");
                    return false;
                }
                long balance = clientDTO.getBalance();
                 balance -= money;
                clientDTO.setBalance(balance);
                return true;
            }
        }return false;
    }

    public List<AccountDTO> bankList(String accountNumber){
        List<AccountDTO>bankList = new ArrayList<>();
        for(AccountDTO accountDTO : accountDTOList){
            if(accountNumber.equals(accountDTO.getAccountNumber())){
                bankList.add(accountDTO);

            }
        }return bankList;

    }






}

