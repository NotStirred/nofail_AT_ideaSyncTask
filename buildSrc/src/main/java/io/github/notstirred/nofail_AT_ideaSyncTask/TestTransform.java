package io.github.notstirred.nofail_AT_ideaSyncTask;

import org.gradle.api.GradleScriptException;
import org.gradle.api.artifacts.transform.TransformAction;
import org.gradle.api.artifacts.transform.TransformOutputs;
import org.gradle.api.artifacts.transform.TransformParameters;

public abstract class TestTransform implements TransformAction<TransformParameters.None> {
    @Override
    public void transform(TransformOutputs outputs) {
        System.out.println("Attempting to fail build");
        if (true)
            throw new GradleScriptException("Failing build", null);
    }
}