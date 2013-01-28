package com.java;
public class Sample {


Sample (){
System.out.println("this is constructor");
}

public void display() {
System.out.println("this is display()");
}


public static void main(String args[]){
Sample s = new Sample();
s.display();
}
}
