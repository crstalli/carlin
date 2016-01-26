package com.test.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.User;

@RestController
public class JsonController {
	/**
	 * Class controlling the Get and Post methods for /user ex:
	 * localhost:8080/user
	 *
	 * The get method returns a String indicating that it works, while the post
	 * returns json in the format outlined in the sample json file.
	 *
	 * json: { "id": 123, "name": "Sample Name", "active": true, "count": 1020,
	 * "address_ids": [ 1, 30, 100, 50 ], "accounts": [ { "id": 1, "name":
	 * "Test Account 1" }, { "id": 2, "name": "Test Account 2" } ]}
	 *
	 * @author Chris Stallings
	 *
	 */

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody String test() {
		return "It Works";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody User getUser(@RequestBody User user) {
		return user;
	}
}
