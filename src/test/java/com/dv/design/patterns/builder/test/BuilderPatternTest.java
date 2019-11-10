package com.dv.design.patterns.builder.test;

import org.junit.Assert;
import org.junit.Test;

import com.dv.design.patterns.creational.builder.User;

public class BuilderPatternTest {

    @Test
    public void testBuilderPattern(){

        User user = new User.UserBuilder("Steve","Jobs")
                .age(57)
                .address("This is a sample address")
                .phone("23456789")
                .build();
        System.out.println(user);
        Assert.assertTrue(user != null);
        Assert.assertTrue(user.getFirstName().equals( "Steve"));
    }
}
