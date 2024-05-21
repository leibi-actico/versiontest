package net.leibi.versiontest.betaannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is added to classes, constructors or methods which are considered in beta phase.
 * It indicates that any public interface can change without prior announcements.
 * Moreover, classes, constructors, and methods annotated as beta are not considered at production
 * quality, and should not be used outside the intended feature
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface LeibiBeta
{

    /**
     * Indicated for which feature this is introduced
     *
     * @return the feature string
     */
    String forFeature() default "";
}
