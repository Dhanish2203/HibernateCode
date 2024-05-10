package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
 public static String getStringFromCalendar(Calendar c) {
  //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
  String s=null;
  try {
      s = sdf.format(c);
    
  } catch (Exception e) {
      throw e;
  }
   return s;
      
 }
 public static Calendar getCalendarFromString(String s) throws Exception{
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
  Calendar c = Calendar.getInstance();
  try {
      
      Date d= sdf.parse(s);
      c.setTime(d);
     
  } catch (Exception e) {
      throw e;
  }
  return c;
 }

}