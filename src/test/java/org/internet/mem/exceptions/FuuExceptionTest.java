/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.internet.mem.exceptions;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author nagash
 */
public class FuuExceptionTest { 

  @Test(expected=FuuException.class)  
  public void testSimpleThrow() {
    System.out.println("testSimpleThrow: FuuException");
    String testMsg = "-UUUUUUUUUCK";    
    
    FuuException instance = new FuuException(testMsg);
    String result = instance.getMessage();
    System.out.println(result);
    
    Assert.assertTrue("Wiadmość w wyjątku jest pusta", result != null);
    Assert.assertTrue("Wiadmość w wyjątku jest zbyt uboga", result.length() > testMsg.length());
    
    throw instance;
  }

  
}
