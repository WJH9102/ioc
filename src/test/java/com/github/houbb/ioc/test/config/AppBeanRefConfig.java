package com.github.houbb.ioc.test.config;

import com.github.houbb.ioc.annotation.Bean;
import com.github.houbb.ioc.annotation.Configuration;
import com.github.houbb.ioc.annotation.Lazy;
import com.github.houbb.ioc.annotation.Scope;
import com.github.houbb.ioc.constant.ScopeConst;
import com.github.houbb.ioc.test.model.Book;
import com.github.houbb.ioc.test.model.Parent;
import com.github.houbb.ioc.test.model.User;
import com.github.houbb.ioc.test.service.WeightApple;

/**
 * <p> project: ioc-AppConfig </p>
 * <p> create on 2019/11/19 23:01 </p>
 *
 * @author Administrator
 * @since 0.1.5
 */
@Configuration
public class AppBeanRefConfig {

    @Bean
    @Lazy(value = true)
    public Parent book1() {
        Parent book = new Book();
        book.setName("《海底两万里》");
        return book;
    }

    @Bean
    public Parent book2() {
        Parent book = new Book();
        book.setName("《三国演义》");
        return book;
    }

    @Bean
    public User user(final Parent book) {
        User user = new User();
        user.setName("Hello");
        user.setBook(book);
        return user;
    }

}
