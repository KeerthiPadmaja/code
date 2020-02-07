<<<<<<< HEAD
package com.hexaware.MLP176.factory;

import com.hexaware.MLP176.persistence.OrderDAO;
import com.hexaware.MLP176.persistence.DbConnection;
import java.util.Date;
//import java.sql.Date;
import java.util.List;
=======
package com.hexaware.MLP176.util;
import java.util.Scanner;
import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.hexaware.MLP176.factory.MenuFactory;
>>>>>>> cd52de2d9d953efd682252ed1602f3f31ca689c6
import com.hexaware.MLP176.model.Menu;
import com.hexaware.MLP176.factory.VendorFactory;
import com.hexaware.MLP176.model.Vendor;
import com.hexaware.MLP176.factory.OrderFactory;
import com.hexaware.MLP176.model.Orders;
import com.hexaware.MLP176.factory.CustomerFactory;
import com.hexaware.MLP176.model.Customer;
import java.text.ParseException;
import com.hexaware.MLP176.factory.WalletFactory;
import com.hexaware.MLP176.model.Wallet;
import com.hexaware.MLP176.model.WalletType;
<<<<<<< HEAD
=======
import com.hexaware.MLP176.model.OrderStatus;
import java.util.Date;
>>>>>>> 6db6efb5881e4b3697d51e864a6a25443cbe4123
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
<<<<<<< HEAD
public class OrderFactory {
  /**
   *  Protected constructor.
   */
  protected OrderFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static OrderDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrderDAO.class);
  }
   /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Orders[] showOrder() {
    List<Orders> order = dao().show();
    return order.toArray(new Orders[order.size()]);
=======
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Show Vendor");
    System.out.println("3. Show orders");
    System.out.println("4. Pending Orders");
    System.out.println("5. Order History");
    System.out.println("6. Show customers");
    System.out.println("7. Show wallet");
    System.out.println("8. Place Order");
    System.out.println("9. accept reject");
    System.out.println("10. cancel order");
    System.out.println("11. Exit");
    mainMenuDetails();
>>>>>>> cd52de2d9d953efd682252ed1602f3f31ca689c6
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          showFullVendor();
          break;
        case 3:
          showFullOrders();
          break;
        case 4:
          pendingOrders();
          break;
        case 5:
          orderHistory();
          break;
        case 6:
          showFullCustomer();
          break;
        case 7:
          showFullWallet();
          break;
        case 8:
          placeOrder();
          break;
        case 9:
          acceptReject();
          break;
        case 10:
          cancelOrder();
          break;
        case 11:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1,2,3,4 ,5 or 6");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  private void cancelOrder() {
    int ordId;
    int custId;
    String status;
    System.out.println("Enter Order Id  ");
    ordId = option.nextInt();
    System.out.println("Enter Customer Id  ");
    custId = option.nextInt();
    System.out.println("Cancel (YES/NO)  ");
    status = option.next();
    if (status.toUpperCase().equals("YES")) {
      System.out.println(OrderFactory.cancelOrder(ordId, custId, status));
    } else {
      System.out.println("Your order has not been Cancelled :)");
    }
  }
  private void acceptReject() {
    int ordId;
    int vendorId;
    String status;
    System.out.println("Enter Order Id  ");
    ordId = option.nextInt();
    System.out.println("Enter Vendor Id  ");
    vendorId = option.nextInt();
    System.out.println("ACCEPTED or REJECTED  ");
    status = option.next();
    System.out.println(OrderFactory.acceptOrRejectOrder(ordId, vendorId, status));
  }

  private void placeOrder() {
    Orders order = new Orders();
    System.out.println("Enter Customer ID ");
    order.setCustomerId(option.nextInt());
    System.out.println("Enter Menu Id  ");
    order.setMenuId(option.nextInt());
    System.out.println("Enter Vendor Id ");
    order.setVendorId(option.nextInt());
    System.out.println("Enter Quantity ");
    order.setOrderQuantity(option.nextInt());
    System.out.println("Enter Vallet Source ");
    //System.out.println("Enter Promo Code ");
    String ws = option.next();
    WalletType walSrc = WalletType.PAYTM;
    if (ws.equals("PAYTM")) {
      walSrc = WalletType.PAYTM;
    }
    if (ws.equals("CREDIT_CARD")) {
      walSrc = WalletType.CREDIT_CARD;
    }
    if (ws.equals("DEBIT_CARD")) {
      walSrc = WalletType.DEBIT_CARD;
    }
    if (ws.equals("PHONE_PE")) {
      walSrc = WalletType.PHONE_PE;
    }
    if (ws.equals("GOOGLE_PAY")) {
      walSrc = WalletType.GOOGLE_PAY;
    }
    order.setWalletType(walSrc);
    System.out.println("Enter Order Date (yyyy-MM-dd)  ");
    String ord = option.next();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date dt = sdf.parse(ord);
      order.setOrderDate(dt);
    } catch (ParseException e) {
      System.out.println(e);
    }
    System.out.println("Enter Order Comments ");
    order.setOrderComments(option.next());
    System.out.println(OrderFactory.placeOrder(order));
  }
