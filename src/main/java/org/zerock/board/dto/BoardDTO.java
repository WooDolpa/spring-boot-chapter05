package org.zerock.board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * packageName : org.zerock.board.dto
 * className : BoardDTO
 * user : jwlee
 * date : 2022/09/29
 */
@Data
@NoArgsConstructor
public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private String writerEmail;             // 작성자 이메일(id)
    private String writerName;              // 작성자 이름
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount;                 // 해당 게시글의 댓글 수

    @Builder
    public BoardDTO(Long bno, String title, String content, String writerEmail, String writerName, LocalDateTime regDate, LocalDateTime modDate, int replyCount) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writerEmail = writerEmail;
        this.writerName = writerName;
        this.regDate = regDate;
        this.modDate = modDate;
        this.replyCount = replyCount;
    }
}
