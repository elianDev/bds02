package com.devsuperior.bds02.dto;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
}
