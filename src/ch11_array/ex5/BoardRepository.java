package ch11_array.ex5;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO>boardDTOList=new ArrayList<>();

    public boolean save(BoardDTO boardDTO){

        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardlist(){
        return boardDTOList;
    }

    public boolean serch(Long id){
        boolean result = false;
        for (int i = 0; i<boardDTOList.size(); i++){
            if(id.equals(boardDTOList.get(i).getId())){
                System.out.println(boardDTOList.get(i).getBoardContents());
                result = true;
            }
        }return result;
    }
    public boolean edit(Long id, String title, String contents){
        boolean result = false;
        for(BoardDTO boardDTO : boardDTOList){
            if (id.equals(boardDTO.getId())){
                boardDTO.setBoardContents(contents);
                boardDTO.setBoardTitle(title);
                result = true;
            }
        }

        return result;
    }



}


