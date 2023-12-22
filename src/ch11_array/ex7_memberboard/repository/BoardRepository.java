package ch11_array.ex7_memberboard.repository;

import ch11_array.ex7_memberboard.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean write(BoardDTO boardDTO){
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardList(){
        return boardDTOList;
    }
}

