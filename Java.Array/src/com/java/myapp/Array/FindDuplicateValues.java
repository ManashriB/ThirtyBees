package com.java.myapp.Array;

public class FindDuplicateValues {

 public static void main(String[] args) {
	
String [] a ={"selenium","java","selenium","python","java"};

for(int i = 0;i<a.length;i++){
	
for(int j=i+1;j<a.length;j++){

if((a[i].equals(a[j])) &&(i !=j) ){

	System.out.println(a[j]);
      }
    }
   }
  }	
}
	
	
	
	
	
	
	
	

