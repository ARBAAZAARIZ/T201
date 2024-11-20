package com.arbaaz.Rest_Repository.repositories;

import com.arbaaz.Rest_Repository.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
