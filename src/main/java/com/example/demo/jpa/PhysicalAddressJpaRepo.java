package com.example.demo.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.PhysicalAddress;

public interface PhysicalAddressJpaRepo extends PagingAndSortingRepository<PhysicalAddress, String> {
}
