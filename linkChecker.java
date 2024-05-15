package utils;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import utils.linkChecker.LinkChecker;

public class LinkCheckerTest {

    @Test
    public void testValidLink() {
        // Create a link checker instance
        LinkChecker linkChecker = new LinkChecker();

        // Test a valid link
        boolean result = linkChecker.checkLink("https://www.example.com");
        
        // Assert that the link is valid
        AssertJUnit.assertTrue(result);
    }

    private void assertTrue(boolean result) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testInvalidLink() {
        // Create a link checker instance
        LinkChecker linkChecker = new LinkChecker();

        // Test an invalid link
        boolean result = linkChecker.checkLink("https://www.example.com/nonexistentpage");

        // Assert that the link is invalid
        AssertJUnit.assertFalse(result);
    }

    @Test
    public void testNullLink() {
        // Create a link checker instance
        LinkChecker linkChecker = new LinkChecker();

        // Test a null link
        boolean result = linkChecker.checkLink(null);
	     // Assert that the result is false since null is not a valid link
        AssertJUnit.assertFalse(result);
    }
}

public class linkChecker {
public class LinkChecker {

		public boolean checkLink(String string) {
			// TODO Auto-generated method stub
			return false;
		}

	}

	public static int verifyLink(String url) {
		// TODO Auto-generated method stub
		return 0;
	}

}



	
	
