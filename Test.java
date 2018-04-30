package test;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i ;
for(i=1;i<=10;i++) {
	if(i==5) {
		continue;
	}
	if(i==8) {
		break;
	}
	System.out.println(i);
}
}

}
