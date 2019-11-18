package cmo.banyuan.cn;

public class Person {
private String name;
public void run() {
	for(int i=0;i<10;i++) {
		System.out.print(name+".."+i);
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person(String name) {
	super();
	this.name = name;
}

}
