package handson;

import java.io.*;
import java.util.*;

class Data implements Serializable {
	
	 UUID serialversionUID = new UUID(100,10);
	 transient int id;
	 transient int age;
	 String name;
	transient int batch;
	 String department;


	 public Data(int id, String name, int age ,int batch,String department)
	 {
		 this.id = id;
		 this.name = name;
		 this.age = age;
		 this.batch=batch;
		 this.department=department;
	 }
}
 public class Question4{ 
	 public static void display(Data d){
		 System.out.println("ID: " + d.id);
		 System.out.println("Name: " + d.name);
		 System.out.println("Age: " + d.age);
		 System.out.println("Batch: " + d.batch);	
		 System.out.println("Department: " + d.department);	
	 }
	 public static void main(String []args){
		 Data d = new Data(1, "Snigdha", 22,2,"CSE");
		 try {
			
			 FileOutputStream file = new FileOutputStream("store.txt");
			 ObjectOutputStream out = new ObjectOutputStream(file);
			 out.writeObject(d);
			 out.close();
			 file.close();
			 System.out.println("Before deserialization:\n ");
			 display(d);
		 }
		 catch (Exception e) {
			 System.out.println("Exception Caught");
		 }
		 d = null;
		 try {
			
			 FileInputStream file = new FileInputStream("store.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 d = (Data) in.readObject();
			 in.close();
			 file.close();
			 System.out.println("After deserialization:\n ");
			 display(d);
		 }
		 catch (Exception e) { 
			 System.out.println("Exception Caught");
		 }
	 }

 }