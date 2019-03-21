package day0321.cglib;

public class CGLibTest {
    private String name;

    public static void main(String[] args) {
        // 创建enhancer类，通过此增强类来达到拦截方法的效果
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        // // 通过CGLIB动态代理获取代理对象的过程
        // Enhancer enhancer = new Enhancer();
        // // 设置enhancer对象的父类
        // enhancer.setSuperclass(HelloService.class);
        // // 设置enhancer的回调对象
        // enhancer.setCallback(new MyMethodInterceptor());
        // // 创建代理对象
        // HelloService proxy= (HelloService)enhancer.create();
        // // 通过代理对象调用目标方法
        // proxy.sayHello();
    }

    public void sd() {

    }

}
