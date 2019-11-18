
public class ToStringDemo {

	public static void main(String[] args) {	
		Person p=new  Person("zhangsan",20);
		//调用Person类的方法toString()
		//输出语句中，写的是一个对象，默认调用对象的toString方法
		String s=p.toString();
		System.out.println(p);
		System.out.println(s);
	}

}
