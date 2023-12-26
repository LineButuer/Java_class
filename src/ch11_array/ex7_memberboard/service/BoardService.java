package ch11_array.ex7_memberboard.service;

import ch11_array.ex7_memberboard.dto.BoardDTO;
import ch11_array.ex7_memberboard.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

import static ch11_array.ex7_memberboard.common.CommonVariables.loginEmail;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

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
            } else {
                System.out.println("글작성에 실패했습니다.");
            }
        }
    }

    public void boardList() {
        List<BoardDTO> boardDTO = boardRepository.boardList();
        if (boardDTO != null) {
            for (int i = 0; i < boardDTO.size(); i++) {
                System.out.println(" 제목" + " 작성자" + " 조회수 " + "시간 ");
                System.out.println(boardDTO.get(i).getBoardTitle() + " " + boardDTO.get(i).getBoardWriter() + " " + boardDTO.get(i).getBoardHits() + " " + boardDTO.get(i).getCreatedAt());
                System.out.println(" ");
            }
        }
    }

    public void findById() {
        System.out.println("조회할 글번호를 입력하세요");
        Long id = scanner.nextLong();
        BoardDTO result = boardRepository.findById(id);
        if (result != null) {
            System.out.println(result);
            System.out.println("글을 불러왔습니다.");
        } else {
            System.out.println("해당하는 글번호가 없습니다.");
        }
    }

    public void boardEdit() {
        System.out.println("수정할 글번호");
        Long id = scanner.nextLong();
        boolean result = boardRepository.emailCheck(loginEmail);
        if (result) {
            System.out.println("수정할 내용");
            String editContents = scanner.next();
            BoardDTO boardDTO = boardRepository.boardEdit(id, editContents);
            if (boardDTO != null) {
                System.out.println("수정이 완료되었습니다.");
            }
        } else {
            System.out.println("글을 수정할 권한이 없습니다.");
        }
    }

    public void boardDelete() {
        boolean result = boardRepository.emailCheck(loginEmail);
        if (result) {
            System.out.println("삭제할 글번호를 입력하세요");
            Long id = scanner.nextLong();
            BoardDTO boardDTO = boardRepository.boardDelete(id);
            if (boardDTO != null) {
                System.out.println("삭제되었습니다.");
            } else {
                System.out.println("삭제에 실패했습니다.");
            }
        } else {
            System.out.println("글을 삭제할 권한이 없습니다.");
        }
    }
}


