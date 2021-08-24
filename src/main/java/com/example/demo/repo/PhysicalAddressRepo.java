package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.jpa.PhysicalAddressJpaRepo;
import com.example.demo.model.PhysicalAddress;

@Repository
public class PhysicalAddressRepo {

	@Autowired
	PhysicalAddressJpaRepo physicalAddressJpaRepo;

	public Iterable<PhysicalAddress> getAllPhysicalAddress() {
		return physicalAddressJpaRepo.findAll();
	}

}
