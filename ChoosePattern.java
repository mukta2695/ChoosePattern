import java.util.Scanner;
class Tree{
	public void numTree() {
		for (int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}

class AlphaTree {
	public void alTree() {
		for(int i=65; i<=67; i++){
			for(char ch=65; ch<=i; ch++) {
				System.out.print(ch);
				}
			System.out.println();
			}	
	}
}

class Box {
	public void dollarBox() {
		for(int i=1; i<=4; i++) {
			if(i==1 || i==4) {
				for(int j1=1; j1<=4; j1++) {
					System.out.print("$");
				}
			}
			else {
				System.out.print("$  $");
			}
			System.out.println();
		}
	}
}
public class ChoosePattern {
public static void main(String[] args) {
	int choice;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter your choice as 1, 2 or 3 for the following:");
	System.out.println("1. Number Tree\n" + "2. Alphabet Tree\n"+ "3. Dollar box\n");
	choice= in.nextInt();
	
	switch(choice) {
	case 1:
		Tree obj1= new Tree();
		obj1.numTree();
		break;
	case 2:
		AlphaTree obj2= new AlphaTree();
		obj2.alTree();
		break;
	case 3:
		Box obj3= new Box();
		obj3.dollarBox();
		break;
	}
}
}
