package com.wang.consumer;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 一只永不言弃的小乌龟
 * @create 2020/11/4 9:31 上午
 *
 */
@Configuration
public class LogConfig {

    /**
     * 配置log的日志信息
     * Full 记录完整的请求和响应，包括请求体
     * @return
     */
    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }
}
