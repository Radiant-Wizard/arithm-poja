package com.rw.arithm.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

  @GetMapping("/sum")
  public long sum(@RequestParam long a, @RequestParam long b) {
    return a + b;
  }
}
