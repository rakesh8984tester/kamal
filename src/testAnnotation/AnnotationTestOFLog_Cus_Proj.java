package testAnnotation;

import org.testng.annotations.Test;

import base.BaseTest;
import pomAnnotation.AnnotationLogin;
import pomAnnotation.AnnotationProject;
import pomAnnotation.AnootationCustomer;

public class AnnotationTestOFLog_Cus_Proj extends BaseTest
{
@Test
public void login() throws InterruptedException
{
	AnnotationLogin log= new AnnotationLogin(driver);
	log.LoginMethod();
}
@Test
public void customer() throws InterruptedException
{
AnootationCustomer cus= new AnootationCustomer(driver);
cus.CustomerMethod();
}

@Test
public void project() throws InterruptedException
{
	AnnotationProject proj= new AnnotationProject(driver);
	proj.NewProj();
}



}
