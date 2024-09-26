package com.work2win.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work2win.company.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

	List<Company> getByStatus(String status);
}
