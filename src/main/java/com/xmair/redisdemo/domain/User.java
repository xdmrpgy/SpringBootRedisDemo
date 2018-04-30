package com.xmair.redisdemo.domain;

import java.io.Serializable;

/**
 * @description:
 * @author:panguangyi
 * @date: 2018-4-30
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
