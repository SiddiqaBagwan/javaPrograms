/*
import java.util.*;
import java.io.*;
class NotFound extends Exception{
	NotFound(String msg){
		super (msg);
	}
}

class Taken extends Exception{
	Taken(String msg){
		super(msg);
	}
}

class DateErr extends Exception{
	DateErr(String msg){
		super(msg);
	}
}

class Book{
	String name;
	boolean status;
	
	Book(String name){
		this.name=name;
		this.status=false;
	}
}

public class Library{
	Book[] list=new Book[5];
	int count=0;
	
	void add(String name){
		if(count<5){
			list[count++]=new Book(name);
		}
	}
	
	void issue(String name)throws NotFound,Taken{
		for(int i=0;i<count;i++){
			if(list[i].name.equalsIgnoreCase(name)){
				if(list[i].status)throw new Taken("taken");
				list[i].status=true;
				System.out.println("issued");
				return;
			}
		}
		throw new NotFound("not found");
	}
	
	void returnB(String name,int days)throws DateErr,NotFound,Taken{
		for(int i=0;i<count;i++){
			if(list[i].name.equalsIgnoreCase(name)){
				if(!list[i].status)
				throw new Taken("not issued");
				
				if(days<=0){
					throw new DateErr("invalid date");
				}
				
				list[i].status=false;
				System.out.println("returned");
				
				if(days>7){
					int fine=(days-7)*10;
					System.out.println("fine"+fine);
				}
				return;
				
			}
		}
		throw new NotFound("not found");
	}
	
	
	   public static void main(String[] args) {
		   Library lib=new Library();
		   lib.add("java");
		   lib.add("python");
	   }
	
} */








import java.util.*;


class NotFound extends Exception{
	NotFound(String msg){
		super(msg);
	}
}

class Taken extends Exception{
	Taken(String msg){
		super(msg);
	}
}

class DateErr extends Exception{
	DateErr(String msg){
		super(msg);
	}
}

class Book{
	String name;
	boolean status;
	
	Book(String name){
		this.name=name;
		this.status=false;
	}
}

public class Library{
	Book[] list=new Book[5];
	int count=0;
	
	void add(String name){
		if(count<5){
			list[count++]=new Book(name);
		}
	}
	
	void issue(String name) throws NotFound,Taken{
		for(int i=0;i<count;i++){
			if(list[i].name.equalsIgnoreCase(name)){
				if(list[i].status)throw new Taken("taken");
				list[i].status=true;
				System.out.println("issued");
				return;
			}
		}
		throw new NotFound("notfound");
	}
	
	void returnB(String name,int days)throws NotFound,Taken,DateErr{
		for(int i=0;i<count;i++){
			if(list[i].name.equalsIgnoreCase(name)){
				if(!list[i].status)throw new Taken("not issued");
				
				if(days<0)throw new DateErr("invalid date");
				
				list[i].status=false;
				System.out.println("returned");
				
				if(days>7){
					int fine=(days-7)*10;
					System.out.println("fine "+fine);
				}
				return;
				
			}
		}
		throw new NotFound("notfound");
	}
	
	public static void main(String[] args){
		Library lib=new Library();
		lib.add("python");
		try{
			lib.issue("python");
			lib.returnB("python",12);
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
		}
	}
}
