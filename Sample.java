package com.java;
public class One {


One (){
System.out.println("this is constructor");
}

public void display() {
System.out.println("this is display()");
}


public static void main(String args[]){
One s = new One();
s.display();
}
}
