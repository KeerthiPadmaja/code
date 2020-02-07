package com.hexaware.MLP176.model;
import java.util.Objects;
import java.util.Date;
/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class OrderDetail {
/**
 * ordId to store orderId.
 */
  private int ordId;
/**
 * ordTime to store time.
 */
  private Date ordTime;
  /**
 * ordAmount to store amount.
 */
  private int ordAmount;
   /**
 * ordLocation to store OrderStatus.
 */
  private OrderStatus orderStatus;
   /**
 * ordLocation to store location details.
 */
  private String ordLocation;
 /**
 * qtyOrder to store order of quantity.
 */
  private int qtyOrder;
 /**
 * cusId to store customer ID.
 */
  private int cusId;
  /**
 * foodId to store Food ID.
 */
  private int foodId;
  /**
 * venId to store vendor ID.
 */
  private int venId;
  /**
   * Default Constructor.
   */
  public OrderDetail() {

  }
/**
 * @param argOrdId to initialize order Id.
 * @param argOrdTime to initialize order Time.
 * @param argOrdAmount to initialize order Amount.
 * @param argOrderStatus to initialize order Status.
 * @param argOrdLocation to initialize order Location.
 * @param argQtyOrder to initialize quantity Order.
 * @param argCusId to initialize customer Id.
 * @param argFoodId to initialize food Id.
 * @param argVenId to initialize vendor Id.
 * used to get details through constructor.
 */
  public OrderDetail(final int argOrdId,
      final Date argOrdTime,
      final int argOrdAmount,
      final OrderStatus argOrderStatus,
      final String argOrdLocation,
      final int argQtyOrder,
      final int argCusId,
      final int argFoodId,
      final int argVenId) {
    this.ordId = argOrdId;
    this.ordTime = argOrdTime;
    this.ordAmount = argOrdAmount;
    this.orderStatus = argOrderStatus;
    this.ordLocation = argOrdLocation;
    this.qtyOrder = argQtyOrder;
    this.cusId = argCusId;
    this.foodId = argFoodId;
    this.venId = argVenId;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    OrderDetail orderdetail = (OrderDetail) obj;
    if (Objects.equals(ordId, orderdetail.ordId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(ordId);
  }
    /**
     * @return this ordId.
     */
  public final int getOrdId() {
    return ordId;
  }
    /**
     * @param argOrdId gets the ordId.
     */
  public final void setOrdId(final int argOrdId) {
    this.ordId = argOrdId;
  }
    /**
     * @return this ordTime
     */
  public final Date getOrdTime() {
    return ordTime;
  }
    /**
     * @param argOrdTime gets the ordTime.
     */
  public final void setOrdTime(final Date argOrdTime) {
    this.ordTime = argOrdTime;
  }
    /**
    * @return this ordAmount.
    */
  public final int getOrdAmount() {
    return ordAmount;
  }
    /**
    * @param argOrdAmount gets the ordAmount.
    */
  public final void setOrdAmount(final int argOrdAmount) {
    this.ordAmount = argOrdAmount;
  }
    /**
     * @return this ordLocation.
     */
  public final String getOrdLocation() {
    return ordLocation;
  }
    /**
     * @param argOrdLocation gets the ordLocation.
     */
  public final void setOrdLocation(final String argOrdLocation) {
    this.ordLocation = argOrdLocation;
  }
    /**
     * @return this orderStatus.
     */
  public final OrderStatus getOrderStatus() {
    return orderStatus;
  }
    /**
    * @param argOrderStatus gets the ordStatus.
    */
  public final void setOrdStatus(final OrderStatus argOrderStatus) {
    this.orderStatus = argOrderStatus;
  }
    /**
     * @return this qtyOrder.
     */
  public final int getQtyOrder() {
    return qtyOrder;
  }
      /**
       * @param argQtyOrder gets the qtyOrder.
       */
  public final void setQtyOrder(final int argQtyOrder) {
    this.qtyOrder = argQtyOrder;
  }

  /**
     * @return this cusId.
     */
  public final int getCusId() {
    return cusId;
  }
      /**
       * @param argCusId gets the cusId.
       */
  public final void setcusId(final int argCusId) {
    this.cusId = argCusId;
  }
    /**
     * @return this foodId.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
    * @param argFoodId gets the foodId.
    */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
    /**
     * @return this venId.
     */
  public final int getVenId() {
    return venId;
  }
    /**
    * @param argVenId gets the venId.
    */
  public final void setVenId(final int argVenId) {
    this.venId = argVenId;
  }
}
