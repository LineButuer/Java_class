package ch11_array.ex7_memberboard.service;

import ch11_array.ex7_memberboard.dto.BoardDTO;
import ch11_array.ex7_memberboard.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

import static ch11_array.ex7_memberboard.common.CommonVariables.loginEmail;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner =new Scanner(System.in);
    public void boardWrite() {
        if (loginEmail != null) {
            System.out.println("제목");
            String title = scanner.next();
            System.out.println("내용");
            String contents = scanner.next();
            BoardDTO boardDTO = new BoardDTO(title, loginEmail, contents);
            boolean result = boardRepository.write(boardDTO);
            if (result) {
                System.out.println("글작성 완료");
            }else {
                System.out.println("글작성에 실패했습니다.");
            }
        }
    }
    public void boardList(){
        List<BoardDTO> boardDTO = boardRepository.boardList();
        if(boardDTO!=null){
            System.out.println("boardDTO = " + boardDTO);
        }
    }
    public void findById(){

    }
}


