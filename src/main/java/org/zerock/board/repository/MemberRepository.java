package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Member;

/**
 * packageName : org.zerock.board.repository
 * className : MemberRepository
 * user : jwlee
 * date : 2022/09/25
 */
public interface MemberRepository extends JpaRepository<Member, String> {
}
