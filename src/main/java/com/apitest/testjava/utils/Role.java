package com.apitest.testjava.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;


@AllArgsConstructor
public enum Role {
    ADMINISTRATOR(Arrays.asList(Permission.SAVE_ONE_BILL, Permission.READ_ALL_BILLS));
     private List<Permission> permissions;
}
