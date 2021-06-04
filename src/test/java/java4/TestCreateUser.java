package java4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCreateUser {
	WebDriver driver;
	String url = "http://localhost:8080/Poly.AsgJv4/Login";

	String USER_TRUE = "teonv";
	String PASS_TRUE = "123";
	String FULLNAME_TRUE = "teoteo";
	String EMAIL_TRUE = "teo@gmail.com";

	String USER_1 = "kimkhanh";
	String PASS_1 = "test";
	String FULLNAME_1 = "test";
	String EMAIL_1 = "test@gmail.com";

	String USER_2 = "test";
	String PASS_2 = "";
	String FULLNAME_2 = "test";
	String EMAIL_2 = "test@gmail.com";

	String USER_3 = "test";
	String PASS_3 = "test";
	String FULLNAME_3 = "test";
	String EMAIL_3 = "test";

	String USER_4 = "vinh";
	String PASS_4 = "123";
	String FULLNAME_4 = "Nguyen";
	String EMAIL_4 = "tesdfd";

	String USER_5 = "phuln";
	String PASS_5 = "123";
	String FULLNAME_5 = "NguyenPhu";
	String EMAIL_5 = "phuln@gmail.com";

	String USER_6 = "chauchou";
	String PASS_6 = "456#";
	String FULLNAME_6 = "ChauNguyen";
	String EMAIL_6 = "chau@gmail.com";

	LocalDateTime localDateTime = LocalDateTime.now();
	LocalDate localDate = localDateTime.toLocalDate();
	String date = " " + localDate;
	Map<String, Object[]> testNGResult;
	HSSFWorkbook workbook;
	HSSFSheet sheet;

	@Test(priority = 1)
	public void TestCreate_True() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_1);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_1);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_1);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_1);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("1",
					new Object[] {
							"Create1", "Kiểm Tra Create user", " user_input: " + USER_1 + "\n" + " pass_input: "
									+ PASS_1 + "\n" + " fullname: " + FULLNAME_1 + "\n" + " Email: " + EMAIL_1,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("1",
					new Object[] {
							"Create1", "Kiểm Tra Create user", " user_input: " + USER_1 + "\n" + " pass_input: "
									+ PASS_1 + " fullname: " + FULLNAME_1 + " Email: " + EMAIL_1,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void TestCreate2() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_TRUE);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_TRUE);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_TRUE);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_TRUE);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("2",
					new Object[] { "Create2", "Kiểm Tra Create user",
							" user_input: " + USER_TRUE + "\n" + " pass_input: " + PASS_TRUE + "\n" + " fullname: "
									+ FULLNAME_TRUE + "\n" + " Email: " + EMAIL_TRUE,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("2",
					new Object[] {
							"Create2", "Kiểm Tra Create user", " user_input: " + USER_TRUE + "\n" + " pass_input: "
									+ PASS_TRUE + " fullname: " + FULLNAME_TRUE + " Email: " + EMAIL_TRUE,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void TestCreate3() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_3);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_3);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_3);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_3);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("3",
					new Object[] {
							"Create3", "Kiểm Tra Create user", " user_input: " + USER_3 + "\n" + " pass_input: "
									+ PASS_3 + "\n" + " fullname: " + FULLNAME_3 + "\n" + " Email: " + EMAIL_3,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("3",
					new Object[] {
							"Create3", "Kiểm Tra Create user", " user_input: " + USER_3 + "\n" + " pass_input: "
									+ PASS_3 + " fullname: " + FULLNAME_3 + " Email: " + EMAIL_3,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 4)
	public void TestCreate4() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_3);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_3);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_3);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_3);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("3",
					new Object[] {
							"Create3", "Kiểm Tra Create user", " user_input: " + USER_3 + "\n" + " pass_input: "
									+ PASS_3 + "\n" + " fullname: " + FULLNAME_3 + "\n" + " Email: " + EMAIL_3,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("3",
					new Object[] {
							"Create3", "Kiểm Tra Create user", " user_input: " + USER_3 + "\n" + " pass_input: "
									+ PASS_3 + " fullname: " + FULLNAME_3 + " Email: " + EMAIL_3,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void TestCreate5() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_4);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_4);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_4);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_4);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("4",
					new Object[] {
							"Create4", "Kiểm Tra Create user", " user_input: " + USER_4 + "\n" + " pass_input: "
									+ PASS_4 + "\n" + " fullname: " + FULLNAME_4 + "\n" + " Email: " + EMAIL_4,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("4",
					new Object[] {
							"Create4", "Kiểm Tra Create user", " user_input: " + USER_4 + "\n" + " pass_input: "
									+ PASS_4 + " fullname: " + FULLNAME_4 + " Email: " + EMAIL_4,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 6)
	public void TestCreate6() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_5);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_5);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_5);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_5);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("5",
					new Object[] {
							"Create5", "Kiểm Tra Create user", " user_input: " + USER_5 + "\n" + " pass_input: "
									+ PASS_5 + "\n" + " fullname: " + FULLNAME_5 + "\n" + " Email: " + EMAIL_5,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("5",
					new Object[] {
							"Create5", "Kiểm Tra Create user", " user_input: " + USER_5 + "\n" + " pass_input: "
									+ PASS_5 + " fullname: " + FULLNAME_5 + " Email: " + EMAIL_5,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 7)
	public void TestCreate7() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_6);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_6);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_6);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_6);

			WebElement create = driver.findElement(By.id("create"));
			create.click();
			Thread.sleep(1000);
			testNGResult.put("6",
					new Object[] {
							"Create6", "Kiểm Tra Create user", " user_input: " + USER_6 + "\n" + " pass_input: "
									+ PASS_6 + "\n" + " fullname: " + FULLNAME_6 + "\n" + " Email: " + EMAIL_6,
							"Them User thanh cong", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("6",
					new Object[] {
							"Create6", "Kiểm Tra Create user", " user_input: " + USER_6 + "\n" + " pass_input: "
									+ PASS_6 + " fullname: " + FULLNAME_6 + " Email: " + EMAIL_6,
							"Them User thanh cong", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@BeforeClass
	public void suiteSetUp() {
		WebDriverManager.chromedriver().setup();
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("Test Create User Result");
		testNGResult = new LinkedHashMap<String, Object[]>();
		testNGResult.put("0",
				new Object[] { "Test ID", "Mô Tả", "Test Data", "Kết quả Thực Tế", "Trạng Thái", "Ngày Test" });
		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new IllegalStateException("can't start web driver");
		}
	}

	@AfterClass
	public void afterClass() {
		Set<String> keyset = testNGResult.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = testNGResult.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof Boolean)
					cell.setCellValue((Boolean) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File("TestCreateUserResultExcel.xls"));
			workbook.write(out);
			out.close();
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
}
