package Mathlabprograms;

public class Evaluatexpowern {
public static void main(String[] args) {
	int x=2;
	int y=-3;
	float temp=1;
	if(y>0) {
	for (int i = 1; i <=y; i++) {
		temp=temp*x;
	}
	System.out.println(temp);
	}
	else {
		for (int i = 1; i <=(-y); i++) {
			temp=temp*x;
		}
		System.out.println(1/temp);
		}
		
		
	}
	}

