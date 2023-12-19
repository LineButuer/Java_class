package ch11_array.ex5;

public class BoardDTO {
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardPassword;
    private Long id;

    private int boardHits;

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
    }

    @Override
    public String toString() {
        return "글목록{" +
                "제목='" + boardTitle + '\'' +
                ", 작성자='" + boardWriter + '\'' +
                ", 글번호=" + id +
                '}';
    }
}
