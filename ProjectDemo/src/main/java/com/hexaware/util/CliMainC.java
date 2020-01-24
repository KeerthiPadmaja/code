package com.hexaware.util;
import com.hexaware.factory.CustomerFactory;
import com.hexaware.model.Customer;
import java.util.List;
import java.util.Scanner;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 public class CliMainC {
     public static void main(String[] args) {
         List<Customer> lstCustomer=CustomerFactory.showCustomer();
         for(Customer e : lstCustomer) {
             System.out.println(e);
        }

        Customer customer = new Customer();
        Scanner option = new Scanner(System.in);
        System.out.println("Enter Customer No  ");
        customer.setCUS_ID(option.nextInt());
        System.out.println("Enter Customer Name  ");
        customer.setCUS_NAME(option.next());
        System.out.println("Enter Password  ");
        customer.setCUS_PASSWORD(option.next());
        System.out.println("Enter Mail Id  ");
        customer.setCUS_EMAIL(option.next());
        System.out.println("Enter Mobile number ");
        customer.setCUS_MOBILE(option.next());
        System.out.println("Enter DOB  ");
        customer.setCUS_DOB(option.next());
        System.out.println("Enter Address  ");
        customer.setCUS_ADDRESS(option.next());
      //  System.out.println(CustomerFactory.addCustomer(customer));
        /**
         Scanner option = new Scanner(System.in);
         System.out.println("Enter Customer Id  ");
         int CustomerId=option.nextInt();
         Customer Customer = CustomerFactory.showCustomer(CustomerId);
         if(Customer !=null) {
             System.out.println(Customer);
         } else {
             System.out.println("Customer Not Found...");
         }
         */

         Runtime.getRuntime().halt(0);  
        }
 }