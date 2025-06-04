package com.luv2code.springdemo.mvc;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "must be >= 0")
    @Max(value = 10, message = "must be <= 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
}
