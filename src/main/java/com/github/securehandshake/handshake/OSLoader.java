/*
 * Copyright (C) 2015 "Handshake App Team"
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
