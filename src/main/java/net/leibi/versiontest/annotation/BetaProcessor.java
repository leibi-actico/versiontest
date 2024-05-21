package net.leibi.versiontest.annotation;

import com.google.auto.service.AutoService;

import lombok.extern.log4j.Log4j2;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes({"net.leibi.versiontest.annotation.Beta"})
@Log4j2
@AutoService(Processor.class)
public class BetaProcessor extends AbstractProcessor {
    @Override
    public Set<String> getSupportedOptions() {
        return super.getSupportedOptions();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return super.getSupportedAnnotationTypes();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        log.info("Beta process");
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "processing Beta ");
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(Beta.class);
        for (Element e : elements) {
            log.info(e);
        }
        return true;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return super.getCompletions(element, annotation, member, userText);
    }

    @Override
    protected synchronized boolean isInitialized() {
        return super.isInitialized();
    }


}
