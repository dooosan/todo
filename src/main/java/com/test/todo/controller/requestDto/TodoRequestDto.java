package com.test.todo.controller.requestDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TodoRequestDto {

    private Long memberId;
    private String title; //제목
    private String content; //내용
//    private String writer; //작성자

}