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
                    run = false;
                } else {
                    System.out.println("등록 실패");
                }
            }

        }
    }

    public void balanceCheck() {
        System.out.println("계좌번호를 입력하세요.");
        String account = scanner.next();
        ClientDTO result = bankRepository.balance(account);
        if (result != null) {
            System.out.println("해당 계좌의 잔액은 " + result.getBalance() + "입니다.");
        } else {
            System.out.println("해당 계좌 번호는 없는 계좌입니다.");
        }
    }

    public void deposit() {
        System.out.println("입금 하실 계좌 번호를 입력해 주세요.");
        String accountNumber = scanner.next();
        System.out.println("입금 하실 금액을 입력해 주세요.");
        long deposit = scanner.nextLong();
        ClientDTO clientDTO = bankRepository.balance(accountNumber);
        if (clientDTO != null) {
            boolean result = bankRepository.deposit(accountNumber, deposit);
            if (result) {
                System.out.println("입금 되었습니다.");
            } else {
                System.out.println("입금에 실패 했습니다.");
            }
        } else {
            System.out.println("해당 계좌는 존재 하지 않는 계좌 입니다.");
        }

    }

    public void withdraw() {
        System.out.println("출금 하실 계좌 번호를 입력해 주세요.");
        String accountNumber = scanner.next();
        System.out.println("계좌 비밀 번호를 입력해 주세요.");
        String clientPassword = scanner.next();
        ClientDTO clientDTO = bankRepository.balance((accountNumber));
        if (clientDTO != null && clientPassword.equals(clientDTO.getClientPassword())) {
            System.out.println("출금 하실 금액을 입력해 주세요.");
            long money = scanner.nextLong();
            boolean result = bankRepository.withdraw(accountNumber, money);
            if (result) {
                System.out.println("츨금 되었습니다.");
            } else {
                System.out.println("출금에 실패했습니다.");
            }
        } else {
            System.out.println("해당 계좌가 존재 하지 않거나, 비밀 번호가 틀렸습니다.");
        }
    }

    public void bankList() {
        System.out.println("계좌 번호를 입력해 주세요.");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.balance(accountNumber);
        boolean run = true;
        if (clientDTO != null) {
            while (run) {
                System.out.println("-------------------------------------");
                System.out.println("1.모든 내역 2.입금 내역 3.출금 내역 4.종료");
                System.out.println("-------------------------------------");
                System.out.print("선택 > ");
                int select = scanner.nextInt();
                List<AccountDTO> accountDTOList = bankRepository.bankList(accountNumber);
                if (accountDTOList.size() > 0) {
                    if (select == 1) {
                        for (AccountDTO accountDTO : accountDTOList) {
                            System.out.println("거래 내역 = " + accountDTO);
                        }
                    } else if (select==4) {
                        run =false;
                    } else if (select==2) {
                        for (AccountDTO accountDTO : accountDTOList){
                            if (accountDTO.getWithdraw()==0){
                                System.out.println("입금 내역 = " + accountDTO);
                            }
                        }
                    } else if (select==3) {
                        for(AccountDTO accountDTO : accountDTOList){
                            if(accountDTO.getDeposit()==0){
                                System.out.println("출금 내역 = " + accountDTO);
                            }
                        }
                    }
                }else {
                    System.out.println("거래 내역이 없습니다.");
                    run=false;
                }
            }
        }else {
            System.out.println("해당 계좌는 존재 하지 않습니다.");
        }
    }
    public void transfer(){
        System.out.println("보내실 분의 계좌 번호를 입력해주세요.");
        String accountNumberFrom = scanner.next();
        System.out.println("받으실 분의 계좌 번호를 입력해주세요.");
        String accountNumberTo = scanner.next();
        System.out.println("보내실 금액을 입력해주세요.");
        long money =scanner.nextLong();
    }
}