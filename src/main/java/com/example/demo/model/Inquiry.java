package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inquiry {
	@NotBlank
	@Size( max = 20 )
	private String name;
	
	@NotBlank
	@Email
	@Size ( max = 30)
	private String email;
	
	@NotBlank
	@Size( max = 50 )
	private String inquiry;
}
