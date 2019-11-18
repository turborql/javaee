package com.banyuan.wrapper;
/*
 * public final class Integer extends Number implements Comparable<Integer>
 * 构造方法：Integer(int value)
 *         Integer(String value)
 */
public class IntegerDemo {
public static void main(String[] args) {
	Integer i1=new Integer(123);
	Integer i2=new Integer("123");
	//Integer i3=new Integer("abc");//NumberFormatException
    System.out.println("i1==i2"+(i1==i2));//比较内存地址
    System.out.println("i1.equals(i2):"+i1.equals(i2));
   /*说明重写了object的equals方法
    *  public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    } 
    */
    System.out.println("i1.toString()"+i1.toString());
//   Integer具备比较大小的能力
    int a=i1.compareTo(i2);
    System.out.println(a);
}
	
}
