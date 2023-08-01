package com.empapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

//DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private String message;
    private String statusCode;
    private String toContact;
    private LocalDateTime localDateTime;
}
