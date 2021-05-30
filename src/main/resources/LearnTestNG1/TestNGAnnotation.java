
public class TestNGAnnotation {

	@BeforeSuite
	Public void beforeSuite() {
	System.out.println("BeforeSuite");	
	}
	@BeforeTest
	Public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	Public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	Public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	Public void test() {
		System.out.println("Exucute test");
	}
	@AfterMethod
	Public viod afterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	Public viod afterClass() {
		System.out.println("AfterClass");
	
	}
	@AfterTest
	Public viod afterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	Public viod afterSuite() {
		System.out.println("AfterSuite");
		
	}
	
		
		
		
	
	