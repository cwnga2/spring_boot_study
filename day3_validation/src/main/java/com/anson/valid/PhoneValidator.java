package com.anson.valid;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

class PhoneValidator implements ConstraintValidator<Phone, String> {

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone != null && !phone.isEmpty()) {
            //  constraintValidatorContext.disableDefaultConstraintViolation();
            // NOTE: override Phone.message
            //  constraintValidatorContext.buildConstraintViolationWithTemplate("").addConstraintViolation();
            return phone.matches("\\d{9}$");
        }
        return true;
    }
}