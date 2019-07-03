package cn.test;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/2
 */
public class Test {

    public Test(){
        System.out.println("构造函数");
    }
    public int i = f();
    public int j = g(i);



    public int g(int i){
        System.out.println("g()被调用");
        return i*2;
    }

    public int f(){
        System.out.println("f()被调用");
        return 11;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.i);
        System.out.println(test.j);
    }
}
