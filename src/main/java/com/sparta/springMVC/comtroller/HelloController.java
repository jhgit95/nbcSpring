package com.sparta.springMVC.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/api/hi")
    @ResponseBody
    public String hello(){
        return "hi 반가워 ";
    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get(){
        return "GET Method 요청";
    }

    @PostMapping("/api/post")
    @ResponseBody
    public String post(){
        return "Post Method";
    }

    @PutMapping
    @ResponseBody
    public String put(){
        return "PUT Method";
    }

    @DeleteMapping
    @ResponseBody
    public String delete(){
        return "DELETE Method";
    }


}
