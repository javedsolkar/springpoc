package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PhysicalAddress;
import com.example.demo.repo.PhysicalAddressRepo;

@Service
public class PhysicalAddressService {

	@Autowired
	PhysicalAddressRepo physicalAddressRepo;

	public Iterable<PhysicalAddress> getAllPhysicalAddress() {
		return physicalAddressRepo.getAllPhysicalAddress();
	}

}
