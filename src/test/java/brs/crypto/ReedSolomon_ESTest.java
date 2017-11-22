/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 21 20:45:05 GMT 2017
 */

package brs.crypto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brs.crypto.ReedSolomon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReedSolomon_ESTest extends ReedSolomon_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReedSolomon.encode(1030L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReedSolomon.decode("2223-2222-KB8Y-22222");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReedSolomon.decode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.crypto.ReedSolomon", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = ReedSolomon.decode("2222-2222-2222-22222");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        ReedSolomon.decode("w");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.crypto.ReedSolomon", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        ReedSolomon.decode("Q2222-2222-2222-22222E");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.crypto.ReedSolomon", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      long long0 = ReedSolomon.decode("ZZYY-ZZZZ-HM3U-HZZZZ");
      assertEquals((-34L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = ReedSolomon.encode((-34L));
      assertEquals("ZZYY-ZZZZ-HM3U-HZZZZ", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ReedSolomon.CodewordTooLongException reedSolomon_CodewordTooLongException0 = new ReedSolomon.CodewordTooLongException();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ReedSolomon.CodewordInvalidException reedSolomon_CodewordInvalidException0 = new ReedSolomon.CodewordInvalidException();
  }
}