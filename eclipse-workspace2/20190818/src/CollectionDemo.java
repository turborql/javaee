import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection接口中的方法，是集合中所有实现类必须有的方法
 * ArrayList implements List
 * List extends Collection
 */
public class CollectionDemo {
	static int  i;
	
		public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
		System.out.println(i);
	}
private static void function3() {
	Collection<String> coll=new ArrayList<String>();
	coll.add("abc");
	coll.add("banyuan");
	coll.add("abcd");
	coll.add("123");
	System.out.println(coll);
	boolean b=coll.remove("abc");
	System.out.println(b);
	System.out.println(coll);
		
	}
private static void function2() {
	Collection<String> coll=new ArrayList<String>();
	coll.add("abc");
	coll.add("banyuan");
	coll.add("abcd");
	Object[] objs=coll.toArray(); 
	for(int i=0;i<objs.length;i++) {
		System.out.println(objs[i]);
	}
	
		
	}
private static void function1() {
		Collection<String> coll=new ArrayList<String>();
		coll.add("abc");
		coll.add("banyuan");
		coll.add("abcd");
		coll.add("123");
		boolean b=coll.contains("123");
		System.out.println(b);
		
	}
public static void function() {
	//接口多态的方式调用
	Collection<String> coll=new ArrayList<String>();
	//存的是有序元素
	coll.add("bcd");
	coll.add("abc");
	System.out.println(coll);
	//清空集合中的所有元素，但是集合这个容器还在的
	coll.clear();
	System.out.println(coll);
    
	
}
//private static void function5() {
//	Collection coll=new ArrayList();
//   coll.add(1);
//   coll.add("123");
//	System.out.println();
//	
//}
}
