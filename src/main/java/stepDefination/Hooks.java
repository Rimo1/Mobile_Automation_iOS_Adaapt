package stepDefination;

import cucumber.api.java.Before;
import driverManager.iOSMobileDriver;
public class Hooks extends iOSMobileDriver  {
   public Hooks(){
       super();}

   @Before
   public void before() {
        System.out.println("Test Start");
    }

   public void after() {

        System.out.println("Test End");
    }
}
