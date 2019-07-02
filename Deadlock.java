package com.st.day4hw;

public class Deadlock {
    public static void main(String[] args) {
	    final String resource1 = "thing1";
	    final String resource2 = "thing2";
	
	    Thread t1 = new Thread(){
		    public void run() {
		        synchronized(resource1) {
			        System.out.println("t1 has resource 1");
		        }
		        try{
			        Thread.sleep(1000);
		        }
		        catch (Exception e) {}
		
		        synchronized(resource2) {
			        System.out.println("t1 has resource 2");
		        }
		    }
	    };
	
	    Thread t2 = new Thread(){
		    public void run() {
		        synchronized(resource2) {
			        System.out.println("t2 has resource 2");
		        }
		        try{
			        Thread.sleep(1000);
		        }
		        catch (Exception e) {}
		
		        synchronized(resource2) {
			        System.out.println("t2 has resource 1");
		        }
		    }
	    };
	
	    t1.start();
	    t2.start();
    }
}
