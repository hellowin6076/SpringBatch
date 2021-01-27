package com.bufix.batch.SpringBatch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bufix.batch.SpringBatch.entity.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String>{
}
