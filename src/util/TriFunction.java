package util;


//3���� ���ڰ��� �޴� Function Interface �����
@FunctionalInterface
public interface TriFunction<T,U,V,R> {
	R apply(T t, U u, V v);
}
