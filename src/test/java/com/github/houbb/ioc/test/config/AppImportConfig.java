package com.github.houbb.ioc.test.config;

import com.github.houbb.ioc.annotation.Bean;
import com.github.houbb.ioc.annotation.Configuration;
import com.github.houbb.ioc.annotation.Import;
import com.github.houbb.ioc.test.service.Apple;

/**
 * <p> project: ioc-AppConfig </p>
 * <p> create on 2019/11/19 23:01 </p>
 *
 * @author Administrator
 * @since 0.1.4
 */
@Import(AppBeanConfig.class)
public class AppImportConfig {

    /**
     * Import类如果没有@Configuration修饰 则 bean 不会被加载到容器中
     * @return
     */
    @Bean
    public Apple apple() {
        return new Apple();
    }

}
