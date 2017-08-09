package com.mickyli.learn.springboot.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Jpa配置类
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE) //控制bean的加载顺序
@EnableTransactionManagement(proxyTargetClass = true) //启用jpa的事务管理
@EnableJpaRepositories(basePackages = "com.**.repository") //启用jpa资源库并指定定义接口资源库的位置
@EntityScan(basePackages = "com.**.entity") //指定实体的位置
public class JpaConfiguration {
    @Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
