package com.company.CompanyStructures.Junit_Testing;

import org.junit.jupiter.api.*;

public class SoftwareEngineerTest {

    TechnicalLead techLead1 = new TechnicalLead("Satya Nadella");
    SoftwareEngineer softEng1 = new SoftwareEngineer("Kasey");

    TechnicalLead techLead2 = new TechnicalLead("Bill Gates");
    SoftwareEngineer softEng2 = new SoftwareEngineer("Breana");

    BusinessLead busiLead = new BusinessLead("Amy Hood");
    Accountant account1 = new Accountant("Niky");
    Accountant account2 = new Accountant("Andrew");

    public String passed = "passed";
    public boolean False = false;
    public boolean True = true;

    public String getPassed() {
        return passed;
    }

    public boolean getFalse() {
        return False;
    }

    public boolean getTrue() {
        return True;
    }


    @BeforeAll
    static void doThisBeforeAll() {
        System.out.println("Start of Tests");
    }

    @AfterAll
    static void doThisAfterAll() {
        System.out.println("End of Tests");
    }

    @BeforeEach
    void doThisBeforeEach() {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }

    @AfterEach
    void doThisAfterEach() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }



    @DisplayName("ID : 1")
    @Test
    void setCodeAccessToFalse() {

        techLead1.addReport(softEng1);
        System.out.println(techLead1.getTeamStatus());

        softEng1.setCodeAccess(false);
        boolean getCode = softEng1.getCodeAccess();
        boolean checkCode = softEng1.checkInCode();
        Assertions.assertEquals(false,checkCode);

        System.out.println("ID : 1"  +  "\n");

        System.out.println("Task Description : Software Engineer can check in code ?"  +  "\n");

        System.out.println("Input : setCodeAccess (" + getCode + ") Add SE to TL \n");

        System.out.println("Expected Output : " + getFalse() +  "\n");

        System.out.println("Actual Output : " + checkCode +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("NO. Software Engineer " + softEng1 + " can not check in code. So " + softEng1.employeeStatus());

    }

    @DisplayName("ID : 2")
    @Test
    void setCodeAccessToTrue() {

        techLead2.addReport(softEng2);
        System.out.println(techLead2.getTeamStatus());

        softEng2.setCodeAccess(true);
        boolean getCode = softEng2.getCodeAccess();
        boolean checkCode = softEng2.checkInCode();
        Assertions.assertEquals(true,checkCode);

        System.out.println("ID : 2"  +  "\n");

        System.out.println("Task Description : Software Engineer can check in code ?"  +  "\n");

        System.out.println("Input : setCodeAccess (" + getCode + ") Add SE to TL \n");

        System.out.println("Expected Output : " + getTrue() +  "\n");

        System.out.println("Actual Output : " + checkCode +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("YES. Software Engineer " + softEng2 + " can check in code. So " + softEng2.employeeStatus());

    }


    @DisplayName("ID : 5")
    @Test
    void softwareEngineerRequestFor$20000000() {

        techLead1.addReport(softEng1);
        softEng1.checkInCode();
        System.out.println(techLead1.getTeamStatus());

        busiLead.addReport(account1, techLead1);
        System.out.println(busiLead.getTeamStatus());

        softEng1.setBonus(20000000);
        double getBonus = softEng1.getBonus();
        boolean requestFor = techLead1.requestBonus(this.softEng1,getBonus);
        Assertions.assertEquals(false,requestFor);

        System.out.println("ID : 5"  +  "\n");

        System.out.println("Task Description : Software Engineer can get bonus ?"  +  "\n");


        System.out.println("Input : Request for $" + getBonus + "\n");

        System.out.println("Expected Output : " + getFalse() +  "\n");

        System.out.println("Actual Output : " + requestFor +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("NO. Software Engineer " + softEng1 + " can not get request bonus because it is out of the budget. \n"
               + "    So budget remains @ $" + softEng1.getManager().getAccountantSupport().getBonusBudget() );

    }


    @DisplayName("ID : 6")
    @Test
    void softwareEngineerRequestFor$1000() {

        techLead2.addReport(softEng2);
        softEng2.checkInCode();
        System.out.println(techLead2.getTeamStatus());

        busiLead.addReport(account2, techLead2);
        System.out.println(busiLead.getTeamStatus());

        softEng2.setBonus(1000);
        double getBonus = softEng2.getBonus();
        boolean requestFor = techLead2.requestBonus(this.softEng2,getBonus);
        Assertions.assertEquals(true,requestFor);

        System.out.println("ID : 6"  +  "\n");

        System.out.println("Task Description : Software Engineer can get bonus ?"  +  "\n");


        System.out.println("Input : Request for $" + getBonus + "\n");

        System.out.println("Expected Output : " + getTrue() +  "\n");

        System.out.println("Actual Output : " + requestFor +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("YES. Software Engineer " + softEng2 + " can get request bonus because it is within the budget.\n"
                + "     So budget updates @ $" + softEng2.getManager().getAccountantSupport().getBonusBudget() );

    }

}