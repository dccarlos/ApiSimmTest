package com.dccarlos.intellij.test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class IntellijTestProjectApplication extends Application<IntellijTestProjectConfiguration> {

    public static void main(final String[] args) throws Exception {
        new IntellijTestProjectApplication().run(args);
    }

    @Override
    public String getName() {
        return "IntellijTestProject";
    }

    @Override
    public void initialize(final Bootstrap<IntellijTestProjectConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final IntellijTestProjectConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
