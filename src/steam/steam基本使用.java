package steam;

import steam.steamInterface.A;
import steam.steamInterface.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * User: zzw
 * Date: 2018-08-04-下午1:33
 * Description: 基本使用
 */
public class steam基本使用 implements A, B {


    public steam基本使用() {
    }

    /***
     * 做了任何中间操作 必须使用中止操作的api 否则中间操作不执行
     * 如下 不加.count(); filter方法内的Predicate函数不执行
     * 称为惰性求值 或 延迟加载
     *
     */

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("1","2","3","4"));
        Stream<String> stream = list.stream();
        stream.filter(x->{
            System.out.println("我是过滤操作");
            return true;
        }).limit(5).forEach(System.out::println);


        Stream<String> stringStream = Stream.of("1", "2", "3", "4");

        Stream<Integer> iterate = Stream.iterate(0, x -> x + 1);
        //iterate.limit(stringStream.count()).forEach(System.out::println);
    }


    @Override
    public void a() {
        /***
         *         如果A和B接口中都有default 方法则子类需要自己实现 这种情况下还是可能会有兼容问题
         *         如果需要调用某一个接口的默认方法 需使用      A.super.a(); 指定类名点super的方式完成
         */
       A.super.a();
    }
}
