package pack1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface MyCustomAnnotation {

	String authorName();

	String purpose();

}
