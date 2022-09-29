package org.zerock.board.service;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

/**
 * packageName : org.zerock.board.service
 * className : BoardService
 * user : jwlee
 * date : 2022/09/29
 */
public interface BoardService {

    Long register(BoardDTO dto);

    default Board dtoToEntity(BoardDTO dto){
        Member member = Member.builder().email(dto.getWriterEmail()).build();
        Board board = Board.builder().bno(dto.getBno()).title(dto.getTitle())
                .content(dto.getContent())
                .writer(member)
                .build();

        return board;
    }

}
