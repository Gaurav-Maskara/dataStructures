package com.gaurav.main;

public class FrogJump {

	public static void main(String[] args) {
         int  X = 10;
	     int  Y = 85;
		 int  D = 30;
		 
		 System.out.println(FrogJump.solution(X, Y, D));
	}

	public static int solution(int X, int Y, int D) {

		if((D==0 || D<0)) {
			return 0;
		}
		
		int jumps = 0;
		int distance = X;

		while (distance < Y) {
			distance = distance + D;
			jumps++;
		}
		return jumps;
	}

}
