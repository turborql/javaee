
public class Demo implements A {
	public static void main(String[] args) {
		new Demo().outDefault();
//		new Demo().out1();error
		A.out1();//加了static只能用接口名调用，是接口的专属方法
	}
	public void out() {
	}
}