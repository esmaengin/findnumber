public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[]{1,2,5,7,9,0};
	int search = 5;
	boolean varMi = false;

	for(int number : numbers){
	    if(number == search){
	        varMi = true;
	        break;
        }
    }
	if(varMi){
	    System.out.println("The number is in the string.");
    }
	if(varMi=false){
	    System.out.println("The number is not in the string");
    }
    }
}
