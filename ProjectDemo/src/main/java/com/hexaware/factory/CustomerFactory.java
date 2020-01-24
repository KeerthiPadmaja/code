package com.hexaware.factory;

//import com.hexaware.cms.persistence.OrdersDAO;
import com.hexaware.persistence.DbConnection;
import java.util.List;
import com.hexaware.model.Customer;
import com.hexaware.persistence.CustomerDAO;
public class CustomerFactory {
     /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
   private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of Customer object.
   */
    public static List<Customer> showCustomer() {
    List<Customer> customers = dao().show();
    return customers;
  }
  /**
   * Call the data base connection.
   * @return  Customer object.
   */
  public static Customer showCustomer(int CustomerId) {
    Customer  Customer = dao().showById( CustomerId);
    return  Customer;
  }

  /**
   * AddCustomer.
   * @return the array of Customer object.
 
  public static String addCustomer(Customer customer) {
    dao().addCustomer(customer);
    return "Record Added...";
  }
    */
}
