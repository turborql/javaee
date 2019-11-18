package com.banyuan.test1;

public class Person {
	private int age;
	private String sex;
	public void setSex(String sex) throws SexException{
		if("男".equals(sex)||"女".equals(sex)){
			this.sex=sex;
		}else {
			this.sex="男";
			throw new SexException("性别不合理，给予默认值男");
		}
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
//		MyException e =new MyException();
			this.age = 10;
			throw new AgeException("年龄不合法,赋默认值10");
//		this.age=10;//Unreachable code抛异常之后的语句不再执行
		}
	}

}
