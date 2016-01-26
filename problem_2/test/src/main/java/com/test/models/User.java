package com.test.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

//User Class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	/**
	 * Represents user object represented by the outer json provided in the sample file.
	 *
	 * @author Chris Stallings
	 */
	protected Integer id;
	protected String name;
	protected Boolean active;
	protected Integer count;
	protected List<Integer> address_ids;
	protected List<Account> accounts;

	//Getters/Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Integer> getAddress_ids() {
		return address_ids;
	}
	public void setAddress_ids(List<Integer> address_ids) {
		this.address_ids = address_ids;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
