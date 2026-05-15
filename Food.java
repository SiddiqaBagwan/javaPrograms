class Order{
	int id;
	String item;
	
	public Order(int id,String item){
		this.id=id;
		this.item=item;
	}
}

class Agent extends Thread{
	
	String n;
	Order[] o;
	
	Agent(String n,Order[] o){
		this.n=n;
		this.o=o;
	}
	
	public void run(){
		for(Order od:o){
			try{
				Thread.sleep(2000);
				System.out.println(n+" picked "+od.item);
				System.out.println(n+" delivered "+od.item+" "+od.id);
			
			}catch(Exception e){
				System.out.println(n+" was interrupted");
			}
		}
		
	}
	
}

class Food{
	public static void main(String[] args){
		Order[] o1={new Order(11,"Si"),new Order(13,"ii")};
		Order[] o2={new Order(21,"Sio"),new Order(93,"pi")};
		
		Agent a1=new Agent("a1",o1);
		Agent a2=new Agent("a2",o2);
		
		a1.start();
		a2.start();

	}
}
