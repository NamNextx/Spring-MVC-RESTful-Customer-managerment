package com.codegym.cms.service.impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.repository.customerRepositoryPaging;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private customerRepositoryPaging customerRepositoryPaging;

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList= (List<Customer>) customerRepositoryPaging.findAll();
       return customerList;
    }

    @Override
    public Customer findById(Long id) {
        return customerRepositoryPaging.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepositoryPaging.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepositoryPaging.delete(id);
    }
}
