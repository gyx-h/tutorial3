package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  @Test
  void testAdd(){
    Calc c = new Calc();
    assertEquals(5, c.add(2,3));
  }
  

    @Test
    void testSubtract() {
      Calc c = new Calc();
        assertEquals(2, c.add(5,2));
    }

}
