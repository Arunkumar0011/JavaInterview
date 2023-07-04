package src.com.arun.string;

public class StringImmuExa {
	
	public static void main(String[] args) {
		String a= "Arun";
		a.concat("kumar");
        System.out.println(a);//Even after concat it will print only "Arun" because it's referring inside heap memory string constant pool is there from there only it will get print - String is immutable in java (Unmodifiable)
	}

}
