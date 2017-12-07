import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int i1 = IssueBookDao.updatebook("");
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean b1 = IssueBookDao.checkBook("hi!");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean b1 = IssueBookDao.checkBook("");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i4 = IssueBookDao.save("hi!", (int) '#', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        IssueBookDao issueBookDao0 = new IssueBookDao();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int i1 = IssueBookDao.updatebook("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int i4 = IssueBookDao.save("hi!", (int) (short) 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int i4 = IssueBookDao.save("", (int) ' ', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int i4 = IssueBookDao.save("hi!", (-1), "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i4 = IssueBookDao.save("hi!", (int) (short) 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int i4 = IssueBookDao.save("", (int) '4', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int i4 = IssueBookDao.save("", 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int i4 = IssueBookDao.save("", (int) (short) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int i4 = IssueBookDao.save("", (int) ' ', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int i4 = IssueBookDao.save("", (-1), "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int i4 = IssueBookDao.save("", (int) (short) -1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int i4 = IssueBookDao.save("hi!", (int) (short) 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i4 = IssueBookDao.save("hi!", (int) (short) 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int i4 = IssueBookDao.save("hi!", (int) (short) 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int i4 = IssueBookDao.save("hi!", 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int i4 = IssueBookDao.save("hi!", 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int i4 = IssueBookDao.save("hi!", (int) ' ', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int i4 = IssueBookDao.save("", 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int i4 = IssueBookDao.save("hi!", (int) '#', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int i4 = IssueBookDao.save("", (int) (byte) 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int i4 = IssueBookDao.save("", (int) (byte) -1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int i4 = IssueBookDao.save("hi!", (int) 'a', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int i4 = IssueBookDao.save("", (int) 'a', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int i4 = IssueBookDao.save("", (int) '4', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int i4 = IssueBookDao.save("", (int) (byte) -1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int i4 = IssueBookDao.save("", (int) (byte) 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int i4 = IssueBookDao.save("", (int) (short) 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int i4 = IssueBookDao.save("", (int) (short) 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int i4 = IssueBookDao.save("", (int) (byte) 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int i4 = IssueBookDao.save("", (int) '4', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int i4 = IssueBookDao.save("", (int) (short) 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int i4 = IssueBookDao.save("", (int) (short) 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int i4 = IssueBookDao.save("hi!", (int) (byte) -1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int i4 = IssueBookDao.save("", (int) (short) 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int i4 = IssueBookDao.save("", (int) (byte) 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int i4 = IssueBookDao.save("hi!", 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int i4 = IssueBookDao.save("", (int) (short) 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int i4 = IssueBookDao.save("", 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int i4 = IssueBookDao.save("hi!", (int) '#', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int i4 = IssueBookDao.save("", 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int i4 = IssueBookDao.save("", (int) (short) -1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int i4 = IssueBookDao.save("hi!", 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int i4 = IssueBookDao.save("", 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int i4 = IssueBookDao.save("", (int) (short) 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int i4 = IssueBookDao.save("", (-1), "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int i4 = IssueBookDao.save("", (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int i4 = IssueBookDao.save("hi!", (-1), "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int i4 = IssueBookDao.save("", (int) (short) 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int i4 = IssueBookDao.save("hi!", (int) 'a', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int i4 = IssueBookDao.save("", (int) (byte) 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int i4 = IssueBookDao.save("", (int) (short) 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int i4 = IssueBookDao.save("hi!", (int) (short) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i4 = IssueBookDao.save("", 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int i4 = IssueBookDao.save("", (int) (short) 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int i4 = IssueBookDao.save("hi!", (int) (short) -1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int i4 = IssueBookDao.save("", 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int i4 = IssueBookDao.save("hi!", 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int i4 = IssueBookDao.save("hi!", 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int i4 = IssueBookDao.save("", (int) (byte) 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int i4 = IssueBookDao.save("hi!", 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int i4 = IssueBookDao.save("", (int) '#', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int i4 = IssueBookDao.save("hi!", (int) ' ', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int i4 = IssueBookDao.save("hi!", (int) (short) 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int i4 = IssueBookDao.save("", 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int i4 = IssueBookDao.save("", (int) (byte) 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int i4 = IssueBookDao.save("", 0, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int i4 = IssueBookDao.save("hi!", (int) (short) 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int i4 = IssueBookDao.save("hi!", 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int i4 = IssueBookDao.save("", 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int i4 = IssueBookDao.save("hi!", 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int i4 = IssueBookDao.save("", (int) ' ', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int i4 = IssueBookDao.save("", 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int i4 = IssueBookDao.save("", (int) (byte) 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int i4 = IssueBookDao.save("hi!", (-1), "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int i4 = IssueBookDao.save("", (int) (byte) 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int i4 = IssueBookDao.save("hi!", (int) '4', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int i4 = IssueBookDao.save("hi!", (int) (short) 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int i4 = IssueBookDao.save("hi!", (int) (short) -1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int i4 = IssueBookDao.save("", (int) (byte) 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int i4 = IssueBookDao.save("", (int) (short) 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int i4 = IssueBookDao.save("", (-1), "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int i4 = IssueBookDao.save("hi!", (int) '4', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int i4 = IssueBookDao.save("hi!", (int) (byte) -1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int i4 = IssueBookDao.save("hi!", 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int i4 = IssueBookDao.save("hi!", (int) (byte) -1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int i4 = IssueBookDao.save("", (int) '#', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int i4 = IssueBookDao.save("", (int) (byte) 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int i4 = IssueBookDao.save("", (int) ' ', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int i4 = IssueBookDao.save("hi!", (int) 'a', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int i4 = IssueBookDao.save("", 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int i4 = IssueBookDao.save("hi!", 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int i4 = IssueBookDao.save("", (int) (short) -1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int i4 = IssueBookDao.save("", (int) (short) 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int i4 = IssueBookDao.save("hi!", (int) (short) 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int i4 = IssueBookDao.save("hi!", (int) (short) 10, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int i4 = IssueBookDao.save("", (int) (byte) -1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int i4 = IssueBookDao.save("", 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int i4 = IssueBookDao.save("hi!", (-1), "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int i4 = IssueBookDao.save("", (int) (byte) 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int i4 = IssueBookDao.save("", (int) 'a', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int i4 = IssueBookDao.save("hi!", (int) (short) 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int i4 = IssueBookDao.save("hi!", 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int i4 = IssueBookDao.save("", 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int i4 = IssueBookDao.save("", (int) (short) 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int i4 = IssueBookDao.save("", (int) (byte) 0, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 100, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int i4 = IssueBookDao.save("hi!", (int) '4', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int i4 = IssueBookDao.save("", (int) (short) 10, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int i4 = IssueBookDao.save("", 100, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int i4 = IssueBookDao.save("hi!", (int) (byte) -1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int i4 = IssueBookDao.save("hi!", (int) 'a', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int i4 = IssueBookDao.save("", (int) '#', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int i4 = IssueBookDao.save("", (int) (short) -1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int i4 = IssueBookDao.save("hi!", 1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int i4 = IssueBookDao.save("hi!", (int) (short) 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 100, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int i4 = IssueBookDao.save("", 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int i4 = IssueBookDao.save("", (int) '#', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int i4 = IssueBookDao.save("hi!", (int) ' ', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int i4 = IssueBookDao.save("hi!", (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int i4 = IssueBookDao.save("", (int) 'a', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int i4 = IssueBookDao.save("", (-1), "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int i4 = IssueBookDao.save("", (int) (short) 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int i4 = IssueBookDao.save("hi!", (int) (short) -1, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int i4 = IssueBookDao.save("hi!", 10, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int i4 = IssueBookDao.save("hi!", 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int i4 = IssueBookDao.save("hi!", (int) (short) 1, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int i4 = IssueBookDao.save("", (int) 'a', "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int i4 = IssueBookDao.save("hi!", (int) (short) 1, "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int i4 = IssueBookDao.save("hi!", 1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int i4 = IssueBookDao.save("", (int) (byte) 0, "hi!", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int i4 = IssueBookDao.save("hi!", (int) '#', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int i4 = IssueBookDao.save("hi!", (int) ' ', "", "");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int i4 = IssueBookDao.save("", (int) (byte) 100, "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int i4 = IssueBookDao.save("", (int) (byte) -1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int i4 = IssueBookDao.save("hi!", (int) (short) 10, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int i4 = IssueBookDao.save("", (int) '4', "", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int i4 = IssueBookDao.save("hi!", (int) (short) -1, "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int i4 = IssueBookDao.save("hi!", (int) '4', "hi!", "hi!");
        org.junit.Assert.assertTrue(i4 == 0);
    }
}

