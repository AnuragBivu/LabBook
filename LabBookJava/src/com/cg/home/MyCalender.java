package com.cg.home;

import java.util.*;
public class MyCalender {
 public static void main(String[] args)
    {
       
        Calendar cal = Calendar.getInstance();
        System.out.println("Today'sDay: " + cal.get(Calendar.DATE));
        System.out.println("Of Month: " + cal.get(Calendar.MONTH));
        System.out.println("Of Year: " + cal.get(Calendar.YEAR));
    }
}

