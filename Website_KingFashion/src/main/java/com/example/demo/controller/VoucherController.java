package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voucher")
public class VoucherController {

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        return "voucher/home";
    }
}
