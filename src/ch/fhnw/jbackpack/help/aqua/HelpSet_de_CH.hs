<?xml version='1.0' encoding='ISO-8859-1' ?>
<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN"
         "http://java.sun.com/products/javahelp/helpset_1_0.dtd">
<helpset xml:lang=de version="1.0">
   <!-- title -->
   <title>JBackpack-Hilfe</title>

   <!-- maps -->
   <maps>
     <homeID>Index</homeID>
     <mapref location="de_CH/jhelpmap.jhm" />
   </maps>

   <!-- views -->
   <view>
      <name>TOC</name>
      <label>Inhaltsverzeichnis</label>
      <type>javax.help.TOCView</type>
      <data>de_CH/jhelptoc.xml</data>
   </view>
   <view>
      <name>Index</name>
      <label>Index</label>
      <type>javax.help.IndexView</type>
      <data>de_CH/jhelpidx.xml</data>
   </view>
   <view>
      <name>Search</name>
      <label>Search</label>
      <type>javax.help.SearchView</type>
      <data engine="com.sun.java.help.search.DefaultSearchEngine">
         JavaHelpSearch_de
      </data>
   </view>

</helpset>
