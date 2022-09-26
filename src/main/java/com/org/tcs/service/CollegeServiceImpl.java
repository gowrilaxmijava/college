package com.org.tcs.service;

import com.org.tcs.model.College;
import com.org.tcs.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    CollegeRepo collegeRepo;
    @Override
    public void addCollege(College college){
    collegeRepo.save( college);

    }
}
