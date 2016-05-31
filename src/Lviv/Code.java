package Lviv;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Code {

	public static void main(String[] args) {
	
		int i,j;
		char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};		
	    int a=abc.length;	
	    String b,t;	  	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your message");
	    b= sc.nextLine();
	    b=b.toLowerCase();
	    int c=b.length();	  
	    Scanner bias = new Scanner(System.in);
	    System.out.println("Enter bias");
	    int d = bias.nextInt();
	    char[] e=b.toCharArray(); 
	    Scanner td = new Scanner(System.in);
	    System.out.println("Enter what you wont to do:(code/decode)");
	    t=td.nextLine();
	    
	    switch(t){
	    
	    case "code":
	    	for(i=0; i<c; i++){
		    	for(j=0; j<a; j++){
					if(abc[j]==e[i]){	
						if(j+d<a){
						System.out.print(abc[(j+d)]);
						}
						else{
						System.out.print(abc[j-a+d]);
						}
						
					}
				}
	    	
	    }
	   break;
	   
	    case "decode":
	    	for(i=0; i<c; i++){
		    	for(j=0; j<a; j++){
					if(abc[j]==e[i]){	
						if(j-d>=0){
						System.out.print(abc[(j-d)]);
						}
						else{
						System.out.print(abc[j-d+a]);
						}
						
					}
				}
	    	
	    	
	    }
	    	
	    	break;
	    }
	    
	}

}
