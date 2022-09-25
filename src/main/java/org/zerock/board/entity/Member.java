package org.zerock.board.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName : org.zerock.board.entity
 * className : Member
 * user : jwlee
 * date : 2022/09/25
 */
@Entity
@NoArgsConstructor
@Getter
public class Member extends BaseEntity{

    @Id
    private String email;
    private String password;
    private String name;

    @Builder
    public Member(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
