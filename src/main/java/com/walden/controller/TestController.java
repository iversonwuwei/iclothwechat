package com.walden.controller;

import com.walden.model.User;
import com.walden.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by walden on 2016/12/22.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    public User getAll(){


        return testService.getall();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody @Valid User user){
        testService.insert(user);
    }
}
