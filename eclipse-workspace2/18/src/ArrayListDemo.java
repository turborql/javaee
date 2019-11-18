import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		//自动装箱机制
                array.add(11);
                array.add(15);
                array.add(19);
                System.out.println(array);
                for(int i=0;i<array.size();i++) {
                	System.out.println(array.get(i));
                }
                //存储person类的对象
                ArrayList<Person> ap=new ArrayList<Person>();
                ap.add(new Person("a",20));
                ap.add(new Person("b",20));
                ap.add(new Person("c",20));
                for(int i=0;i<ap.size();i++) {
                	//get()取出的对象就是Person对象
                	//打印一个对象，必须重写Object的toString方法，不然打出来的就是
//                	 public String toString() {
//                	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//                	    }
                	System.out.println(ap.get(i));
                }

              
                
	}

}
