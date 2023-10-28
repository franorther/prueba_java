package com.apitest.testjava.repositorys;

import com.apitest.testjava.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
