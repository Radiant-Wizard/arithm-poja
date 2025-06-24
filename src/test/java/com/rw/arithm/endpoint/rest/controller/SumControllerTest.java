package com.rw.arithm.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumControllerTest {
  private final SumController subject = new SumController();

  @Test
  void sum_test() {
    assertEquals(5, subject.sum(2, 3));
  }

  @Test
  void sum_test_big_number() {
    assertEquals(5_000_000_000L, subject.sum(2_000_000_000L, 3_000_000_000L));
  }

}