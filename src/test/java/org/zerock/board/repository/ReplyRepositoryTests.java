package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Reply;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * packageName : org.zerock.board.repository
 * className : ReplyRepositoryTests
 * user : jwlee
 * date : 2022/09/25
 */
@SpringBootTest
public class ReplyRepositoryTests {

    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void 댓글등록(){

        IntStream.rangeClosed(1, 300).forEach(i -> {
            long bno = (long)(Math.random() * 100) + 1;     // 1부터 100까지의 임의의 번호

            Board board = Board.builder().bno(bno).build();

            Reply reply = Reply.builder()
                    .text("Reply........" + i)
                    .board(board)
                    .replyer("guest")
                    .build();

            replyRepository.save(reply);
        });
    }

    @Test
    public void 댓글읽기_1(){
        Optional<Reply> result = replyRepository.findById(1L);
        Reply reply = result.get();
        System.out.println(reply);
        System.out.println(reply.getBoard());
    }

    @Test
    public void 댓글읽기_2(){
        Optional<Reply> result = replyRepository.findById(15L);
        Reply reply = result.get();
        System.out.println(reply);
        System.out.println(reply.getBoard());
    }

    @Test
    public void 댓글읽기_3(){
        Optional<Reply> result = replyRepository.findById(15L);
        Reply reply = result.get();
        System.out.println(reply);
        System.out.println(reply.getBoard());
    }

}
