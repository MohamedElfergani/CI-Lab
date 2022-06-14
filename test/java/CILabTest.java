import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

import java.beans.Transient;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    @DisplayName("ALL CAPS")
    public void detectCapitalUseTest1() {
        myString.setString("THIS IS FOR ALL CAPS");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("Only First Letter Cap")
    public void detectCapitalUseTest2() {
        myString.setString("This Is First Letter Caps");
        assertTrue(myString.detectCapitalUse());
    }

    @Test 
    @DisplayName("rAnDoM CaPs")
    public void detectCapitalUseTest3() {
        myString.setString("ThIs FoR RanDoM CaPs");
        assertTrue(myString.detectCapitalUse());
    }

    @Test 
    @DisplayName("empty")
    public void detectCapitalUseTest4() {
        myString.setString(""); 
        assertTrue(myString.detectCapitalUse());
    }

    @Test 
    @DisplayName("get the string")
    public void getString1() {
        myString.setString("Test"); 
        assertTrue("Test", myString.getString());
    }

    @Test 
    @DisplayName("null string")
    public void getString2() {
        assertNull(myString.getString());
    }
}
