package com.org.tcs.controller;

import com.org.tcs.model.College;
import com.org.tcs.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taj")
public class CollegeContoller {
    @Autowired
    CollegeService collegeService;
    @PostMapping("/create")
    public void addCollege (@RequestBody College college){
        collegeService.addCollege(college);
        }
}
