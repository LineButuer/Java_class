package ch11_array.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public void boardList() {
        List<BoardDTO> boardDTOList = boardRepository.boardlist();
//        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t + date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글목록 : " + boardDTO);
//            System.out.println(boardDTO.getId()+"\t"+boardDTO.getBoardTitle()+"\t"+boardDTO.getBoardWriter()+"\t"+boardDTO.getBoardHits()+"\t"+
//            boardDTO.getCreatedAT() + "\t");
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

    public void findId() {
        // 조회수를 1증가

        // 상세내용 가져옴


        System.out.println("찾는 글의 번호를 입력하세요.");
        Long id = scanner.nextLong();
        BoardDTO result = boardRepository.findId(id);
        if(result!=null){
            System.out.println(id + "번 글조회");
            BoardDTO boardDTO = boardRepository.findId(id);
            System.out.println("boardDTO = " + boardDTO);

        }else {
            System.out.println("조회하신 번호는 없는 글번호입니다.");
        }
//        boolean result = boardRepository.updateHits(id);
    }


    public void edit() {
        System.out.println("수정하고 싶은 글번호를 입력하세요.");
        Long id = scanner.nextLong();
        System.out.println("비밀번호를 입력하세요.");
        String password = scanner.next();
        BoardDTO boardDTO = boardRepository.findId(id);

        if (boardDTO != null) {
            if (password.equals(boardDTO.getBoardPassword())) {
                System.out.println("제목을 입력하세요.");
                String title = scanner.next();
                System.out.println("내용을 입력하세요.");
                String contents = scanner.next();
                boolean result = boardRepository.edit(id, title, contents);
                if (result) {
                    System.out.println("수정 되었습니다.");
                } else {
                    System.out.println("수정에 실패했습니다.");
                }
            }else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        }else {
            System.out.println("해당 게시물은 존재하지 않습니다.");
        }
    }

    public void delete() {
        System.out.println("삭제하고 싶은 글번호를 입력하세요");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findId(id);
        if (boardDTO != null) {
            System.out.println("비밀번호를 입력하세요");
            String password = scanner.next();
            if (password.equals(boardDTO.getBoardPassword())) {
                System.out.println("정말 삭제하시겠습니까?");
                System.out.println("1.YES 2.NO");
                boolean result =boardRepository.delete(id);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    if(result){
                        System.out.println("삭제되었습니다");
                    }
                } else if (choice == 2) {
                    System.out.println("삭제하지 않고 종료합니다.");
                }
            } else {
                System.out.println("해당 글번호는 존재하지 않습니다.");
            }
        }
    }
    public void search(){
        System.out.println("찾고 싶은 내용을 검색하세요.");
        String q = scanner.next();
        List<BoardDTO>searchList = boardRepository.search(q);
        if(searchList.size()>0){
            System.out.println("검색 결과");
            System.out.println("id\t" + "title\t" + "writer\t" + "hits\t");
            for(BoardDTO boardDTO : searchList ){
                System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" + boardDTO.getBoardWriter()+"\t"+ boardDTO.getBoardHits());
            }
        }else {
            System.out.println("검색 결과가 없습니다.");
        }



    }
    //목록 출력 전용 메서드
    // findAll, search 메서드로 부터 list 데이터를 전달 받아서 출력 하는 메서드
    private void lsitPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t + date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글목록 : " + boardDTO);
//            System.out.println(boardDTO.getId()+"\t"+boardDTO.getBoardTitle()+"\t"+boardDTO.getBoardWriter()+"\t"+boardDTO.getBoardHits()+"\t"+
//            boardDTO.getCreatedAT() + "\t");
        }
    }
    public void testData(){
        for(int i =1; i<11; i++){
            BoardDTO boardDTO =new BoardDTO("title" + i, "writer" +i, "1234", "contents"+i );
            boardRepository.save((boardDTO));
        }
    }

}




