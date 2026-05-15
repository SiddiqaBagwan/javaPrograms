class Rental{
	public String name;
	public int days;
	public int rent;
	public double totalRent;
	
	public Rental(String name,int days,int rent){
		this.name=name;
		this.days=days;
		this.rent=rent;
	}
	
	public void calc(){
		this.totalRent=this.days*this.rent;
	}
	
	public void display(){
		System.out.println(this.name);
		System.out.println(this.days);
		System.out.println(this.rent);
		System.out.println(this.totalRent);
	}
}

class Bike extends Rental{
	
	public Bike(String name,int days,int rent){
		super(name,days,rent);
	}
	
	@Override
	public void calc(){
		totalRent=days*rent;
		totalRent=totalRent-(rent*10/100)+(days*100);	
	}
}

public class Test2{
	
	public static void main(String[] args){
		Bike b=new Bike("to",8,1000);
		b.calc();
		b.display();
	}
}
