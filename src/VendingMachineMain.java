public class VendingMachineMain {
    public static void main (String[] args){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
//  static 이 붙은 메소드는 클래스 메소드라고 부른다
//  메소드는 기능,행위라고 한다
//  클래스 메소드는 인스턴스를 생성하지 않아도 사용할수가 있다
//  -> 메모리에 올라가 있다
//  인스턴스로 메모리에 올라가야 오브젝트라고 부를수가 있다
//  메소드에서 사용하는건 의존한다라고 생각하기 **진짜중요
//  VendingMachineMain은 String 클래스에도 의존한다
//  클래스명 변수명 = new 클래스명();

//  인스턴스를 만드는 세가지 방법
//  1 .new 연산자와 생성자를 이용하여 인스턴스를 만드는 방법
//  2. 클래스 로더를 이용하는 방법
//  3. 메모리에 있는 인스턴스를 복제하여 만드는 방법

      String product = vm1.pushProductButton(100);
      System.out.println(product);
      //sout 단축키 기억하자
    }
}


