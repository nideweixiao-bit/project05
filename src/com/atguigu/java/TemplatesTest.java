package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author HUAHUACAOCAO
 * @date 2019/10/20-15:09.
 */
public class TemplatesTest {
    //模板六： prsf:可生成private static final 添加不同模块的类[Alt+Enter]键
    private static final Customer CUST=new Customer();
    //变形：psf
    public static final int NUM = 1;

    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String  nation="CHINA";


    //模板一：psvm 出现main方法
    public static void main(String[] args) {

        //模板二：sout
        System.out.println();
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplatesTest.main");
        //soutv
        int num1=11;
        System.out.println("num1 = " + num1);
        //xx.sout
        System.out.println(num1);
        //模板三：fori
        String[] arr=new String[]{"Tom","Jerry","HenMeimei","Lilei"};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
     ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        //变形：list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {
            System.out.println(list);
        }
        //变形inn
        if (list != null) {
            System.out.println("list!=null");
        }

        //变形:xxx.null
        if (list == null) {

        }

        //变形：xxx.nn
        if (list != null) {

        }
    }

}
