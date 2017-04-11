package packege.barosello.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaBaroSello {

	private static BaroSello baroSelloObj = new BaroSello();

	public static void main(String[] args) {
		String valueInputString;
		int valueInputInt = 0;
		boolean bError = false;
		ArrayList<String> arrayList = new ArrayList<String>();
		
		InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader myInput = new BufferedReader (reader);
        
        do{
        	try {
        		System.out.print("Plese enter an integer value (0..100): ");
            	valueInputString = myInput.readLine();
            	valueInputInt = Integer.parseInt(valueInputString);
            	
            	if(valueInputInt <= 100){
            		for(int i=0 ; i<=valueInputInt ; i++) {
            			arrayList.add(String.valueOf(i));
            		}
            		
            		arrayList = stepOne(arrayList);
            		String result = arrayList.toString().replaceAll("\\[|\\]", ""); 
            		System.out.println(result);
            		
                	bError = false;
            	} else {
            		System.out.println("the values are between 1 and 100, please try again!");
            		bError = true;
            	}
        	} catch (Exception e){
        		System.out.println("You did not enter an integer, please enter an integer value");
        		// Don't do anything else in here: we will loop back to the beginning again and get new input!
        		bError = true;
        	}
        }while(bError);
        
	}
	
	public static ArrayList<String> stepOne(ArrayList<String> val){
		
		return baroSelloObj.multiple(val);
	}

}
