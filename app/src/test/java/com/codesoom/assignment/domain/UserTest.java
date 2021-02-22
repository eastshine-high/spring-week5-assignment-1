package com.codesoom.assignment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    User user;

    @BeforeEach
    void setUp(){
        user = new User("name", "email", "password");
    }

    @Test
    void test_변수값확인(){
        assertThat("name").isEqualTo(user.getName());
        assertThat("email").isEqualTo(user.getEmail());
        assertThat("password").isEqualTo(user.getPassword());
    }

}