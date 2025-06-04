package com.luv2code.springdemo.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Customer {
    private String firstName;

    @Min(value = 0, message = "must be >= 0")
    @Max(value = 10, message = "must be <= 10")
    private int freePasses;


    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
}
