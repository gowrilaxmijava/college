package com.org.tcs.service;

import com.org.tcs.model.College;
import org.springframework.web.bind.annotation.RequestBody;

public interface CollegeService {
    public void  addCollege(College college);
}
