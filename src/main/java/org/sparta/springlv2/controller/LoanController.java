package org.sparta.springlv2.controller;

import org.sparta.springlv2.dto.LoanRequestDto;
import org.sparta.springlv2.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loan")
    public String loanPost(@RequestBody LoanRequestDto loanRequestDto) {
        String result = loanService.loanBook(loanRequestDto.getUserId(), loanRequestDto.getBookId());
        return result;
    }

    @PostMapping("/return")
    public String returnPost(@RequestBody LoanRequestDto loanRequestDto) {
        String result = loanService.returnBook(loanRequestDto.getUserId(), loanRequestDto.getBookId());
        return result;
    }
}
