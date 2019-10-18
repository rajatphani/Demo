import java.util.Scanner;
public class Mnu {



	public static void main(String[] args) {
		while( true ){
		
			System.out.println("##########Menu###########");
			System.out.println("1) Tea    10");
			System.out.println("2) Coffe  15");
			System.out.println("choose any one from above");
			Scanner sc = new Scanner(System.in) ;
			int choice = 0 ;
			choice = sc.nextInt();
			if(choice == 2 ){
				System.out.println("you have choosen coffe");
				System.out.println("how many coffe you require");
				int no_of_items = 0;
				no_of_items = sc.nextInt();
				System.out.println("you have choosen "+no_of_items + "Coffe");
				System.out.println("Billl Amout " + no_of_items* 15);
			}
			else if(choice == 1 ){
				System.out.println("you have choosen tea");
				System.out.println("how many tea you require");
				int no_of_items = 0;
				no_of_items = sc.nextInt();
				System.out.println("you have choosen "+no_of_items + "Tea");
				System.out.println("Billl Amout " + no_of_items* 10);

			}
			else {
				System.out.println("Sorry the item you choosen is not available in our menu");
				
			}
			
			int close_time;
			Scanner s=new Scanner(System.in);
			System.out.println("it is close time");
			close_time=s.nextInt();
			if(close_time==0){
				continue;
				
			}
			if(close_time==1){
				break;
			}
		}
		
	}

}

