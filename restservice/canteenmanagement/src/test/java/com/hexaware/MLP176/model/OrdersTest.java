
package com.hexaware.MLP176.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;

//import com.hexaware.MLP176.model.Orders;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// import com.hexaware.MLP176.factory.CustomerFactory;
// import com.hexaware.MLP176.factory.MenuFactory;
import com.hexaware.MLP176.factory.OrderFactory;
// import com.hexaware.MLP176.factory.VendorFactory;
// import com.hexaware.MLP176.factory.WalletFactory;
import com.hexaware.MLP176.persistence.OrderDAO;
// import com.hexaware.MLP176.factory.CustomerFactory;
// import com.hexaware.MLP176.factory.MenuFactory;
// import com.hexaware.MLP176.factory.OrderFactory;
// import com.hexaware.MLP176.factory.VendorFactory;
// import com.hexaware.MLP176.factory.WalletFactory;

import org.junit.Before;
//import org.junit.runner.RunWith;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mock;
//import mockit.integration.junit4.JMockit;
import mockit.MockUp;
import mockit.Mocked;

// import java.util.ArrayList;
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
    Vendor v = new Vendor();
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
    Orders m = new Orders();
    assertNotNull(m);
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

    m.setOrderId(1);
    m.setCustomerId(101);
    m.setVendorId(4);
    m.setMenuId(1);
    m.setOrderStatus(OrderStatus.ACCEPTED);
    m.setOrderComments("SWEET");
    m.setOrderTotalamount(20.00000);
    m.setOrderDate(odt);
    m.setOrderQuantity(4);
    m.setWalletType(WalletType.PAYTM);

    assertEquals(1, m.getOrderId());
    assertEquals(101, m.getCustomerId());
    assertEquals(4, m.getVendorId());
    assertEquals(1, m.getMenuId());
    assertEquals(OrderStatus.ACCEPTED, m.getOrderStatus());
    assertEquals("SWEET", m.getOrderComments());
    assertEquals(20.00000, m.getOrderTotalamount(), 0);
    assertEquals(odt, m.getOrderDate());
    assertEquals(4, m.getOrderQuantity());
    assertEquals(WalletType.PAYTM, m.getWalletType());
  }
  /**
   * Tests the order class.
   * @param dao for mocking data acces obj.
   */
  @Test
  public final void testListAllEmpty(@Mocked final OrderDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Orders>();
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] m = OrderFactory.showOrder();
    assertEquals(0, m.length);
  }
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class.
   * @throws ParseException for date format validation.
   * param custId to cust id.
   */

  @Test
  public final void testListAllSome(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
    String dtt = new String("2020-04-18");
    Date odtt = sdff.parse(dtt);
    final Orders o2 = new Orders(1, 100, 2, 1, OrderStatus.ACCEPTED, "SWEET", 200.00000, odt, 4, WalletType.PAYTM);
    final Orders o3 = new Orders(2, 101, 3, 2, OrderStatus.REJECTED, "SPICY", 300.00000, odtt, 3, WalletType.GOOGLE_PAY);
    final ArrayList<Orders> on = new ArrayList<Orders>();
    on.add(o2);
    on.add(o3);
    new Expectations() {
      {
        dao.show(); result = on;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] on1 = OrderFactory.showOrder();
    assertEquals(2, on1.length);
    assertEquals(1, on1[0].getOrderId());
    assertEquals(100, on1[0].getCustomerId());
    assertEquals(101, on1[1].getCustomerId());
    assertEquals(1, on1[0].getMenuId());
    assertEquals(2, on1[1].getMenuId());
    assertEquals(2, on1[0].getVendorId());
    assertEquals(3, on1[1].getVendorId());
    assertEquals(4, on1[0].getOrderQuantity());
    assertEquals(3, on1[1].getOrderQuantity());
    assertEquals("SWEET", on1[0].getOrderComments());
    assertEquals("SPICY", on1[1].getOrderComments());
    assertEquals(200.00000, on1[0].getOrderTotalamount(), 0);
    assertEquals(300.00000, on1[1].getOrderTotalamount(), 0);
  }
}
