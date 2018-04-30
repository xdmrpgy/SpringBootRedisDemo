package com.xmair.redisdemo;

import com.xmair.redisdemo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @description:
 * @author:panguangyi
 * @date: 2018-4-30
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String,User> reidsTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,User> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }
}
