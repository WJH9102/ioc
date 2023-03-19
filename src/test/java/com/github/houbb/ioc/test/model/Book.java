package com.github.houbb.ioc.test.model;

/**
 * @author binbin.hou
 * @since 0.0.7
 */
public class Book implements Parent {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

}
