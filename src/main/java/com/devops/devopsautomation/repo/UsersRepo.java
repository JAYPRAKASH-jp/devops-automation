package com.devops.devopsautomation.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devops.devopsautomation.model.Users;


@Repository
public interface UsersRepo extends CrudRepository<Users,Integer>{

}
