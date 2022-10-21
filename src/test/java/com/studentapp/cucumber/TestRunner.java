package com.studentapp.cucumber;

import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/test.feature"
,tags ="@SMOKE1")
public class TestRunner extends TestBase{


}
