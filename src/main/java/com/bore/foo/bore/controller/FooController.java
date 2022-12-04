package com.bore.foo.bore.controller;

import com.bore.foo.bore.service.FooService;
import com.bore.foo.bore.vo.ResultVO;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {
    @AutoConfigureOrder
    FooService fooService;

    @GetMapping("/sum")
    public ResultVO sum(Integer a,Integer b){
        return new ResultVO(){{
            setResult(fooService.sum(a,b));
        }};
    }
}
