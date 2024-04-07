package com.codingrecipe.member.dto;

import com.codingrecipe.member.entity.MemberEntity;
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

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
