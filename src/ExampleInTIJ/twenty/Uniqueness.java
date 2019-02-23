package ExampleInTIJ.twenty;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
