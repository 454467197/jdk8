package steam.steamInterface;

/**
 * User: zzw
 * Date: 2018-08-04-下午1:37
 * Description: A接口有抽象发方法A
 */
public interface A {

   default void  a(){
       System.out.println("测试");
   }
}
