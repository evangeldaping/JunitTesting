package com.company.CompanyStructures.Junit_Testing;

import org.junit.jupiter.api.*;

class AccountantTest {

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

    @DisplayName("ID : 3")
    @Test
    void accountantCanApprove$20000000() {

        techLead1.addReport(softEng1);
        softEng1.checkInCode();
        System.out.println(techLead1.getTeamStatus());

        busiLead.addReport(account1,techLead1);
        System.out.println(busiLead.getTeamStatus());

        softEng1.setBonus(20000000);
        double getBonus = softEng1.getBonus();
        boolean canApprove = account1.canApproveBonus(getBonus);
        Assertions.assertEquals(false,canApprove);

        System.out.println("ID : 3"  +  "\n");

        System.out.println("Task Description : Accountant can approve bonus ?"  +  "\n");

        System.out.println("Input : Request $" + getBonus + "\n");

        System.out.println("Expected Output : " + getFalse() +  "\n");

        System.out.println("Actual Output : " + canApprove +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("NO. Accountant " + account1 + " can not approve request bonus because it is out of the budget.");

    }

    @DisplayName("ID : 4")
    @Test
    void accountantCanApprove$1000() {

        techLead2.addReport(softEng2);
        softEng2.checkInCode();
        System.out.println(techLead2.getTeamStatus());

        busiLead.addReport(account2,techLead2);
        System.out.println(busiLead.getTeamStatus());

        softEng2.setBonus(1000);
        double getBonus = softEng2.getBonus();
        boolean canApprove = account2.canApproveBonus(getBonus);
        Assertions.assertEquals(true,canApprove);

        System.out.println("ID : 4"  +  "\n");

        System.out.println("Task Description : Accountant can approve bonus ?"  +  "\n");

        System.out.println("Input : Request $" + getBonus + "\n");

        System.out.println("Expected Output : " + getTrue() +  "\n");

        System.out.println("Actual Output : " + canApprove +  "\n");

        System.out.println("Test Result : " + getPassed()  +  "\n");

        System.out.println("YES. Accountant " + account2 + " can approve request bonus because it is within the budget.");

    }

}