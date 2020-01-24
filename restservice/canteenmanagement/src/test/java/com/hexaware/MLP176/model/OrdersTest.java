package com.hexaware.MLP176.model;
//import static org.junit.Assert.assertEquals;
//import com.hexaware.MLP175.persistence.MenuDAO;
//import com.hexaware.MLP175.factory.MenuFactory;
//import com.hexaware.MLP176.persistence.OrderDAO;
//import com.hexaware.MLP176.factory.OrderFactory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import org.junit.Test;
import org.junit.Before;
//import org.junit.runner.RunWith;

//import mockit.Expectations;
//import mockit.MockUp;
//import mockit.Mocked;
//import mockit.Mock;
//import mockit.integration.junit4.JMockit;
//import java.util.ArrayList;
    /**
   * test for orders.
   */
public class OrdersTest {
    /**
   * test for orders.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the equals/hashcode methods of the orders class.
   *  @throws ParseException for date format validation.
   */
  @Test
  public final void testEquals() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Orders o = new Orders();
    Orders order3 = null;
    Orders order1 = new Orders(1, 101, 4, 1, OrderStatus.ACCEPTED, "SWEET", 200.00000, odt, 4, WalletType.PAYTM);
    Orders order2 = new Orders(1, 101, 4, 1, OrderStatus.ACCEPTED, "SWEET", 200.00000, odt, 4, WalletType.PAYTM);
    assertTrue(order1.equals(order2));
    assertFalse(order1.equals(order3));
    Orders c = null;
    assertFalse(order1.equals(o));
    Orders v = new Orders();
    assertFalse(order1.equals(v));
    assertFalse(order1.equals(c));
    assertEquals(order1.hashCode(), order2.hashCode());
  }
  /**
   * Tests the toString() methods of the Order class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testToString() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Orders order1 = new Orders(1, 101, 4, 1, OrderStatus.ACCEPTED, "SWEET", 200.00000, odt, 4, WalletType.PAYTM);
    String result = String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s",
        order1.getOrderId(), order1.getCustomerId(), order1.getVendorId(), order1.getMenuId(), order1.getOrderStatus(),
        order1.getOrderComments(), order1.getOrderTotalamount(), order1.getOrderDate(), order1.getOrderQuantity(), order1.getWalletType());
    assertEquals(result, order1.toString());
  }
  /**
   * test for orders.
   * @throws ParseException for Checking Date Format.
   */
  @Test
   public final void testOrders() throws ParseException {
    Orders o = new Orders();
    assertNotNull(o);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Orders order = new Orders(1, 101, 4, 1, OrderStatus.ACCEPTED, "SWEET", 200.00000, odt, 4, WalletType.PAYTM);
    assertEquals(1, order.getOrderId());
    assertEquals(101, order.getCustomerId());
    assertEquals(4, order.getVendorId());
    assertEquals(1, order.getMenuId());
    assertEquals(OrderStatus.ACCEPTED, order.getOrderStatus());
    assertEquals("SWEET", order.getOrderComments());
    assertEquals(200.00000, order.getOrderTotalamount(), 0);
    assertEquals(odt, order.getOrderDate());
    assertEquals(4, order.getOrderQuantity());
    assertEquals(WalletType.PAYTM, order.getWalletType());

    o.setOrderId(1);
    o.setCustomerId(101);
    o.setVendorId(4);
    o.setMenuId(1);
    o.setOrderStatus(OrderStatus.ACCEPTED);
    o.setOrderComments("SWEET");
    o.setOrderTotalamount(20.00000);
    o.setOrderDate(odt);
    o.setOrderQuantity(4);
    o.setWalletType(WalletType.PAYTM);

    assertEquals(1, o.getOrderId());
    assertEquals(101, o.getCustomerId());
    assertEquals(4, o.getVendorId());
    assertEquals(1, o.getMenuId());
    assertEquals(OrderStatus.ACCEPTED, o.getOrderStatus());
    assertEquals("SWEET", o.getOrderComments());
    assertEquals(20.00000, o.getOrderTotalamount(), 0);
    assertEquals(odt, o.getOrderDate());
    assertEquals(4, o.getOrderQuantity());
    assertEquals(WalletType.PAYTM, o.getWalletType());
  }
}

