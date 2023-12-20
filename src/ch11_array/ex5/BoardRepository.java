package ch11_array.ex5;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean save(BoardDTO boardDTO) {

        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardlist() {
        return boardDTOList;
    }

//    public boolean updateHits(Long id){
//        for (int i = 0; i < boardDTOList.size(); i++) {
//            if (id.equals(boardDTOList.get(i).getId())){
//                // 기존 조회수 값을 가져옴
//                int hits = boardDTOList.get(i).getBoardHits();
//                // 1증가 시킴
//                hits = hits+1;
//                // 조회수 필드에 저장
//                boardDTOList.get(i).setBoardHits(hits);
//                return true;
//            }
//        }
//        return false;
//    }

    public BoardDTO findId(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                return boardDTOList.get(i);
            }
        }
        return null;
    }


    public boolean edit(Long id, String title, String contents) {
        boolean result = false;
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                boardDTO.setBoardContents(contents);
                boardDTO.setBoardTitle(title);
                result = true;
            }
        }

        return result;
    }

    public boolean delete(Long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                result = true;
                boardDTOList.remove(i);
            }
        }return result;
    }

    public List<BoardDTO>search(String q){
        List<BoardDTO>searchList = new ArrayList<>();

        for (int i = 0; i < boardDTOList.size(); i++) {
            if(boardDTOList.get(i).getBoardTitle().contains(q)){
                searchList.add(boardDTOList.get(i));
            }
        }return searchList;
    }

}





