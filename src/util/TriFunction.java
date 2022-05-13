package util;


//3개의 인자값을 받는 Function Interface 만들기
@FunctionalInterface
public interface TriFunction<T,U,V,R> {
	R apply(T t, U u, V v);
}
