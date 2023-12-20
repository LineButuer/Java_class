package ch11_array.ex6;

import ch11_array.ex5.BoardService;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽");
            System.out.println("1.고객 등록 2.잔액 조회 3.입금 4.츨금 5인.거래내역확 6.계좌이체 7.종료");
            System.out.println("△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲");
            int choice = scanner.nextInt();
            if (choice == 1) {
                bankService.register();
            } else if (choice == 2) {
                bankService.balanceCheck();
            } else if (choice == 3) {
                bankService.deposit();
            }
        }

    }
}
