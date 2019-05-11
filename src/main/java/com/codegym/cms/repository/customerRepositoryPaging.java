package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface customerRepositoryPaging extends PagingAndSortingRepository<Customer,Long> {
}
