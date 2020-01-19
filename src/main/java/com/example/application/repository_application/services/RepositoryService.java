package com.example.application.repository_application.services;

import com.example.application.repository_application.dao.RepositoryDao;
import com.example.application.repository_application.model.RepositoryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RepositoryService {

    @Autowired
    RepositoryDao repositoryDao;

    public RepositoryDetails getSingleRepositoryInfo(String owner, String repo_name) throws IOException {
        return repositoryDao.findRepository(owner, repo_name);
    }
}
