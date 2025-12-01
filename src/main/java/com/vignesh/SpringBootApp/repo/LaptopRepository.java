package com.vignesh.SpringBootApp.repo;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
  public void save() {
    System.out.println("Saving Laptop in Repository");
  }
}
