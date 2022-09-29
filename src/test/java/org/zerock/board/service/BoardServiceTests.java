package org.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.BoardDTO;

/**
 * packageName : org.zerock.board.service
 * className : BoardServiceTests
 * user : jwlee
 * date : 2022/09/29
 */
@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void 등록테스트() {
        BoardDTO dto = BoardDTO.builder()
                .title("Test.")
                .content("Test...")
                .writerEmail("user55@aaa.com")              // 현재 데이터베이스에 존재하는 회원 이메일
                .build();

        Long bno = boardService.register(dto);
    }
}
