package chapter5_standard.practice_learn;

import java.util.LinkedList;
import java.util.Vector;

public class Five_5 {
    public static void main(String[] args){
        System.out.println("LinkedList：");
        String a = "A", b = "B", c = "C", test = "Test";
        LinkedList<String> list = new LinkedList<String>();
        list.add(a); // 索引位置为 0
        list.add(b); // 索引位置为 1
        list.add(c); // 索引位置为 2
        System.out.println(list.getFirst());  // 获得并输出列表开头的对象
        list.addFirst(test);		// 向列表开头添加一个对象
        System.out.println(list.getFirst());// 获得并输出列表开头的对象
        list.removeFirst();// 移除列表开头的对象
        System.out.println(list.getFirst());// 获得并输出列表开头的对象
        System.out.println("Vector:");
        //Vector的创建
        //使用Vector的构造方法进行创建
        Vector v = new Vector(4);
        //向Vector中添加元素
        //使用add方法直接添加元素
        v.add("Test0");
        v.add("Test1");
        v.add("Test0");
        v.add("Test2");
        v.add("Test2");

        //从Vector中删除元素
        v.remove("Test0"); //删除指定内容的元素
        v.remove(0); //按照索引号删除元素

        //获得Vector中已有元素的个数
        int size = v.size();
        System.out.println("Vector size:" + size);

        //遍历Vector中的元素
        for(int i = 0;i < v.size();i++){
            System.out.println(v.get(i));
        }
    }
}


