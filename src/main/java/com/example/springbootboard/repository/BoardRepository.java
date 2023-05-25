package com.example.springbootboard.repository;

import com.example.springbootboard.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * packageName    : com.example.springbootboard.repository
 * fileName       : BoardRepository
 * author         : son-jia
 * date           : 2023-05-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-24        son-jia       최초 생성
 */
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

    // UPDATE board_table SET board_hits = board_hits+1 WHERE id = ?
    // 콜론을 넣어주어야 @Param 값과 매칭이 된다
    @Modifying
    @Query(value = "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    void updateHits(@Param("id") Long id);
}
