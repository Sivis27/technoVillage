package com.vila.springBootVilla.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class User {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String voterId;
	private String aadharNumber;
	private String gender;
	private String age;
	private String bloodGroup;
	private String maritalStatus;

}
