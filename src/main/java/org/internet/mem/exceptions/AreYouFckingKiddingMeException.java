/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.internet.mem.exceptions;

/**
 *
 * @author nagash
 */
public class AreYouFckingKiddingMeException extends AbstractMemException {
  private static final String ASCI_FILENAME = "mrkidding.txt";

  public AreYouFckingKiddingMeException() {
  }

  public AreYouFckingKiddingMeException(String message) {
    super(message);
  }

  public AreYouFckingKiddingMeException(String message, Throwable cause) {
    super(message, cause);
  }

  public AreYouFckingKiddingMeException(Throwable cause) {
    super(cause);
  }  
  
  @Override
  protected String provideImage() {
    return loadFile(ASCI_FILENAME);
  }

}
