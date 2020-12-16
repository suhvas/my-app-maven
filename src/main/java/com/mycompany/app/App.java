package com.mycompany.app;

public class App 
{
    public int addNumbers(int numberOne, int numberTwo){
	return (numberOne + numberTwo);
    }
	
    public int subtractNumbers(int numberOne, int numberTwo) {
	return (numberOne - numberTwo);
    }
	
    public static void main(String[] args){
	App app = new App();
	System.out.println(app.addNumbers(5, 9));
    }    
}
