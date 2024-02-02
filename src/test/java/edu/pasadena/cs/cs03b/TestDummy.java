package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestDummy {

   @Test
   public void testDummy()
   {
    int set1n[][] = {
      {1}, 
    };
    int set2n[][] = {
      {1, 3},
      {2, 3} 
    };
    int set3n[][] = {
      {1, 3, 5, 7},
      {2, 3, 6, 7},
      {4, 5 , 6, 7}
    };

     // action
     int[][] iResult = Dummy.generateSets(1);
     // assertion
     assertEquals(set1n, iResult);

     // TODO: add your own test cases
    
     // action
     int[][] iResult2 = Dummy.generateSets(2);
     // assertion
     assertEquals(set2n, iResult2);

     // action
     int[][] iResult3 = Dummy.generateSets(3);
     // assertion
     assertEquals(set3n, iResult3);

   }
}
