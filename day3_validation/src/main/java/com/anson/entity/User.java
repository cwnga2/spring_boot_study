package com.anson.entity;

import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty(groups = {BasicUser.class}, message = "userName can not empty")
    private String userName;

    @NotEmpty(groups = {DetailUser.class}, message = "userDetail can not empty")
    private String userDetail;

    public interface BasicUser {
    }

    public interface DetailUser {
    }
}