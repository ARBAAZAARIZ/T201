package com.example.crud_mysql.repository;

import com.example.crud_mysql.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts,Integer> {
}
