package com.hexaware.model;
import com.hexaware.persistence.DbConnection;

public class Vendor{
    private int VEN_ID;
    private String VEN_NAME;
    private String VEN_PASSWORD;
    private String VEN_EMAIL;
    public String VEN_MOBILE;
    public String VEN_ADDRESS;
/**
 * @param argEmpno to initialize employ No.
 * @param argName to initialize employ name.
 * @param argDept to initialize employ dept.
 * @param argDesig to initialize employ Desig.
 * @param argBasic to initialize employ basic.
 * used to get details through constructor.
 */
  public Vendor(int argVEN_ID, String argVEN_NAME,
        String argVEN_PASSWORD,
        String argVEN_EMAIL,
        String argVEN_MOBILE,String argVEN_ADDRESS ) {
    this.VEN_ID = argVEN_ID;
    this.VEN_NAME = argVEN_NAME;
    this.VEN_PASSWORD = argVEN_PASSWORD;
    this.VEN_EMAIL = argVEN_EMAIL;
    this.VEN_MOBILE = argVEN_MOBILE;
    this.VEN_ADDRESS=argVEN_ADDRESS;
  }
 
  @Override
  public String toString() {
      return String.format("%10s %10s %10s %10s %10s %10S",
        VEN_ID,VEN_NAME,VEN_PASSWORD,VEN_EMAIL,VEN_MOBILE,VEN_ADDRESS);
      
  }
}