package com.arbaaz.Rest_Repository.repositories;

import com.arbaaz.Rest_Repository.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
}
