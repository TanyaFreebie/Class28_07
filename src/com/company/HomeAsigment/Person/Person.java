package com.company.HomeAsigment.Person;

import com.company.HomeAsigment.Bardy.Bardy;

import java.util.List;

public class Person {
    private  String name;
    private int age;
    private boolean likeBardy;
    private boolean hasbardy;
    private List<Bardy> bardyOwned;

    public Person(String name, int age, boolean likeBardy, boolean hasbardy) {
        this.name = name;
        this.age = age;
        this.likeBardy = likeBardy;
        this.hasbardy = hasbardy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikeBardy() {
        return likeBardy;
    }

    public void setLikeBardy(boolean likeBardy) {
        this.likeBardy = likeBardy;
    }

    public boolean isHasbardy() {
        return hasbardy;
    }

    public void setHasbardy(boolean hasbardy) {
        this.hasbardy = hasbardy;
    }

    public List<Bardy> getBardyOwned() {
        return bardyOwned;
    }

    public void setBardyOwned(List<Bardy> bardyOwned) {
        this.bardyOwned = bardyOwned;
    }
}
