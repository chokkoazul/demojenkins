package com.chokkoazul.demojenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/init")
    public String init(){
        return "Init Jenkins";
    }
}
