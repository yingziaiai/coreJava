package com.reflect.test;
//http://blog.csdn.net/xiaoxian8023/article/details/9154227
public class ReflectTest {

	 /** 
     * 测试反射类 
     */  
    public static void refTest(){  
        String className = "com.reflect.test.TestConnection";  
        DBTest dbTest = null;  
        TestConnection testConnection = null;
        try {  
              
            //通过反射机制，使用类装载器，装载该类  
            Class tc = Class.forName(className);  
              
            //输出反射得到的类  
            System.out.println(tc);  
              
            //创建该类的实例，转化为接口  
            dbTest =(DBTest)tc.newInstance();  
            testConnection = (TestConnection) tc.newInstance();
              
            //通过接口，调用该类的方法  
            dbTest.SelectUser(); 
            testConnection.SelectUser();
              
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (InstantiationException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        }  
          
    }  
      
    public static void main(String[] args){  
        refTest();  
    }  

}
