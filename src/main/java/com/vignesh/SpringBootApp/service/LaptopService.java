package com.vignesh.SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vignesh.SpringBootApp.model.Laptop;
import com.vignesh.SpringBootApp.repo.LaptopRepository;
@Service
public class LaptopService {
  @Autowired
  private LaptopRepository repo;

  public void addLaptop(Laptop lap) {
    System.out.println("Laptop is adding ...");
    repo.save();
    
  }

  public boolean isGoodForProgram(Laptop lap) {
    return true;
  }
}
