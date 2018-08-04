package steam;

import steam.steamInterface.A;
import steam.steamInterface.B;

import java.util.ArrayList;
import java.util.List;

/**
 * User: zzw
 * Date: 2018-08-04-下午1:33
 * Description: 基本使用
 */
public class steam基本使用 implements A, B {


    public steam基本使用() {
    }

    /***
     * 1.
     *
     */

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        steam基本使用 a=new steam基本使用();
        a.a();
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
