package net.leibi.versiontest.annotation;

import lombok.extern.log4j.Log4j2;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("net.leibi.versiontest.annotation.Beta")
@Log4j2
public class BetaProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        log.info("Beta process");
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,"processing Beta ");
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(Beta.class);
        for(Element e : elements){
            log.info(e);
        }
        return true;
    }
}
