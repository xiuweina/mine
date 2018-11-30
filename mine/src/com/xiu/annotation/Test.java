package com.xiu.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SampleAnnotation(id=1,name="Main()测试")
public class Test {
    @Check(value='a')
    public int a;

    @Perform
    void print(){

    }

    public static void main(String[] args) {
        Boolean ifAnnotated = Test.class.isAnnotationPresent(SampleAnnotation.class);
        if (ifAnnotated) {
            SampleAnnotation smpann = Test.class.getAnnotation(SampleAnnotation.class);
            System.out.println(smpann.id());
            System.out.println(smpann.name());
        }
        try {
            Field field = Test.class.getField("a");
            field.setAccessible(true);
            Check ann = field.getAnnotation(Check.class);
            System.out.println(ann.value());

            Method method = Test.class.getDeclaredMethod("print");
            Annotation[] anns = method.getAnnotations();
            for (Annotation an: anns) {
                System.out.println(an.annotationType().getSimpleName());
                System.out.println(an.annotationType().getName());
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
