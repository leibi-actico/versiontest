package net.leibi.versiontest.betaprocessor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import com.google.auto.service.AutoService;


import lombok.extern.log4j.Log4j2;
import net.leibi.versiontest.betaannotation.LeibiBeta;


@Log4j2
@AutoService(Processor.class)
@SupportedAnnotationTypes({ "net.leibi.versiontest.betaannotation.LeibiBeta" })
public class BetaProcessor extends AbstractProcessor
{
   @Override
   public Set<String> getSupportedOptions()
   {
      return super.getSupportedOptions();
   }

   @Override
   public Set<String> getSupportedAnnotationTypes()
   {
      return super.getSupportedAnnotationTypes();
   }

   @Override
   public SourceVersion getSupportedSourceVersion()
   {
      return super.getSupportedSourceVersion();
   }

   @Override
   public synchronized void init(ProcessingEnvironment processingEnv)
   {
      super.init(processingEnv);
   }

   @Override
   public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv)
   {
      processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Beta process ");
      processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "processing Beta ");
      Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(LeibiBeta.class);
      for (Element e : elements)
      {
         processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, e.toString());
      }
      return true;
   }

   @Override
   public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText)
   {
      return super.getCompletions(element, annotation, member, userText);
   }

   @Override
   protected synchronized boolean isInitialized()
   {
      return super.isInitialized();
   }


}
