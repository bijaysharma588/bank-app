package test;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valid = 0;
int invalid = 0;
int no;
for(int i=0; i<args.length; i++) {
	try {
		no = Integer.parseInt(args[i]);
		
	}
	catch(NumberFormatException e) {
		invalid = invalid +1;
		System.out.println("Invalid = "+ args[i]);
		continue;
	}
valid = valid +1;
	}
System.out.println("Valid = " + valid);
System.out.println("Invalid = " + invalid);
	}
	
}
