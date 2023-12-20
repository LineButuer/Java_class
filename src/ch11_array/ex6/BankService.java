package ch11_array.ex6;

import java.util.List;
import java.util.Scanner;

public class BankService {
    Scanner scanner = new Scanner(System.in);
    BankRepository bankRepository = new BankRepository();
    public void register() {
        boolean run = true;
            System.out.println("이름을 적어 주세요.");
            String clientName = scanner.next();
        while (run) {
            System.out.println("희망 하는 계좌 번호를 적어 주세요.");
            String accountNumber = scanner.next();
            boolean check = bankRepository.accountCheck(accountNumber);
            if (check) {
                System.out.println("해당 계좌번호는 존재하는 계좌번호 입니다. 다시 입력해주세요");
            } else {
                System.out.println("희망 하는 계좌 비밀 번호를 적어 주세요.");
                String accountPassword = scanner.next();
                ClientDTO clientDTO = new ClientDTO(clientName, accountNumber, accountPassword);
                boolean result = bankRepository.register(clientDTO);
                if (result) {
                    System.out.println("등록 완료");
                    run=false;
                } else {
                    System.out.println("등록 실패");
                }
            }

        }
    }

    public void balanceCheck(){
        System.out.println("계좌번호를 입력하세요.");
        String account = scanner.next();
        ClientDTO result = bankRepository.balance(account);
        if(result !=null){
            System.out.println("해당 계좌의 잔액은 " + result.getBalance()+"입니다.");
        }else {
            System.out.println("해당 계좌번호는 없는 계좌입니다.");
        }
    }

    public void deposit(){
        System.out.println("입금하실 계좌번호를 입력해주세요.");
        String account =scanner.next();
        System.out.println("입금하실 금액을 입력해주세요.");
        long deposit =scanner.nextLong();
        ClientDTO clientDTO =bankRepository.balance(account);
        if(clientDTO !=null){
            boolean result = bankRepository.deposit(account, deposit);
            if(result){
                System.out.println("입금되었습니다.");
            }else {
                System.out.println("입금에 실패했습니다.");
            }
        }else {
            System.out.println("해당 계좌는 존재하지 않는 계좌입니다.");
        }

    }

}
