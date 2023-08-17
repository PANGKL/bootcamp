package practice;

@FunctionalInterface
public interface SuperFunction<T, S, R> {

  R print(T t, S s);


}
