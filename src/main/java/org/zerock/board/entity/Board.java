package org.zerock.board.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;
import static javax.persistence.FetchType.LAZY;

/**
 * packageName : org.zerock.board.entity
 * className : Board
 * user : jwlee
 * date : 2022/09/25
 */
@Entity
@Getter
@NoArgsConstructor
public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long bno;

    private String title;
    private String content;

    @ManyToOne(fetch = LAZY)
    private Member writer;

    @Builder
    public Board(Long bno, String title, String content, Member writer) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer=" + writer +
                '}';
    }
}
