
package com.hexaware.MLP176.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 */
  private int foodId;
  /**
 * foodName to store foodName.
 */
  private String foodName;
  /**
  * foodDetail to store foodDetail.
   */
  private String foodDetail;
   /**
  * foodPrice to store foodPrice.
   */
  private Double foodPrice;
   /**
  * foodStatus to store foodStatus.
   */
  private FoodStatus foodStatus;
     /**
  * foodRating to store foodRating.
   */
  private String foodRating;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * @param argFoodName to initialize food Name.
 * @param argFoodPrice to initialize food price.
 * @param argFoodDetail to initialize food Detail.
 * @param argFoodStatus to initialize food Status.
 * @param argFoodRating to initialize food Rating.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final Double argFoodPrice,
        final String argFoodDetail, final FoodStatus argFoodStatus, final String argFoodRating) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.foodPrice = argFoodPrice;
    this.foodDetail = argFoodDetail;
    this.foodStatus = argFoodStatus;
    this.foodRating = argFoodRating;
  }

  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
       /**
     * @return this food item Name.
     */
  public final String getFoodName() {
    return foodName;
  }
       /**
       * @param argFoodName gets the food item Name.
       */
  public final void setFoodName(final String argFoodName) {
    this.foodName = argFoodName;
  }
     /**
     * @return this food item Detail.
     */
  public final String getFoodDetail() {
    return foodDetail;
  }
       /**
       * @param argFoodDetail gets the food item Detail.
       */
  public final void setFoodDetail(final String argFoodDetail) {
    this.foodDetail = argFoodDetail;
  }
    /**
     * @return this food item Price.
     */
  public final Double getFoodPrice() {
    return foodPrice;
  }
       /**
       * @param argFoodPrice gets the food item Price.
       */
  public final void setFoodPrice(final Double argFoodPrice) {
    this.foodPrice = argFoodPrice;
  }
    /**
     * @return this food item Status.
     */
  public final FoodStatus getFoodStatus() {
    return foodStatus;
  }
       /**
       * @param argFoodStatus gets the food item Status.
       */
  public final void setFoodStatus(final FoodStatus argFoodStatus) {
    this.foodStatus = argFoodStatus;
  }
      /**
     * @return this food item Rating.
     */
  public final String getFoodRating() {
    return foodRating;
  }
       /**
       * @param argFoodRating gets the food item Rating.
       */
  public final void setFoodRating(final String argFoodRating) {
    this.foodRating = argFoodRating;
  }
}
