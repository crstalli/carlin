package com.test.models;

import com.fasterxml.jackson.annotation.JsonInclude;

//Account Class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
	/**
	 * Represents the top level account object.
	 * @author Chris Stallings
	 */
	//Members
	protected String name;
	protected Integer id;

	//Constructors
	public Account(){}
	public Account(Integer id, String name){
		this.name = name;
		this.id = id;
	}

	//Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}