package org.zerock.board.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.board.entity.Board;

import java.util.List;

/**
 * packageName : org.zerock.board.repository
 * className : BoardRepository
 * user : jwlee
 * date : 2022/09/25
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
    // 한개의 로우(Object) 내에 Object[]로 나옴
    @Query("select b, w from Board b left join b.writer w where b.bno = :bno")
    Object getBoardWithWriter(@Param("bno") Long bno);

    @Query("SELECT b, r FROM Board b LEFT JOIN Reply r ON r.board = b WHERE b.bno = :bno")
    List<Object[]> getBoardWithReply(@Param("bno") Long bno);

    @Query(value = "SELECT b, w, COUNT(r) " +
            " FROM Board b " +
            " LEFT JOIN b.writer w " +
            " LEFT JOIN Reply r ON r.board = b " +
            " GROUP BY b", countQuery = "SELECT COUNT(b) FROM Board b")
    Page<Object[]> getBoardWithReplyCount(Pageable pageable);   // 목록 화면에 필요한 데이터

}
