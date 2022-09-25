package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Board;

/**
 * packageName : org.zerock.board.repository
 * className : BoardRepository
 * user : jwlee
 * date : 2022/09/25
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
}
