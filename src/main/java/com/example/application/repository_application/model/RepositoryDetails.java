package com.example.application.repository_application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RepositoryDetails {

    private String fullName;
    private String description;
    private String cloneUrl;
    private Integer stars;
    private Date createdAt;
}
