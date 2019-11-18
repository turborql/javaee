//泛型自定义;T
public class Person <Hello,World,China>{
//	private int age;
	private Hello age;
	private World name;
	private China score;
	public void setAge(Hello age) {
		this.age=age;
	}
	public Hello getAge() {
		return age;
	}
	public void setName(World name) {
		this.name=name;
	}
	public World getName() {
		return name;
	}
	public void setScore(China score) {
		this.score=score;
	}
	public China getScore() {
		return score;
	}
}
