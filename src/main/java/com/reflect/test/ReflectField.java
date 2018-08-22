package com.reflect.test;
//http://blog.csdn.net/xinyuan_java/article/details/51180959
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class ReflectField     
{    
    
    public static void main(String[] args)     
    {    
        /*1.Class<?> clazz = Class.forName("com.stevenhu.field.FieldBeReflected");  
         *2.FieldBeReflected mFieldBeReflected = new FieldBeReflected();  
         *  Class<?> clazz = mFieldBeReflected.getClass();  
         */    
        Class<?> clazz = FieldBeReflected.class;    
            
        try {    
            Field fName = clazz.getDeclaredField("name");    
            Field fBoolean = clazz.getDeclaredField("mBoolean");    
            Field fByte = clazz.getDeclaredField("mByte");    
            Field fShort = clazz.getDeclaredField("mShort");    
            Field fInt = clazz.getDeclaredField("mInt");    
            Field fLong = clazz.getDeclaredField("mLong");    
            Field fFloat = clazz.getDeclaredField("mFloat");    
            Field fDouble = clazz.getDeclaredField("mDouble");    
            Field fChar = clazz.getDeclaredField("mChar");    
        
            /*  
             * 参数为true，只要是在类中声明的目标属性均可访问，  
             * 为false，则被反射类和反射类在同一个包中时，private目标属性不可访问，  
             * 不在同一个包中时，private、protected目标属性均不可访问  
             */    
            fName.setAccessible(true);    
                
            /*给目标属性设置值(private属性不能访问，但可以通过先调用setAccessible(true)实现访问),  
             * 由于ReflectField类中的name属性是静态的(static)，所以方法的第一个实参传入的是  
             * 目标属性所在类对应的Class对象clazz，也可以是类的实例clazz.newInstance();  
             */    
            fName.set(clazz, "reflection");    
            //得到目标属性的值(private属性不能访问，但可以通过调用setAccessible(true)实现访问)    
            String name = (String) fName.get(clazz);    
            System.out.println(name);    
                
            fBoolean.setAccessible(true);    
            /*得到目标属性的布尔值，由于ReflectField类中的mBoolean属性是非静态的，  
             * 所以此处的传入实参为目标属性所在类的实例clazz.newInstance()  
             */    
            boolean mBoolean = fBoolean.getBoolean(clazz.newInstance());    
            System.out.println(mBoolean);    
                
            fByte.setAccessible(true);    
            //得到目标属性的Byte类型值    
            byte mByte = fByte.getByte(clazz.newInstance());    
            System.out.println(mByte);    
                
            fShort.setAccessible(true);    
            //得到目标属性的short整型值    
            short mShort = fShort.getShort(clazz);    
            System.out.println(mShort);    
                
            fInt.setAccessible(true);    
            //给目标属性设置整型值        
            fInt.setInt(clazz, 222);    
            //得到目标属性的整型值    
            int mInt = fInt.getInt(clazz);    
            System.out.println(mInt);    
                
            fLong.setAccessible(true);    
            //给目标属性设置Long整型值        
            fLong.setLong(clazz, 2222);    
            //得到目标属性的Long整型值    
            Long mLong = fLong.getLong(clazz);    
            System.out.println(mLong);    
                
            fFloat.setAccessible(true);    
            //给目标属性设置float类型值    
            fFloat.setFloat(clazz, 22222);    
            //得到目标属性的float类型值    
            float mFloat = fFloat.getFloat(clazz);    
            System.out.println(mFloat);    
                
            fDouble.setAccessible(true);    
            //给目标属性设置double类型值    
            fDouble.setDouble(clazz, 222.222);    
            //得到目标属性的double类型值    
            double mDouble = fDouble.getDouble(clazz);    
            System.out.println(mDouble);    
                
            //给目标属性设置字符值(private、protected属性不能访问)    
            fChar.setChar(clazz, 'a');    
            //得到目标属性的字符值(private、protected属性不能访问)    
            char mChar = fChar.getChar(clazz);    
            System.out.println(mChar);    
                
            //目标属性的名字，不局限于修饰符，只要是类中声明的属性    
            String name1 = fName.getName();    
            System.out.println(name1);    
            //目标属性的类型，不局限于修饰符    
            Type type = fName.getGenericType();    
            System.out.println(type);    
            //目标属性的类型对应的Class对象    
            Class<?> clazz1 = fName.getType();        
            System.out.println(clazz1);    
            //目标属性所在类对应的Class对象    
            Class<?> clazz2 = fName.getDeclaringClass();     
            System.out.println(clazz2);    
            //目标属性的权限修饰值(private为2、protected为4、public为1)    
            int modifier = fName.getModifiers();    
            int modifier1 = fByte.getModifiers();    
            int modifier2 = fShort.getModifiers();    
            System.out.println(modifier);    
            System.out.println(modifier1);    
            System.out.println(modifier2);    
                
            System.out.println(fName.isAccessible());    
            System.out.println(fChar.isAccessible());    
                
        } catch (NoSuchFieldException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        } catch (SecurityException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        } catch (IllegalArgumentException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        } catch (IllegalAccessException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        } catch (InstantiationException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        }     
    }    
    
}    
