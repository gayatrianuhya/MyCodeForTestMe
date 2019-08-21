package mystepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(features="C:\Users\Training_H2A.06.15\eclipse-workspace\cucumber123\myfeatures\Testmeparameters.feature",glue="mystepdefinitions",plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})
)
public class Myrunners {
	

}
