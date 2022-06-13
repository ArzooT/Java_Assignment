package ArrayAssignment;

import java.util.Arrays;

public class staticArray {
	
	public String[] getdata(String name) {
		
		
		System.out.println("name is"+name);
		
		//String product[]= new String[4];
		
		if(name.equalsIgnoreCase("arzoo")) {
			String product[]= {"arzoo","yunus","tamboli","32"};
			return product;

			
		}
		else if(name.equalsIgnoreCase("aayra")) {
			
			String product[]= {"aayra","waseem","shaikh","5","kangaroo kids","baby girl"};
			return product;

			
		}
		else
		{
			System.out.println("Product name is not found"+name);
			return null;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticArray sa=new staticArray();
		String result[]=sa.getdata("aayra");
		
		System.out.println("products are"+ Arrays.toString(result));
	}

}
