package ch11_array.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public void boardList() {
        List<BoardDTO> boardDTOList = boardRepository.boardlist();
//        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t");
        for (BoardDTO boardDTO : boardDTOList){
            System.out.println("글목록 : " + boardDTO);
//            System.out.println(boardDTO.getId()+"\t"+boardDTO.getBoardTitle()+"\t"+boardDTO.getBoardWriter()+"\t"+boardDTO.getBoardHits()+"\t");
        }
    }
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {

        System.out.println("제목을 입력하세요.");
        String boardTitle = scanner.next();
        System.out.println("작성자를 입력하세요.");
        String boardWriter = scanner.next();
        System.out.println("내용을 입력하세요.");
        String boardContents = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String boardPassword = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPassword);
        boardDTO.getId();
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("등록되었습니다.");
        } else {
            System.out.println("등록에 실패했습니다. 다시 입력하세요.");
        }
    }

    public void serch(){
        // 조회수를 1증가

        // 상세내용 가져옴
        System.out.println("찾는 글의 번호를 입력하세요.");
        Long id = scanner.nextLong();
//        boolean result = boardRepository.updateHits(id);
        System.out.println(id + " 번 글 내용");
        boardRepository.serch(id);
       }

    public void edit(){
        System.out.println("수정하고 싶은 글번호를 입력하세요.");
        Long id = scanner.nextLong();
        System.out.println("제목을 입력하세요.");
        String title =scanner.next();
        System.out.println("내용을 입력하세요.");
        String contents = scanner.next();
       boolean result = boardRepository.edit(id, title, contents);
       if(result){
           System.out.println("수정 되었습니다.");
       }else {
           System.out.println("수정에 실패했습니다.");
       }



    }
    }


