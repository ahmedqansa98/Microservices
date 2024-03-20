package com.ahmedSirAcademy.accounts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

  @GetMapping("/sampleToRun")
  public String helloWorld() {
    return "Hi World!!";
  }
}
