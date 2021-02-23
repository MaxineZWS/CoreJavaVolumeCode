package chapter6.lambda;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LambdaTest {
    public static void main(String[] args)
    {
        //使用lambda重写一个返回较大值的比较器
        //定义一个优先队列，默认的是返回最小堆
        PriorityQueue<Integer> que1 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//
                return o2-o1;
            }
        });
        que1.add(1);
        que1.add(20);
        que1.add(10);
        que1.add(5);
        for(int i=0;i<que1.size();i++){
            System.out.println(que1.poll().toString());
        }
    }
}
