/*
 * @(#)XMLTestLister.java	1.5 06/10/10
 * 
 * Copyright  1990-2008 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation. 
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt). 
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA 
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions. 
 */

package gunit.textui ;

import java.lang.reflect.* ;
import gunit.lister.* ;

/**
 * <code>XMLTestLister</code> is an implementation that simply prints
 * the method name in a XML form. The listing format can be treated as
 * a template for specifying the arguments for the testcases in 
 * <Code>gunit.textui.TestRunner</code>
 */
public class XMLTestLister extends BaseTestLister {
    public XMLTestLister() {
    }

    public void listTestCase(Method method) {
        String method_name = (method.getDeclaringClass().getName()+"."+
                              method.getName()).replace('.', '-') ;
        this.out.println("<"+method_name+">") ;
        this.out.println("   <args></args>") ;
        this.out.println("</"+method_name+">") ;

    }

    public static void main(String[] args) {
        XMLTestLister lister = new XMLTestLister() ;
        lister.start(args) ;
        System.exit(0) ;
    }
}
