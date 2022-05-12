package LambdaExpression;

import java.util.function.Function;

public class FuntionInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> myAdder2 = x -> x + 10;
		
		int result = myAdder2.apply(5);
		System.out.println(result);
		
	}
}
