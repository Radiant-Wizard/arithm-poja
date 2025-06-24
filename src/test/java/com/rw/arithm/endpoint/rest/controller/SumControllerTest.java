package com.rw.arithm.endpoint.rest.controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumControllerTest {
  private final SumController subject = new SumController();
  @Test
  void sumTest(){
    assertEquals(5, subject.sum(2, 3));
  }

}