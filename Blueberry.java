public class Blueberry
{
	public static void main(String[] args) {
	    
	    // with While loop
	    System.out.println("The following is from a while loop: ");
	    int i = 0, blue = 0;
	    int berry = blue;
	    int blueberry = berry;
		while(i++ < 100){
			if(i % 3 == 0 && i % 5 == 0) {
			    System.out.println(i + " BlueBerry");
			    blueberry++;
			}
			else if(i % 3 == 0) {
			    System.out.println(i + " Blue");
			    blue++;
			}
			else if(i % 5 == 0) {
			    System.out.println(i + " Berry");
			    berry++;
			}
			else System.out.println(i);
		}
		
		System.out.println("There are " + blue + " Blues.");
		System.out.println("There are " + berry + " Berries.");
		System.out.println("There are " + blueberry + " Blueberries.");
        
        
        
		
		System.out.println("\nThe following is from a for loop: ");
		blue = 0;
		berry = blue;
		blueberry = berry;
		for(i=1;i<=100;i++){
			if(i % 3 == 0 && i % 5 == 0) {
			    System.out.println(i + " BlueBerry");
			    blueberry++;
			}
			else if(i % 3 == 0) {
			    System.out.println(i + " Blue");
			    blue++;
			}
			else if(i % 5 == 0) {
			    System.out.println(i + " Berry");
			    berry++;
			}
			else System.out.println(i);
		}
		
		System.out.println("There are " + blue + " Blues.");
		System.out.println("There are " + berry + " Berries.");
		System.out.println("There are " + blueberry + " Blueberries.");
		
		blue = 0;
		berry = blue;
		blueberry = berry;
		System.out.println("\nThe following is from a do...while loop: ");
		i = 1;
		do{
			if(i % 3 == 0 && i % 5 == 0) {
			    System.out.println(i + " BlueBerry");
			    blueberry++;
			}
			else if(i % 3 == 0) {
			    System.out.println(i + " Blue");
			    blue++;
			}
			else if(i % 5 == 0) {
			    System.out.println(i + " Berry");
			    berry++;
			}
			else System.out.println(i);
		}while(i++ < 100);
		
		System.out.println("There are " + blue + " Blues.");
		System.out.println("There are " + berry + " Berries.");
		System.out.println("There are " + blueberry + " Blueberries.");
        
        
		
	}
}
