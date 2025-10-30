package com.student.entities;

class EmailValidate extends RuntimeException
{
	public EmailValidate() {
		super("enter valid email! ");
	}
	
	public EmailValidate(String desc)
	{
		super(desc);
	}
}