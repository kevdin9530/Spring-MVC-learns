package com.spring.mvcdemo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomValidation implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode cc) {
		coursePrefix = cc.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext cVC) {
		// TODO Auto-generated method stub
		if (code != null)
			return code.startsWith(coursePrefix);
		else
			return false;

	}

}
