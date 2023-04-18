package com.example.exam;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/calc")
    public Map<String, Integer> calculate(@RequestParam String type, @RequestParam int x, @RequestParam int y) {
        int result = infoService.calculate(type, x, y);
        return Collections.singletonMap("result", result);
    }
}