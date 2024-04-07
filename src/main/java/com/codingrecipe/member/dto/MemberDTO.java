package com.codingrecipe.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor //기본생성자 생성4
@AllArgsConstructor   // 모든 필드를 가지는 생성자 생성
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
