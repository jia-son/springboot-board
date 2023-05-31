package com.example.springbootboard.controller;

import com.example.springbootboard.dto.CommentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : com.example.springbootboard.controller
 * fileName       : CommentController
 * author         : son-jia
 * date           : 2023-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-31        son-jia       최초 생성
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    @PostMapping("save")
    public @ResponseBody String save(@ModelAttribute CommentDTO commentDTO) {
        return "요청 성공";
    }
}
