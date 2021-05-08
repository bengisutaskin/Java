package arraysDemo1;

public class Main {

	public static void main(String[] args) {
		String student1="Bengisu";
		String student2="Engin";
		String student3="Fatmanur";
		
		System.out.println(student1);
		System.out.println(student2);

		System.out.println(student3);
		
		
		String[] students = new String[5];
		students[0]="Bengisu";
		students[1]="Engin";
		students[2]="Nursu";
		students[3]="Ahmet";
		students[4]="Fatma";
		
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------");
		
		for(String student:students) {
			System.out.println(student);
		}
		

	}

}
