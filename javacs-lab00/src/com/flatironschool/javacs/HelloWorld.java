package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String java_version = System.getProperty("java.specification.version");
        return Double.parseDouble(java_version);
    }

    public static void main(String[] args) {
	    Double java_version = getVersion();
	    System.out.println(java_version);
    }
}
