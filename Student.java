public class Student{
private int ID;
private String name;
private double[] marks;

public void setID(int id){
	ID=id;
}

public void setName(String n){
	name=n;
}

public void setMarks(double[] m){
	marks=m;
}

public int getID(){
	return ID;
}

public String getName(){
	return name;
}

public double[] getMarks(){
	return marks;
}

public double calcAvg(){
	double total=0;
	for(int i=0;i<marks.length;i++){
		total+=marks[i];
	}
	return total/marks.length;
}

public String result(){
	double avg=calcAvg();
	if(avg>50){
		return "pass";
	}
	else{
		return "fail";
	}
}

public void display(){
	System.out.println("name"+getName());
	System.out.println("id"+getID());
	System.out.println("avg"+calcAvg());
	System.out.println("result"+result());

}


public static void main(String[] args){
	Student s=new Student();
	s.setName("SI");
	s.setID(11);
	double[] marks={45,32,67,89,12};
	s.setMarks(marks);
	s.display();
}
}
