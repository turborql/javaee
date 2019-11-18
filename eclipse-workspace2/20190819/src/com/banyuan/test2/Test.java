package com.banyuan.test2;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person("ayy",10);
		Person p2=new Person("tom",15);
		Person p3=new Person("jimmy",15);
		Person[] pArray= {p1,p2,p3};
		for(int i=0;i<pArray.length-1;i++) {
			for(int j=0;j<pArray.length-1-i;j++) {
				//age从小到大，name按字典顺序
				if(pArray[j].getAge()>pArray[j+1].getAge()) {
					//注意这步左边类型会写错
					//交换
					changePerson(pArray, j);
				}else if(pArray[j].getAge()==pArray[j+1].getAge()) {
					
					int a ;
					a= pArray[j].getName().compareTo(pArray[j+1].getName());
					if(a>0) {
						changePerson(pArray, j);
					}
				}
			}
			
		}
		
		for(int i=0;i<pArray.length;i++) {
//			System.out.println(pArray[i]);
			pArray[i].print();
		}
		

	}

	private static void changePerson(Person[] pArray, int j) {
		Person temp = pArray[j];
		pArray[j] = pArray[j + 1];
		pArray[j + 1] = temp;
	}

}
