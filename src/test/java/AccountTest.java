import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final Boolean result;

    public AccountTest(String name, Boolean result) {
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
            {"ывл ывао", true},
            {"fsaf asdf", true},
            {"123 456778", true},
                {"ы л", true},
                {"ывывао", false},
                {"ывл ывао ", false},
                {" ывл ывао", false},
                {" ывл ывао ", false},
                {"gsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfdsafasdfasdfasdfasdffgsdfgsdfgsdgf", false},
        };
    }
    @Test
    public void checkNameToEmbossTest() {
        Account account = new Account(name);
        Assert.assertEquals(result, account.checkNameToEmboss());

    }

}
