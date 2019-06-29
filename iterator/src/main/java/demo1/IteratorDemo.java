package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IteratorDemo
 * @Description TODO
 * @Date 2019/6/29 14:47
 * @Version 1.0
 **/
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("zhangsan_1");
        names.add("zhangsan_2");
        names.add("zhangsan_3");
        names.add("zhangsan_4");
        names.add("zhangsan_5");
        names.add("zhangsan_6");
        names.add("zhangsan_7");

        NameRepository nameRepository = new NameRepository(names);
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
        System.out.println("集合的第一个元素：" + iterator.first());
        System.out.println("集合的最后一个元素：" + iterator.last());


    }
}
