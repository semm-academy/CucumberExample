package com.aktepe.step_definitions;

import com.aktepe.utils.Driver;
import gherkin.ast.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hook {
    @Before
    public void setup(){
        System.out.println("##############################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("##############################");
        Driver.close();
    }
}
