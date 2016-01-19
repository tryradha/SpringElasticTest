package com.getvee.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.radha.sample.elastic.bean.User;
import com.radha.sample.elastic.respository.UserElasticRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/elastic-dao.xml" })
@ActiveProfiles(profiles = "dev")
public class MongoTest {

	@Autowired
	private UserElasticRepository userRepository;

	@Test
	public void test() throws Exception {

		for (int i = 72000; i < 100000000; i = i + 1000) {
			List<User> list = new ArrayList<User>(1000);
			for (int j = 0; j < 1000; j++) {
				User user = new User();
				user.setAge((int) (Math.random() * 50 + 1));
				user.setDob(new Date(System.currentTimeMillis() + (int) (Math.random() * 500000000 + 1)));
				user.setRegistrationDate(new Date(System.currentTimeMillis() + (int) (Math.random() * 500000000 + 1)));
				user.setScore((int) (Math.random() * 500 + 1));
				user.setName("R" + (int) (Math.random() * 100000000 + 1));
				user.setId((j + i) + "");
				user.setIsActive(true);
				list.add(user);
			}
			userRepository.save(list);
		}
	}
}
