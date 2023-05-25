package com.example.springbootboard.repository;

import com.example.springbootboard.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

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
}
