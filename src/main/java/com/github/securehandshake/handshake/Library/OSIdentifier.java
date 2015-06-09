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
package com.github.securehandshake.handshake.Library;

/**
 *
 * @author The Handshake Team
 */
public class OSIdentifier {
    /*
     Creating an enumeration to list operating systems Handshake's link libraries 
     will support
     */

    public static enum OperatingSystem {
        /*
         All Windows/Windows Server/Windows NT versions
         */

        WINDOWS,
        /*
         All Mac OS/Mac OS X/OS X versions
         */
        MAC,
        /*
         The core Linux operating systems and all distributions based on it
         such as Debian, Ubuntu, Mint, RHEL, Fedora etc.
         */
        LINUX,
        /*
         For any other operating systems for which Handshake does not contain a link library
         */
        UNKNOWN
    }
    /*
     Creating an enumeration to list supported system architectures the JRE can use to
     run Handshake
     */

    public static enum SystemArchitecture {
        /*
         32-bit architecture (also known as i386 or x86)
         */

        THIRTYTWOBIT,
        /*
         64-bit architecture (also known as amd64 or x64)
         */
        SIXTYFOURBIT,
        /*
         For lower/higher/incompatible/to be invented architectures 
         */
        UNKNOWN
    }
    /*
     Function to fetch current host operating system the JRE is running on
     */

    public static OperatingSystem fetchCurrentOs() {
        OperatingSystem currentOs = OperatingSystem.UNKNOWN;
        if (System.getProperty("os.name").startsWith("Windows")) {
            currentOs = OperatingSystem.WINDOWS;
        }
        if (System.getProperty("os.name").startsWith("Linux")) {
            currentOs = OperatingSystem.LINUX;
        }
        if (System.getProperty("os.name").startsWith("Mac")) {
            currentOs = OperatingSystem.MAC;
        }
        return currentOs;
    }
    /*
     Function to fetch current system architecture the JRE is running on.
     Please note that this function reports JRE architecture and not the host
     operating system's architecture, hence a 64-bit operating system running
     a 32-bit JRE will be reported by OSIdentifier as having 32-bit architecture.
     */

    public static SystemArchitecture fetchCurrentArch() {
        SystemArchitecture currentArch = SystemArchitecture.UNKNOWN;
        if (System.getProperty("os.arch").equalsIgnoreCase("i386")) {
            currentArch = SystemArchitecture.THIRTYTWOBIT;
        }
        if (System.getProperty("os.arch").equalsIgnoreCase("amd64")) {
            currentArch = SystemArchitecture.SIXTYFOURBIT;
        }
        return currentArch;
    }
}
