package string;

public class StringMethodsAndUseses {
	
	public static void main(String[] args) {
		
		String name = "Arunkumar G";
		
		String name2 = "Ramkumar G";
		
		//CHARAT
		System.out.println(name.charAt(0)); //A
		
		//CONCAT
		System.out.println(name.concat(name2)); //Arunkumar GRamkumar G
		
		//CONTAINS
		System.out.println(name.contains("kumar")); //true
		
		//ENDSWITH
		System.out.println(name.endsWith("G")); //true
		
		//INDEXOF
		System.out.println(name.indexOf("u")); //2 (Return first index only every time)
		
		//LASTINDEXOF
		System.out.println(name.lastIndexOf("u")); //5 (Return last index only every time)
		
		//REPLACE
		System.out.println(name.replace('A', '@'));  //@runkumar G

		//SUBSTRING
		System.out.println(name.substring(2)); //unkumar G   (index based check like 0 1 2 .... - starting from  given index)
		
		System.out.println(name.substring(4, 8)); //kuma   (begin index inclusive and last index exclusive)
		
		//TOUPPERCASE
		System.out.println(name.toUpperCase()); //ARUNKUMAR G
		
		//LENGTH
		System.out.println(name.length());  //11
		
		//EQULAIGNORECASE
		System.out.println(name.equalsIgnoreCase("arunkumar g"));  //true
		
		//VALUEOF
	     boolean b1=true;  
	        byte b2=11;    
	        short sh = 12;  
	        int i = 13;  
	        long l = 14L;  
	        float f = 15.5f;  
	        double d = 16.5d;  
	        char chr[]={'j','a','v','a'};  
	        StringMethodsAndUseses obj=new StringMethodsAndUseses();  
	        String s1 = String.valueOf(b1);    
	        String s2 = String.valueOf(b2);    
	        String s3 = String.valueOf(sh);    
	        String s4 = String.valueOf(i);    
	        String s5 = String.valueOf(l);    
	        String s6 = String.valueOf(f);    
	        String s7 = String.valueOf(d);    
	        String s8 = String.valueOf(chr);    
	        String s9 = String.valueOf(obj);    
	        System.out.println(s1);  
	        System.out.println(s2);  
	        System.out.println(s3);  
	        System.out.println(s4);  
	        System.out.println(s5);  
	        System.out.println(s6);  
	        System.out.println(s7);  
	        System.out.println(s8);  
	        System.out.println(s9);  
		
			
	}

}
