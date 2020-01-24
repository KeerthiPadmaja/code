package com.hexaware.model;
import com.hexaware.persistence.DbConnection;


public class Customer{
    private int CUS_ID;
    private String CUS_NAME;
    private String CUS_PASSWORD;
    private String CUS_EMAIL;
    private String CUS_MOBILE;
    private String CUS_DOB;
    private String CUS_ADDRESS;
  

    public final int getCUS_ID() {
      return CUS_ID;
    }
    public final void setCUS_ID(final int argId) {
      this.CUS_ID=argId;
    }
    public final String getCUS_NAME() {
      return CUS_NAME;
    }
    public final void setCUS_NAME(final String argName) {
      this.CUS_NAME=argName;
    }
    public final String getCUS_PASSWORD() {
      return CUS_PASSWORD;
    }
    public final void setCUS_PASSWORD(final String argPass) {
      this.CUS_PASSWORD=argPass;
    }
    public final String getCUS_EMAIL() {
      return CUS_EMAIL;
    }
    public final void setCUS_EMAIL(final String argMail) {
      this.CUS_EMAIL=argMail;
    }
    public final String getCUS_MOBILE() {
      return CUS_MOBILE;
    }
    public final void setCUS_MOBILE(final String argMob) {
      this.CUS_MOBILE=argMob;
    }
    public final String getCUS_DOB() {
      return CUS_DOB;
    }
    public final void setCUS_DOB(final String argDob) {
      this.CUS_DOB=argDob;
    }
    public final String getCUS_ADDRESS() {
      return CUS_ADDRESS;
    }
    public final void setCUS_ADDRESS(final String argAdd) {
      this.CUS_ADDRESS=argAdd;
    }

   /**
 * @param argId to initialize Customer id.
 * @param argName to initialize Customer name.
 * @param argPass to initialize Customer password.
 * @param argMail to initialize Customer email.
 * @param argMob to initialize Customer mobile.
 * @param argDob to initialize Customer date of birth.
 * @param argAdd to initialize Customer address.
 
 * used to get details through constructor.
 */
public Customer() {

}
 public Customer(int argId,
        String argName,
        String argPass,
        String argMail,
        String argMob,
        String argDob,
        String argAdd){
    this.CUS_ID = argId;
    this.CUS_NAME = argName;
    this.CUS_PASSWORD = argPass;
    this.CUS_EMAIL = argMail;
    this.CUS_MOBILE = argMob;
    this.CUS_DOB = argDob;
    this.CUS_ADDRESS = argAdd;
  }
 
  @Override
  public String toString() {
      return String.format("%s %s %s %s %s %s %s",
        CUS_ID, CUS_NAME, CUS_PASSWORD, CUS_EMAIL, CUS_MOBILE, CUS_DOB ,CUS_ADDRESS);
      
  }
}