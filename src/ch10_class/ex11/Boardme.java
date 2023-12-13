package ch10_class.ex11;

public class Boardme {

    //     게시글 클래스
//     필드
//     글번호(id) - Long 타입
    Long id; //Long은 클래스 타입이라 결과값이 null로 나옴 아예 데이터가 없다는 뜻
    //     제목(boardTitle)
    String boardTitle;
    //     작성자(boardWriter)
    String boardWriter;
    //     내용(boardContents)
    String boardContents;
    //     조회수(boardHits)
    int boardHits;

    public Boardme() {

    }
//


//     필드에 대한 getter/setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

//     생성자 2가지

    public Boardme(Long id, String boardTitle, String boardWriter, String boardContents, int boardHits) {
        this.id = id;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardHits = boardHits;
    }


//     toString method

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

//     글조회 method
//     name: findById
//     parameter: id
//     return: x
//     실행내용
//     main으로부터 글번호(Id)를 전달받고 글번호가 일치하면
//     일치면 boolean 써서 여기는 필드값 번호.equals(여기는 글 번호) 쓰면 될 거 같고
//     해당 게시글의 내용을
//     print로 출력해준다. sout으로 입력 받은 값을 표시하면 될 거 같고
//     단 출력하기 전에 조회수 값을 1 증가 시켜야 한다. i++ 그냥 쓰면 될 거 같고
//

    public Boardme findById(Long id) {
        if (id.equals(this.id)) {
            this.boardHits++;
            System.out.println("번호: " + this.id);
            System.out.println("제목: " + boardTitle);
            System.out.println("작가: " + boardWriter);
            System.out.println("내용: " + boardContents);
            return this; // 조회된 객체 반환
        } else {
            System.out.println("해당 ID의 글을 찾을 수 없습니다.");
            return null; // ID가 일치하지 않을 경우 null 반환
        }
    }
}
