package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",

            },

            features ="src/test/resources/features" ,  //feature->right click->copy path->click->path from content/root
            glue = "com/cydeo/step_definitions" ,   //step_definitions->right click->copy path->click->path from source/root
            dryRun = false,  //to get snippets we must make true
            tags = "@wip",
            publish = true


    )

    public class CukesRunner {
    }


