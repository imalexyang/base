package cn.bishiti.base.test.AdvancedFeatures.annotition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FruitColor {
	
	public enum Color{Blue,Red,Green};
	
	Color fruitColor() default Color.Green;
	
}
