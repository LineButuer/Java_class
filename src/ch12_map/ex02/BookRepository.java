package ch12_map.ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository {
    private static Map<Long, BookDTO> bookDTOMap = new HashMap<>();

    public boolean save(BookDTO bookDTO) {
        BookDTO DTO = bookDTOMap.put(bookDTO.getId(), bookDTO);
        System.out.println("DTO = " + DTO);
        if (DTO == null) {
            return true;
        } else {
            return false;
        }
    }

    public Map<Long, BookDTO> findAll() {
        return bookDTOMap;
    }

    public BookDTO findById(Long id) {
        for (Long i : bookDTOMap.keySet()) {
            if (id.equals(bookDTOMap.get(i).getId())) {
                return bookDTOMap.get(i);
            }
        }
        return null;
    }

    public boolean update(Long id, int bookPrice) {
        for (Long i : bookDTOMap.keySet()) {
            if (id.equals(bookDTOMap.get(i).getId())) {
                bookDTOMap.get(i).setBookPrice(bookPrice);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        for (Long i : bookDTOMap.keySet()) {
            if (id.equals(bookDTOMap.get(i).getId())) {
                bookDTOMap.remove(i);
                return true;
            }
        }return false;
    }

    public List<BookDTO>search(String bookTitle){
        // 검색결과를 담을 list 선언
        List<BookDTO>bookDTOList=new ArrayList<>();
        for(Long i : bookDTOMap.keySet()){
            if(bookDTOMap.get(i).getBookTitle().contains(bookTitle)){
                bookDTOList.add(bookDTOMap.get(i));
            }
        }return bookDTOList;
    }


}