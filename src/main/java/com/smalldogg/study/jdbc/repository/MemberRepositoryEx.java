package com.smalldogg.study.jdbc.repository;

import com.smalldogg.study.jdbc.domain.Member;

import java.sql.SQLException;

//특정 기술에 종속되는 인터페이스..
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;

    Member findById(String memberId) throws SQLException;

    void update(String memberId, int money) throws SQLException;

    void delete(String memberId) throws SQLException;
}
