package ch11_array.ex7_memberboard.repository;

import ch11_array.ex7_memberboard.dto.BoardDTO;
import ch11_array.ex7_memberboard.dto.MemberDTO;

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

    public BoardDTO findById(Long id){
        for(BoardDTO boardDTO : boardDTOList){
            if(id.equals(boardDTO.getId())){
                return boardDTO;
            }
        } return null;
    }

    public boolean emailCheck(String email){
        for (BoardDTO boardDTO : boardDTOList){
            if(email.equals(boardDTO.getBoardWriter())){
                return true;
            }
        }return false;
    }
    public BoardDTO boardEdit(Long id, String editContents){
        for (BoardDTO boardDTO : boardDTOList){
            if(id.equals(boardDTO.getId())){
                boardDTO.setBoardContents(editContents);
                return boardDTO;
            }
        }return null;
    }

}



