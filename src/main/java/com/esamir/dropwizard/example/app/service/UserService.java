package com.esamir.dropwizard.example.app.service;


import com.esamir.dropwizard.example.app.models.SamplePojo;

/**
 * Created by samirfaci on 6/2/17.
 */
public interface UserService {

    SamplePojo getSamplePojo(long userId);

}
