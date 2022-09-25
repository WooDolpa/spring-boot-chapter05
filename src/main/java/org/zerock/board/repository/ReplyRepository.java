package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Reply;

/**
 * packageName : org.zerock.board.repository
 * className : ReplyRepository
 * user : jwlee
 * date : 2022/09/25
 */
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
