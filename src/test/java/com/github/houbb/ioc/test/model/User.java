package com.github.houbb.ioc.test.model;

/**
 * @author binbin.hou
 * @since 0.0.7
 */
public class User {

    private Parent book;

    private String name;

    public Parent getBook() {
        return book;
    }

    public void setBook(Parent book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "book=" + book +
                ", name='" + name + '\'' +
                '}';
    }

}
