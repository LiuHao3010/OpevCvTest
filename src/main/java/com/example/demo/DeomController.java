package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeomController {
    @Autowired
    DemoService demoService;

@RequestMapping(value = "/selectimag",method = RequestMethod.GET)
    String upload(String filepath){
    try {
        int[] result=demoService.doservice(filepath);
        String rs="";
        for (int i:result
             ) {
            rs=rs+"  "+i;
        }
        return rs;
    } catch (Exception e) {
        e.printStackTrace();
        return "发生异常";
    }
}
}
