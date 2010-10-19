/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.internet.mem.exceptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;


/**
 *
 * @author nagash
 */
abstract class AbstractMemException extends RuntimeException {

  public AbstractMemException(Throwable cause) {
    super(cause);
  }

  public AbstractMemException(String message, Throwable cause) {
    super(message, cause);
  }

  public AbstractMemException(String message) {
    super(message);
  }

  public AbstractMemException() {
  }
  
  abstract protected String provideImage();

  @Override
  public String getMessage() {
    StringBuilder sb = new StringBuilder();
    
    sb.append(this.provideImage());
    sb.append(super.getMessage());
    
    return sb.toString();
  }
  
  protected String loadFile(String filename) {
    StringBuilder sb = new StringBuilder("\n");
    InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(filename);
    try {
      sb.append(IOUtils.toString(resourceAsStream));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    
    sb.append("\n");
    return sb.toString();
    
  }
  
  

}
