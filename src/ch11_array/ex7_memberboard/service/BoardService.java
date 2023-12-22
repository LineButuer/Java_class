package ch11_array.ex7_memberboard.service;

import ch11_array.ex7_memberboard.dto.BoardDTO;

import java.util.Scanner;

import static ch11_array.ex7_memberboard.common.CommonVariables.loginEmail;

public class BoardService {
    public void boardWrite() {
        if (loginEmail != null) {
            System.out.println("제목");
            String title = scanner.next();
            System.out.println("내용");
            String contents = scanner.next();
            BoardDTO boardDTO = new BoardDTO(title, loginEmail, contents);
            if (boardDTO != null) {
                System.out.println("글작성 완료");
            }
        }
    }

}


