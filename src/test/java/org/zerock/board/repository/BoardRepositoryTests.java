package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * packageName : org.zerock.board.repository
 * className : BoardRepositoryTests
 * user : jwlee
 * date : 2022/09/25
 */
@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void 게시글등록() {
        IntStream.rangeClosed(1, 100).forEach(i -> {

            Member member = Member.builder().email("user"+i+"@aaa.com").build();

            Board board = Board.builder()
                    .title("Title..." + i)
                    .content("Content..." + i)
                    .writer(member)
                    .build();

            boardRepository.save(board);
        });
    }

    @Test
    public void 게시글조회테스트_1() {
        Optional<Board> result = boardRepository.findById(100L);        // 데이터베이스에 존재하는 번호
        Board board = result.get();

        System.out.println(board);
        System.out.println(board.getWriter());
    }
}
