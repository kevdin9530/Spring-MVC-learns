package com.spring.mvcdemo;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MyCustomValidation.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {

	//define course code
	public String value() default "LUV";
	//define error msg
	public String message() default "Not the correct course code";
	//define default group
	public Class<?>[] groups() default {};
	
	//define default payload
	public Class<? extends Payload>[] payload() default {};
}
