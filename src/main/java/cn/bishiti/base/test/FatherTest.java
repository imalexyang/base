package cn.bishiti.base.test;

public class FatherTest {
    private String name;

    FatherTest(){
       System.out.println("--父类的无参构造函数--");
    }

   

    FatherTest(String name){
       this.name=name;
       System.out.println("--父类的有参构造函数--"+this.name);
    }

 

    static{
       System.out.println("--父类的静态代码块--");
    }

   

    {
       System.out.println("--父类的非静态代码块--");
    }

   

    public void speak(){
       System.out.println("--父类的方法--");
    }

}