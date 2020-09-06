package com.Sunday0906;

public class TestPlane {
  public static void main(String[] args) {
	Plane p =new Zhandouji();
	p.fly();
	Zhandouji z = (Zhandouji)p;
	z.war();  
	
	Plane p1 =new Keji();
	p1.fly();
	Keji k = (Keji)p1;
	k.load();
	}
}
