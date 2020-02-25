package com.aktepe.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.aktepe.step_definitions",
        dryRun = false,
        tags = "@AddBlog"
)
public class Runner {
}
