package com.example.application.repository_application.model;

import com.example.application.repository_application.model.RepositoryDetails;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingleRepository {

    private Integer id;
    private String owner;
    private String repository_name;
    private RepositoryDetails repo_details;
}
