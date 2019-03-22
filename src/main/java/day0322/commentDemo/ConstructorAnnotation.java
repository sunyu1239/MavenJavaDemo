package day0322.commentDemo;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface ConstructorAnnotation {
    String value() default "sunyu";
}
