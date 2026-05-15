/*import java.util.*;
import java.lang.*;

class Expense{
	String name,category,month;
	int amount;
	
	Expense(String name,String category,int amount,String month){
		this.name=name;
		this.category=category;
		this.amount=amount;
		this.month=month;
	}
	
	public String toString(){
		return name+" "+category+" "+amount+" "+month;
	}

}
public class Main{
	static ArrayList<Expense> list=new ArrayList<>();
	
	public static void AddExpense(Expense e){
		list.add(e);
		System.out.println("added");
	}
	
	public static void viewExpense(){
		for(Expense e:list){
			System.out.println(e);
		}
	}
	
	public static void deleteExpense(String name){
		for(int i=0;i<list.size();i++){
			if(list.get(i).name.equalsIgnoreCase(name)){
				list.remove(i);
				System.out.println("added");
				return;
			}
		}
		System.out.println("not found");
	}
	
	public static void categorySummary(){
		HashMap<String,Integer> map=new HashMap<>();
		
		int total=0;
		for(Expense e:list){
			total+=e.amount;
			
			if(map.containsKey(e.category)){
				map.put(e.category,map.get(e.category)+e.amount);
			}
			else{
				map.put(e.category,e.amount);
			}
		}
		
		for(String category:map.keySet()){
			System.out.println(category+":"+map.get(category));
		}
		
		System.out.println("Total Expense: " +total);
	}
	
	public static void monthlyReport(String month){
		int total=0;
		for(Expense e:list){
			if(e.month.equalsIgnoreCase(month)){
				System.out.println(e);
				total+=e.amount;
			}
		}
		System.out.println("monthly Expense: " +total);
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Category Summary");
            System.out.println("5.Monthly Report");
            System.out.println("6.Exit");
            
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();
            sc.nextLine();
             switch (ch) {
				 case 1:
				 System.out.print("Enter Expense Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    int amount = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Month: ");
                    String month = sc.nextLine();

                    AddExpense(new Expense(name,category,amount,month));
            
                    break;
                    
                    
                    case 2:
                    viewExpense();
                    break;
                    
                    case 3:
                    System.out.print("Enter Expense Name to Delete: ");

                    String n = sc.nextLine();

                    deleteExpense(n);

                    break;
                    
                    case 4:

                    categorySummary();

                    break;
                    
                    case 5:

                    System.out.print("Enter Month: ");

                    String m = sc.nextLine();

                    monthlyReport(m);

                    break;
                    case 6:

                    System.exit(0);
                    default:

                    System.out.println("Invalid Choice");
			 }

		}
	}
}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
import java.util.*;

class Expense{
	String name;
	int amount;
	String month;
	String category;
	
	
	Expense(String name,String category,int amount,String month){
		this.name=name;
		this.category=category;
		this.amount=amount;
		this.month=month;
	}
	
	public String toString(){
		return name+category+amount+month;
	}
}

class Main{
	
	static ArrayList<Expense> list=new ArrayList<>();
	
	public static void AddExpense(Expense e){
		list.add(e);
		System.out.println("added");
		
	}
	
	public static void viewExpense(){
		for(Expense e:list){
			System.out.println(e);
		}
	}
	
	public static void deleteExpense(String name){
		for(int i=0;i<list.size();i++){
			if(list.get(i).name.equalsIgnoreCase(name)){
				list.remove(i);
				System.out.println("deleted");
				return;
			}
		}
		System.out.println("not found");
	}
	
	public static void categorySummary(){
		HashMap<String,Integer>map=new HashMap<>();
		int total=0;
		for(Expense e:list){
			total+=e.amount;
			if(map.containsKey(e.category)){
				map.put(e.category,map.get(e.category)+e.amount);
			}
			else{
				map.put(e.category,e.amount);
			}
		}
		
		for(String category:map.keySet()){
			System.out.println(category+map.get(category));
		}
		
		System.out.println("Total Expense: " +total);
	}
	
	public static void monthlyReport(String month){
		int total=0;
		for(Expense e:list){
			if(e.month.equalsIgnoreCase(month)){
				System.out.println(e);
				total+=e.amount;
			}
		}
		System.out.println("monthly Expense: " +total);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Category Summary");
            System.out.println("5.Monthly Report");
            System.out.println("6.Exit");
            
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
             switch (ch) {
				 case 1:
				 System.out.print("Enter Expense Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    int amount = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Month: ");
                    String month = sc.nextLine();

                    AddExpense(new Expense(name,category,amount,month));
            
                    break;
                    
                    
                    case 2:
                    viewExpense();
                    break;
                    
                    case 3:
                    System.out.print("Enter Expense Name to Delete: ");

                    String n = sc.nextLine();

                    deleteExpense(n);

                    break;
                    
                    case 4:

                    categorySummary();

                    break;
                    
                    case 5:

                    System.out.print("Enter Month: ");

                    String m = sc.nextLine();

                    monthlyReport(m);

                    break;
                    case 6:

                    System.exit(0);
                    default:

                    System.out.println("Invalid Choice");
			 }

		}
	
	}
}
