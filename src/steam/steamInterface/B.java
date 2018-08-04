package steam.steamInterface;

/**
 * User: zzw
 * Date: 2018-08-04-下午1:37
 * Description: B中也有抽象方法a
 */
public interface B {

  default   void  a(){
      System.out.println("A");
  }
}
