package com.example.springbootboard.repository;

import com.example.springbootboard.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.example.springbootboard.repository
 * fileName       : BoardFileRepository
 * author         : son-jia
 * date           : 2023-05-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-26        son-jia       최초 생성
 */
public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
