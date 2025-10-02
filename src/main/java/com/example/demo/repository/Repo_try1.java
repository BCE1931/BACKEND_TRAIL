package com.example.demo.repository;

import com.example.demo.models.Try1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo_try1 extends JpaRepository<Try1 , Integer> {


    @Query(value = "select name from city",nativeQuery = true)
    List<String> getbycity();
}
