package com.example.demo.services;

import com.example.demo.repository.Repo_try1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_try1 {

    @Autowired
    private Repo_try1 repo;

    public ResponseEntity<?> getdetails(){
        List<String> list = repo.getbycity();
        return ResponseEntity.ok(list);
    }
}
