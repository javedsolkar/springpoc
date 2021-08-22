package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PhysicalAddress;
import com.example.demo.service.PhysicalAddressService;

@RestController
@RequestMapping("/physicalAddress")
public class PhysicalAddressController {

	@Autowired
	PhysicalAddressService physicalAddressService;

	@GetMapping("/all")
	@ResponseBody
	public Iterable<PhysicalAddress> getPhysicalAddress() {
		System.out.println("hiii");
		return physicalAddressService.getAllPhysicalAddress();
	}

}
