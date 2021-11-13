package codes;

public class ArrayTest {
	
	String[] firstName= {"Dennis", "Grace","Bjarne","James"};
	String[] lastName = new String[firstName.length]; 
	
	void printNames() {
		int i=0;
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayTest a = new ArrayTest();
		a.printNames();
		System.out.println("-------");
		a.lastName[0]="Ritchie";
		a.lastName[1]="Hopper";
		a.lastName[2]="stroustrup";
		a.lastName[3]="Gosling";
		a.printNames();
		
	}

}
