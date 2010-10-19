/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.internet.mem.exceptions;

/**
 *
 * @author nagash
 */
public class FuuException extends AbstractMemException {
  private static final String ASCI_FILENAME = "rageman.txt";
  
  public FuuException() {
  }

  public FuuException(String message) {
    super(message);
  }

  public FuuException(String message, Throwable cause) {
    super(message, cause);
  }

  public FuuException(Throwable cause) {
    super(cause);
  }  

  @Override
  protected String provideImage() {
    return loadFile(ASCI_FILENAME);
  }
  
}
