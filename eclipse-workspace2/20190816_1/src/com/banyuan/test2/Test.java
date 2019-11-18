package com.banyuan.test2;
//可变参数例子，注意复习数组的内容
/*public class Test{
    public static void main(String[] args){
        System.out.println(Add(1,2,3,4));
        System.out.println(Add(new int[]{1,2,3,4,5}));
    }
    public static int Add(int ... data){
        int ret=0;
      for(int i=0;i<data.length;i++){
            ret+=data[i];
        }
        return ret;
    }
}*/
public class Test{
    public static void main(String[] args){
        System.out.println(Add("HL",1,2,3,4));
        System.out.println(Add("he",new int[]{1,2,3,4,5}));
    }
    public static int Add(String str,int ... data){
        int ret=0;
       for(int i=0;i<data.length;i++){
            ret+=data[i];
        }
        System.out.println(str);
        return ret;
    }
}




