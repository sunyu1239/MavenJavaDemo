package day0322.commentDemo;

@ClassAnnotation(name = "meinv", sex = "male")
public class CommentDemo {
    @FieldAnnotation(name = "field", age = 30)
    private String name;

    @ConstructorAnnotation("dd")
    public CommentDemo() {

    }

    @MethodAnnotation(name = "sunyu", age = 90)
    private void sayHello() {
        System.out.println("hha");
    }
}
