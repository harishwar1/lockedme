package LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Welcome {
	static ArrayList<String> arr= new ArrayList<>();
	
public static void main(String[] args) {
	
	arr.add("books");
	arr.add("fruits");
	arr.add("proteins");
	arr.add("java");
	arr.add("python");
	
	wel();
	
}

private static void wel() {
	// TODO Auto-generated method stub
	System.out.println("Welcome to Lockedme.com");
	System.out.println("Developed by Kallu Harishwar Reddy");
	System.out.println("1.Current Files");
	System.out.println("2.More Options");
	System.out.println("3.close");
	System.out.println("Choose Option");
	options();
	
}

public static void options() {
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	switch(a) {
	   case 1: ShowFiles();
	   break;
	   case 2: List();
	   break;
	   case 3: close();
	   break;
	   default : System.out.println("Wrong input");
	   options();
	
	}
	
}

private static void List() {
	// TODO Auto-generated method stub
	System.out.println("1.Add Files");
	System.out.println("2.Delete File");
	System.out.println("3.Search Files");
	System.out.println("4.back");
	System.out.println("Choose Option");
	Scanner sa= new Scanner(System.in);
	int b= sa.nextInt();
	switch(b) {
	case 1: addFile();
	break;
	case 2: deleteFile();
	break;
	case 3: searchFile();
	break;
	case 4: wel();
	break;
	default : System.out.println("Wrong input");
	List();
	}
	
}

private static void searchFile() {
	// TODO Auto-generated method stub
	
	Scanner z =new Scanner(System.in);
	System.out.println("Enter file name to search :");
	String x=z.nextLine();
	if(arr.contains(x)) {
		System.out.println("file " +x + " found");
	}
	else System.out.println("File "+ x +" not found");
	System.out.println("press 1 to go back or press 2 to close");
	int q=z.nextInt();
	
	switch(q) {
	case 1:wel();
	break;
	case 2: close();
	}
}

private static void deleteFile() {
	// TODO Auto-generated method stub
	Scanner sca =new Scanner(System.in);
	System.out.println("Enter file name to delete");
	String a =sca.nextLine();
	if(arr.contains(a)) {
		arr.remove(a);
		System.out.println(a+ "file deleted");
	}
	else System.out.println("file not found");
	System.out.println("press 1 for listing files or press 2 to close");
     int m=sca.nextInt();
     switch(m) {
     case 1: ShowFiles();
     break;
     case 2: close();
     break;
     }
	
}

private static void addFile() {
	// TODO Auto-generated method stub
	System.out.println("Enter file name");
	Scanner b=new Scanner(System.in);
	String s=b.next();
	arr.add(s);
	System.out.println("press 1 to list files or press 2 to close");
	Scanner c= new Scanner(System.in);
	int a=c.nextInt();
	switch(a) {
	case 1: ShowFiles();
	break;
	
	case 2: close();
	break;
	
	}
}



private static void close() {
	// TODO Auto-generated method stub
	System.out.println("Thank you");
    System.exit(0);
}

private static void ShowFiles() {
	// TODO Auto-generated method stub

	
	Collections.sort(arr);
	
	System.out.println("List of files : ");
	for(int i=0;i<arr.size();i++) {
		System.out.println(arr.get(i));
	}
	System.out.println("press 1 for back");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	  switch(a) {
	       case 1: wel();
	       break;
	       default : System.out.println("wrong input");
           ShowFiles();
	}
	
	
}
}
