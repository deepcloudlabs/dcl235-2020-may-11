package com.example.processor;

import com.example.Audit;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.err.println(annotations);
        return true;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        System.err.println("getSupportedSourceVersion()");
        return SourceVersion.RELEASE_14;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        System.err.println("getSupportedAnnotationTypes()");
        return new HashSet<>(Arrays.asList("com.example.Audit"));
    }
}
