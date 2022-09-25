package org.zerock.board.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.*;

/**
 * packageName : org.zerock.board.entity
 * className : Reply
 * user : jwlee
 * date : 2022/09/25
 */
@Entity
@NoArgsConstructor
@Getter
public class Reply extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long rno;

    private String text;
    private String replyer;

    @ManyToOne
    private Board board;

    @Builder
    public Reply(Long rno, String text, String replyer, Board board) {
        this.rno = rno;
        this.text = text;
        this.replyer = replyer;
        this.board = board;
    }
}
