package ch11_array.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardPassword;
    private Long id;
    private int boardHits;
    private String createdAt;

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public String getBoardPassword() {
        return boardPassword;
    }

    public void setBoardPassword(String boardPassword) {
        this.boardPassword = boardPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public  static Long idValue = 1L;


    public BoardDTO(){

    }
    public BoardDTO(String boardTitle, String boardWriter, String boardContents, String boardPassword) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardPassword = boardPassword;
        this.boardHits = 0;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS"));
    }


    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardPassword='" + boardPassword + '\'' +
                ", id=" + id +
                ", boardHits=" + boardHits +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
