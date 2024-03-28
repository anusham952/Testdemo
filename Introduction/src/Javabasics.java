
public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int num=12;
		String s="javabasics";
		float numb=12.5f;
		double n=123.789d;
		
		
		System.out.println("this is the result of above  " + s + numb);
		
		
		int arr[]= {1,5,7,8,9};
		//System.out.println(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		String val[]= {"java", "javascript","python","PHP"};
		
		for(int i=0; i<val.length; i++) {
			System.out.println(val[i]);
		}*/
		
		
		
		
		String ass= "java development with selenium";
		String ara[]=ass.split(" ");
		System.out.println(ara[0]);
		System.out.println(ara[1]);
		System.out.println(ara[2]);
		
		//System.out.println(ass);
		
		for(int i=0; i< ass.length(); i++) {
			System.out.println(ass.charAt(i));
		}
		
		
		for(int i=ass.length()-1; i>=0; i--) {
			System.out.println(ass.charAt(i));
		}
		
		
		
		
		/* int numlist[]= {1,7,5,8,4,3,5,6,2};
		
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i] % 2 == 0) {
				System.out.println(numlist[i]);
				break;
			}else {
				System.out.println("value is not found");
			}
		}*/
		
		
	}

}
