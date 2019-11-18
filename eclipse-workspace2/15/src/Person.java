
public class Person {
private String name;
private int age;
public String getName() {
	return name;
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//重写父类的toString,在方法中返回类的所有成员变量的值
public String toString() {
	return name+age;
}
}