<<<<<<< HEAD
  /**
   * Show Vendor Orders History.
   * @param orderId for accept or reject.
   * @param vendorId for accept or reject.
   * @param status for changing status.
   * @return the array of order object.
   */
  public static String acceptOrRejectOrder(final int orderId, final int vendorId, final String status) {
    Orders order = dao().findByOrderId(orderId);
    String result = "";
    if (order != null) {
      if (order.getVendorId() == vendorId) {
        if (status.equals("ACCEPTED")) {
          dao().acceptOrReject(status, orderId);
          result = "Order Accepted Successfully...";
        }
        if (status.equals("REJECTED")) {
          dao().acceptOrReject(status, orderId);
          WalletType type = order.getWalletType();
          int custId = order.getCustomerId();
          double billAmount = order.getOrderTotalamount();
          dao().refundAmount(billAmount, type, custId);
          result = ("Order Cancelled Successfully and amount refunded to " + type);
        }
      } else {
<<<<<<< HEAD
        result = "You are Unauthorised Vendor for this User";
=======
  private void orderHistory() {
    System.out.println("Orders history:\n1. Customer\n2. Vendor");
    int choice = option.nextInt();
    int count = 0;
    if (choice == 1) {
      System.out.println("Enter customer Name");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter Customer password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = CustomerFactory.validateCustomer(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Customer customer = CustomerFactory.findByCustomerName(username);
        int custId = customer.getCustomerId();
        Orders[] cusHistory = OrderFactory.showCustomerHistory(custId);
        System.out.println("-----------------------------------------------------------------"
            + "---------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "orderId", "customerId",
            "vendorid", "menuid", "Order status", "ordercomments", "Bill Amount",
            "Order quantity");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------"
            + "-----------------------------------------------------------------------");
        for (Orders order : cusHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
    if (choice == 2) {
      System.out.println("Enter Vendor Name");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter Vendor password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = VendorFactory.validateVendor(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Vendor vendor = VendorFactory.findByVendorName(username);
        int vendId = vendor.getVendorId();
        Orders[] venHistory = OrderFactory.showVendorHistory(vendId);
        System.out.println("----------------------------------------------------"
            + "----------------------------------------------");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s", "Item Id", "Menu Id",
            "Order Status", "Order quantity", "Order id", "Customer ID", "Bill Amount",
            "Order Date");
        System.out.println();
        System.out.println("----------------------------------------------------"
            + "----------------------------------------------");
        for (Orders order : venHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
>>>>>>> cd52de2d9d953efd682252ed1602f3f31ca689c6
=======
        result = "You are Unauthorized Vendor for this order...";
>>>>>>> 6db6efb5881e4b3697d51e864a6a25443cbe4123
      }
    }
  }
<<<<<<< HEAD
   /**
   * Show Vendor Orders History.
   * @param orderId for accept or reject.
   * @param custId for accept or reject.
   * @param status for changing status.
   * @return the array of order object.
   */
  public static String cancelOrder(final int orderId, final int custId, final String status) {
    Orders order = dao().findByOrderId(orderId);
    OrderStatus ostatus = order.getOrderStatus();
    String result = "";
    if (order != null) {
<<<<<<< HEAD
      if (status.equals("YES")) {
        String st = "REJECTED";
        dao().acceptOrReject(st, orderId);
        double billAmount = order.getOrderTotalamount();
        WalletType type = order.getWalletType();
        billAmount = billAmount - (billAmount / 10);
        dao().refundAmount(billAmount, type, custId);
        result = ("Order Cancelled Successfully and amount refunded to " + type);
=======
  private void pendingOrders() {
    System.out.println("Order history:\n1. Customer Orders\n2. Vendor Orders");
    int choice = option.nextInt();
    int count = 0;
    if (choice == 1) {
      System.out.println("Enter UserName");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = CustomerFactory.validateCustomer(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Customer customer = CustomerFactory.findByCustomerName(username);
        int custId = customer.getCustomerId();
        Orders[] cusHistory = OrderFactory.showpendingCustomerOrders(custId);
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s", "Order Id", "Cus Id",
            "Vendor Id", "Menu ID", "Order Status", "Order Comments", "Bill Amount",
            "Order Date", "Order Qty");
        System.out.println();
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        for (Orders order : cusHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
    if (choice == 2) {
      System.out.println("Enter UserName");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = VendorFactory.validateVendor(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
=======
      if (ostatus == OrderStatus.PENDING) {
        if (order.getCustomerId() == custId) {
          if (status.equals("YES")) {
            String st = "REJECTED";
            dao().acceptOrReject(st, orderId);
            double billAmount = order.getOrderTotalamount();
            WalletType type = order.getWalletType();
            billAmount = billAmount - (billAmount / 10);
            dao().refundAmount(billAmount, type, custId);
            result = "Order Cancelled Successfully and amount refunded to " + type;
          }
        } else {
          result = "You are Unauthorised";
        }
      } else {
        result = "You cannot cancel this order...";
>>>>>>> 86794babf968a27b49364007655274b2f311840c
      }
      if (count == 1) {
        Vendor vendor = VendorFactory.findByVendorName(username);
        int vendId = vendor.getVendorId();
        Orders[] venHistory = OrderFactory.showpendingVendorOrders(vendId);
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s", "Order Id", "Cus Id",
            "Vendor Id", "Menu ID", "Order Status", "Order Comments", "Bill Amount",
            "Order Date", "Order Qty");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------"
            + "---------------------------------------------------------------");
        for (Orders order : venHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
>>>>>>> cd52de2d9d953efd682252ed1602f3f31ca689c6
      }
    }
  }

  /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullWallet() {
    Wallet[] wallet = WalletFactory.showWallet();
    System.out.println("walid waltype walamount  cusid");
    for (Wallet m : wallet) {
      System.out.println(m.getWalletId() + " " + m.getWalletType() + " " + m.getWalletAmount() + " " + m.getCustomerId());
    }
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu_Id Category name Quantity Cost Calories reviews");
    for (Menu m : menu) {
      System.out.println(m.getMenuId() + " " + m.getMenuCat() + " " + m.getMenuItem()
          + " " + m.getMenuQuantity() + " " + m.getMenuCost() + " " + m.getMenuCalories() + " " + m.getMenuReviews());
    }
  }
  /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullVendor() {
    String user;
    String password;
    System.out.println("enter the username");
    user = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("enter password");
    password = String.valueOf(pwd);
    int count = VendorFactory.validateVendor(user, password);
    System.out.println(count);
    if (count == 1) {
      Vendor vendorFound = VendorFactory.findByVendorName(user);
      System.out.println(vendorFound);
    } else {
      System.out.println("invalid credentials..");
    }
    //Vendor[] vendor = VendorFactory.showVendor();
    //System.out.println("vendorid name username number email password");
    //for (Vendor m : vendor) {
    //  System.out.println(m.getVendorId() + " " + m.getVendorName() + " " + m.getVendorUsername()
    //      + " " + m.getVendorNumber() + " " + m.getVendorEmail() + " " + m.getVendorPassword());
    //}
  }
  /**
<<<<<<< HEAD
   * Place order for customer.
   * @param order for accepting order details.
   * @return order status.
   */
  public static String placeOrder(final Orders order) {
    Menu menu = dao().findByMenuId(order.getMenuId());
    Wallet wallet = dao().getWalletInfo(order.getWalletType(), order.getCustomerId());
    System.out.println(wallet.getWalletAmount());
    double walAmount = wallet.getWalletAmount();
    double price = menu.getMenuCost();
    Date today = new Date();
    System.out.println(order.getOrderDate());
    long diffTime = order.getOrderDate().getTime() - today.getTime();
    long diffDays = diffTime / (60 * 60 * 1000 * 24);
    double totalAmount = price * order.getOrderQuantity();
    Date today = new Date();
    long diffTime = order.getOrderDate().getTime() - today.getTime();
    long diffdays = diffTime / (60 * 60 * 1000 * 24);
    // System.out.println("Diff Time "+ diffDays);
    if (walAmount < totalAmount) {
      return "Insufficient Funds...";
<<<<<<< HEAD
    } else if (diffdays < 0) {
<<<<<<< HEAD
      return "You cannot placeorder yesterday";
=======
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullOrders() {
    Orders[] order = OrderFactory.showOrder();
    System.out.println("vendorid name username number email password");
    for (Orders m : order) {
      System.out.println(m.getOrderId() + " " + m.getCustomerId() + " " + m.getVendorId()
          + " " + m.getMenuId() + " " + m.getOrderStatus() + " " + m.getOrderComments() + " " + m.getOrderTotalamount()
          + " " + m.getOrderDate() + " " + m.getOrderQuantity());
    }
  }
   /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullCustomer() {
    String user;
    String password;
    System.out.println("enter the username");
    user = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("enter password");
    password = String.valueOf(pwd);
    int count = CustomerFactory.validateCustomer(user, password);
    System.out.println(count);
    if (count == 1) {
      Customer customerFound = CustomerFactory.findByCustomerName(user);
      System.out.println(customerFound);
>>>>>>> cd52de2d9d953efd682252ed1602f3f31ca689c6
=======
    } else if (diffDays < 0) {
      return "Order Cannot placed yesterday...";
>>>>>>> 6db6efb5881e4b3697d51e864a6a25443cbe4123
=======
      return "Please Enter valid Date";
>>>>>>> 86794babf968a27b49364007655274b2f311840c
    } else {
      System.out.println("invalid credentials..");
    }
  }
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
