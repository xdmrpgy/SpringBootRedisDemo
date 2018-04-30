package com.xmair.redisdemo;

import com.xmair.redisdemo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisdemoApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate<String,User> redisTemplate;
	@Test
	public void test0() {
		User user = new User("Mike",20);
		redisTemplate.opsForValue().set(user.getName(),user);
		user = new User("Jack",12);
		redisTemplate.opsForValue().set(user.getName(),user);
		user = new User("Mary",30);
		redisTemplate.opsForValue().set(user.getName(),user);
		Assert.assertEquals(20,redisTemplate.opsForValue().get("Mike").getAge().longValue());
		Assert.assertEquals(12,redisTemplate.opsForValue().get("Jack").getAge().longValue());
		Assert.assertEquals(30,redisTemplate.opsForValue().get("Mary").getAge().longValue());
	}
	@Test
	public void test() throws Exception{
		stringRedisTemplate.opsForValue().set("name","pgy");
		Assert.assertEquals("pgy",stringRedisTemplate.opsForValue().get("name"));
	}

}
