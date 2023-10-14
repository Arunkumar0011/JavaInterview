package stream;

import java.util.stream.IntStream;

public class SkipAndLimitExa {
	
	public static void main(String[] args) {
		
		IntStream.range(100, 1111)
		.skip(1)
		.limit(8)
		.forEach(System.out :: println);
	}

}
