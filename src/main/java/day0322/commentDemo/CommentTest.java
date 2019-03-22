package day0322.commentDemo;

public class CommentTest {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        Class<?> comment = Class.forName("day0322.commentDemo.CommentDemo");
        // 获取类上的注解
        ClassAnnotation h = comment.getAnnotation(ClassAnnotation.class);
        System.out.print(h.name() + ",");
        System.out.println(h.sex());

        // 获取构造上的注解
        ConstructorAnnotation c = comment.getConstructor(null).getAnnotation(ConstructorAnnotation.class);
        System.out.println(c.value());

        // 获取成员变量的注解
        FieldAnnotation f = comment.getDeclaredField("name").getAnnotation(FieldAnnotation.class);
        System.out.print(f.name() + ",");
        System.out.println(f.age());

        // 获取成员方法的注解
        MethodAnnotation m = comment.getDeclaredMethod("sayHello", null).getAnnotation(MethodAnnotation.class);
        System.out.print(m.name() + ",");
        System.out.println(m.age());
    }

}
