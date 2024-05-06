package Encapculation;
class Student{
	private int rollno;
	 private String name;


 public void setRollno(int rollno) {
	 this.rollno = rollno;
	 }
 public int  getRollno() {
	 return rollno;
 }
 public void setStringname(String name) {
	 this.name = name;
	 }
 public String  getStringname() {
	 return name;
 
 
 }} // class student is the capsule where everything is inside the braces

public class Classnew {
	public static void main(String[] args) {
	
		
		Student obj = new Student();
		obj.setRollno(27);
		obj.getRollno();
		obj.setStringname("Meera");
		obj.getStringname();
		System.out.println(obj.getRollno());
		System.out.println(obj.getStringname());
		
		
		
}}