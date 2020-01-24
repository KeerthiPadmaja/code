package com.hexaware.factory;

//import com.hexaware.cms.persistence.OrdersDAO;
import com.hexaware.persistence.DbConnection;
import java.util.List;
import com.hexaware.model.Vendor;
import com.hexaware.persistence.VendorDAO;
public class VendorFactory {
     /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of Employ object.
   */
    public static List<Vendor> showVendor() {
    List<Vendor> employees = dao().show();
    return employees;
  }

  /**
   * Call the data base connection.
   * @return  Employ object.
   */
  public static Vendor showVendor(int VendorId) {
    Vendor Vendor = dao().showById(VendorId);
    return Vendor;
  }
}