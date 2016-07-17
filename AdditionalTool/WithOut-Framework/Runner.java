
public class Runner{
	public static void main(String [] args) throws Exception{
		TestHomePage testHome = new TestHomePage();
		testHome.verifyTitle();
		TestSignOnPage testSignOn = new TestSignOnPage();
		testSignOn.verifyTitle();
	}
}
