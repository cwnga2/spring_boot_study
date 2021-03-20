package com.anson.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {
    String message() default "phone format error from Phone";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}