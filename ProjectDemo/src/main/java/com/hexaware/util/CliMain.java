package com.hexaware.util;
import com.hexaware.factory.VendorFactory;
import com.hexaware.model.Vendor;
import java.util.List;
import java.util.Scanner;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 public class CliMain {
     public static void main(String[] args) {
         List<Vendor> lstVendor=VendorFactory.showVendor();
         for(Vendor e : lstVendor) {
             System.out.println(e);
         }
         Scanner option = new Scanner(System.in);
         System.out.println("Enter Vendor Id  ");
         int VendorId=option.nextInt();
         Vendor Vendor = VendorFactory.showVendor(VendorId);
         if(Vendor !=null) {
             System.out.println(Vendor);
         } else {
             System.out.println("Vendor Not Found...");
         }
         Runtime.getRuntime().halt(0);
     }
 }