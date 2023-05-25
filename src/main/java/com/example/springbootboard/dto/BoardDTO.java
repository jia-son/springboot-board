package com.example.springbootboard.dto;

import lombok.*;

import java.time.LocalDateTime;

/**
 * packageName    : com.example.springbootboard.dto
 * fileName       : BoardDTO
 * author         : son-jia
 * date           : 2023-05-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-24        son-jia       최초 생성
 */

@Getter
@Setter
@ToString
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
