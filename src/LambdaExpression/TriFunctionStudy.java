package LambdaExpression;

import util.TriFunction;

//3���� ���ڰ��� �޴� Function Interface �����
public class TriFunctionStudy{

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers =
				(x, y, z) -> x + y + z;
				
			int result = addThreeNumbers.apply(3, 2, 5);
			System.out.println(result);
	}
	
}
