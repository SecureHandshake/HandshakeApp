/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.securehandshake.handshake;

/**
 *
 * @author The Handshake Team
 */
public class OSLoader {
   public static String getOsName(){
       return System.getProperty("os.name");
   }
   public static String getOsArch(){
       return System.getProperty("os.arch");
   }
   public static void displayOsdetails(){
       String osName=getOsName();
       String osArch=getOsArch();
       System.out.println("Current OS and architecture: "+osName+" "+osArch);
   }
   public static boolean isWindows(){
       return getOsName().startsWith("Windows");
   }
   public static boolean isLinux(){
       return getOsName().startsWith("Linux");
   }
       
   public static void main(String args[]){
      displayOsdetails();
 }
}
