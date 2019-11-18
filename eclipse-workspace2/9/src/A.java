//接口中有普通方法的例子
public interface A {
void out();
default void outDefault() {
	System.out.println("this is interface outDefault method");
}
static void out1() {//加了static只能用接口名调用，是接口的专属方法
	System.out.println();
}

}
