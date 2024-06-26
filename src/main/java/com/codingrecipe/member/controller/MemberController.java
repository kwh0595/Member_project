package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = "+memberDTO);
        memberService.save(memberDTO);
        return "index";
    }
    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult= memberService.login(memberDTO);
        if(loginResult!=null){
            //login 성공
            session.setAttribute("loginEmail",loginResult.getMemberEmail());
            return "main";
        }else{
            //login 실패
            return "login";
        }
    }
    @GetMapping("/member/login")
    public String loginFrom(){
        return "login";
    }

    @GetMapping("/member/")
    public String findAll(Model model){
       List<MemberDTO> memberDTOList = memberService.findAll();
       // 어떠한 html로 가져갈 데이터가 있다면 model 사용 (model을 사용하는건 가장 기본적인 방법)
       model.addAttribute("memberList", memberDTOList);
       return "list";
    }
    @GetMapping("/member/{id}")
    public String findById(@PathVariable Long id, Model model){
        MemberDTO memberDTO = memberService.findById(id);
        model.addAttribute("member",memberDTO);
        return "detail";
    }
}
