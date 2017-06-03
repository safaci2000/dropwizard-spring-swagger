package com.esamir.dropwizard.example.app.service.impl;

import com.esamir.dropwizard.example.app.models.SamplePojo;
import com.esamir.dropwizard.example.app.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by samirfaci on 6/2/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public SamplePojo getSamplePojo(long userId) {
        return new SamplePojo("Federico", 1234);
    }
}
