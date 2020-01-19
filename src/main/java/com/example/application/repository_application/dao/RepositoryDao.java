package com.example.application.repository_application.dao;

import com.example.application.repository_application.model.RepositoryDetails;
import com.example.application.repository_application.model.SingleRepository;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;

@Component
public class RepositoryDao {

    private static final String PATH = "repos_list.csv";

    public RepositoryDetails findRepository(String owner, String repoName) {
        HashMap<String, RepositoryDetails> repo_list = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(PATH))){
            String str = "";
            while ((str = br.readLine()) != null){
                String []line = str.split(",");
                SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
                SingleRepository repo = new SingleRepository(Integer.valueOf(line[0]), line[1], line[2],
                        new RepositoryDetails(line[3], line[4], line[5], Integer.valueOf(line[6]), formatter.parse(line[7])));
                repo_list.put(repo.getOwner() + "_" + repo.getRepository_name(), repo.getRepo_details());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return repo_list.get(owner + "_" + repoName);
    }
}
