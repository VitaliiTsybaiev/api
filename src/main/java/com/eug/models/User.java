package com.eug.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class User {

    private String name;
    private int age;
    private LocalDateTime joinDateTime;

}
