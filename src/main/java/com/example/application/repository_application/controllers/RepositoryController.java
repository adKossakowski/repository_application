package com.example.application.repository_application.controllers;

import com.example.application.repository_application.model.RepositoryDetails;
import com.example.application.repository_application.services.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/repositories")
public class RepositoryController {

    @Autowired
    private RepositoryService repositoryService;

    @GetMapping("/{owner}/{repository_name}")
    public Object getRepository(@PathVariable String owner, @PathVariable String repository_name) throws IOException {
        RepositoryDetails repositoryDetails = repositoryService.getSingleRepositoryInfo(owner, repository_name);
        if(repositoryDetails != null){
            return repositoryDetails;
        }else{
            return "{}";
        }
    }
}
