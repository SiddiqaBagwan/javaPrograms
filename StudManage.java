import java.util.*;
import java.io.*;

class Student{
	int id;
	String name;
	int age;
	String grade;
	
	Student(int id,String name,int age,String grade){
		this.id=id;
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public String toString(){
		return id+","+name+","+age+","+grade;
	}
}

public class StudManage{
	static ArrayList<Student> list=new ArrayList<>();
	
	public static void addStudent(Student s){
		list.add(s);
	}
	
	public static void displayStudent(){
		for(Student s:list){
			System.out.println(s.id+s.name+s.age+s.grade);
		}
	}
	
	public static void searchStudent(String name){
		boolean found=false;
		for(Student s:list){
			if(s.name.equalsIgnoreCase(name)){
				 found=true;
				 System.out.println("found");
				System.out.println(s.id+s.name+s.age+s.grade);
				
			}
		}
		if(!found){
			System.out.println("not found");
		}
	}
	
	public static void deleteStudent(int id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).id==id){
				list.remove(i);
				System.out.println("deleted");
				return;
			}
		}
		System.out.println("not found");
	}
	
	public static void saveFile()throws IOException{
		FileWriter fw=new FileWriter("student.txt");
		for(Student s:list){
			fw.write(s.toString()+"\n");
		} 
		System.out.println("saved");
		fw.close();
	}
	
	public static void loadFile()throws IOException{
		File file=new File("student.txt");
		if(!file.exists()){
			System.out.println("file not found");
			return;
		}
		Scanner read=new Scanner(file);
		while(read.hasNextLine()){
			String line=read.nextLine();
			String[] data=line.split(",");
			
			int id=Integer.parseInt(data[0]);
			String name=data[1];
			int age=Integer.parseInt(data[2]);
			String grade=data[3];
			
			list.add(new Student(id,name,age,grade));
		}
		read.close();
	}
	
	
	
	public static void main(String[] args)throws IOException{
		Scanner sc=new Scanner(System.in);
		loadFile();
		while(true){
			 System.out.println("\n1.Add");
			 System.out.println("\n2.display");
			 System.out.println("\n3.Search");
			 System.out.println("\n4.delete");
			 System.out.println("\n5.save");
			 System.out.println("\n.Exit");
			 
			 System.out.print("choice:");
			int choice=sc.nextInt();
			
			switch(choice){
				case 1:
			System.out.print("id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.print("name:");
			String name=sc.nextLine();
			
			System.out.print("age:");
			int age=sc.nextInt();
			sc.nextLine();
			
			System.out.print("grade:");
			String grade=sc.nextLine();
			
			addStudent(new Student(id,name,age,grade));
			break;
			
			case 2:
			displayStudent();
			break;
			
			case 3:
			System.out.print("name:");
			String n=sc.nextLine();
			searchStudent(n);
			break;
			
			case 4:
			System.out.print("id:");
			int d=sc.nextInt();
			sc.nextLine();
			deleteStudent(d);
			break;
			
			case 5:
			saveFile();
			
			case 6:
			saveFile();
			System.exit(0);
			
			default:
			System.out.print("invalid:");
			
			}
			
			
		}
	}
}
