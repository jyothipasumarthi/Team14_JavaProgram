import java.util.Scanner;
public class Student {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("StudentName : ");
		String Name=sc.next();
		System.out.println("StudentId : ");
		int Id=sc.nextInt();
		System.out.println("StudentAge : ");
		int Age=sc.nextInt();
		System.out.println("StudentGender : ");
		char Gender=sc.next().charAt(0);
		System.out.println("StudentMobile : ");
		int Mobile=sc.nextInt();
		System.out.println("StudentGrade : ");
		char Grade=sc.next().charAt(0);
		System.out.println("StudentAddress : ");
		String Address=sc.next();
		System.out.println("CollegeName : ");
		String College=sc.next();
		System.out.println("The details of Student are : ");
		System.out.println("Name : "+Name);
		System.out.println("Id : "+Id);
		System.out.println("Age : "+Age);
		System.out.println("Gender : "+Gender);
		System.out.println("Mobile : "+Mobile);
		System.out.println("Grade : "+Grade);
		System.out.println("Address : "+Address);
		System.out.println("College : "+College);
	}
}
		