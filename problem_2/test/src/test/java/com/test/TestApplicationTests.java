package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.controllers.JsonController;
import com.test.models.User;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class TestApplicationTests {

	@Autowired
	JsonController controller;

	@Test
	public void contextLoads() {
	}

	@Test
	public void controllerGetTestWorks() {

		Assert.assertNotNull("Test should not be null", controller.test());
	}

	@Test
	public void controllerUser() {
		User b = new User();
		User a = controller.getUser(b);
		Assert.assertEquals(a, b);
		Assert.assertNotNull("User should not be null and equal the one passed in", a);
	}

}
