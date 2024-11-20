package com.arbaaz.SpringMapping.repository;

import com.arbaaz.SpringMapping.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
