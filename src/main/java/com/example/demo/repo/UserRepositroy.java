package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Usere;

public interface UserRepositroy extends CrudRepository<Usere,Integer> {

}
