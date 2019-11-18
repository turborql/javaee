package com.banyuan.test;

public class Tree {
int height;
Tree(){
	System.out.println("Plantling a seeding");
	height=0;
}
Tree(int initialHeight){
	height=initialHeight;
	System.out.println("creating new tree that is"+height+"feet tall");
}
void info() {
	System.out.println("tree is"+height+"feet tall");
}

public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		Tree t=new Tree();
		t.info();
	}
	new Tree();
}


}
