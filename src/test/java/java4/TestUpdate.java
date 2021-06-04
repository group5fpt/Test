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

public class TestUpdate {

	WebDriver driver;
	String url = "http://localhost:8080/Poly.AsgJv4/Login";

	String USER_1 = "phuln1";
	String PASS_1 = "321";
	String FULLNAME_1 = "phu dep trai";
	String EMAIL_1 = "phu.123@gmail.com";

	String USER_2 = "teonv";
	String PASS_2 = "123!123";
	String FULLNAME_2 = "teoquateo";
	String EMAIL_2 = "teo123@gmail.com";

	String USER_3 = "test1";
	String PASS_3 = "testUpdate";
	String FULLNAME_3 = "test";
	String EMAIL_3 = "test@gmail.com";

	String USER_4 = "test123";
	String PASS_4 = "testUPdate";
	String FULLNAME_4 = "test";
	String EMAIL_4 = "test";

	String USER_5 = "";
	String PASS_5 = "";
	String FULLNAME_5 = "";
	String EMAIL_5 = "";

	String USER_6 = "";
	String PASS_6 = "123";
	String FULLNAME_6 = "NguyenPhu";
	String EMAIL_6 = "phuln@gmail.com";

	String USER_7 = "";
	String PASS_7 = "123";
	String FULLNAME_7 = "SangNong";
	String EMAIL_7 = "nongl@gmail.com";

	String USER_8 = "sang";
	String PASS_8 = "";
	String FULLNAME_8 = "SangNong";
	String EMAIL_8 = "";

	String USER_9 = "sang";
	String PASS_9 = "";
	String FULLNAME_9 = "";
	String EMAIL_9 = "";

	String USER_10 = "";
	String PASS_10 = "654";
	String FULLNAME_10 = "";
	String EMAIL_10 = "";

	String USER_11 = "";
	String PASS_11 = "";
	String FULLNAME_11 = "chouchou";
	String EMAIL_11 = "";

	String USER_12 = "";
	String PASS_12 = "";
	String FULLNAME_12 = "chouchou";
	String EMAIL_12 = "chou@gmail.com";

	LocalDateTime localDateTime = LocalDateTime.now();
	LocalDate localDate = localDateTime.toLocalDate();
	String date = " " + localDate;
	Map<String, Object[]> testNGResult;
	HSSFWorkbook workbook;
	HSSFSheet sheet;

	@Test(priority = 1)
	public void TestUpdate1() {
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

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("1",
					new Object[] { "Update1", "Kiểm Tra Update user",
							" user_input: " + USER_1 + "\n" + " pass_input: " + PASS_1 + "\n" + " fullname: "
									+ FULLNAME_1 + "\n" + " Email: " + EMAIL_1,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("1",
					new Object[] {
							"Update1", "Kiểm Tra Update user", " user_input: " + USER_1 + "\n" + " pass_input: "
									+ PASS_1 + " fullname: " + FULLNAME_1 + " Email: " + EMAIL_1,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void TestUpdate2() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_2);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_2);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_2);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_2);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("2",
					new Object[] { "Update2", "Kiểm Tra Update user",
							" user_input: " + USER_2 + "\n" + " pass_input: " + PASS_2 + "\n" + " fullname: "
									+ FULLNAME_2 + "\n" + " Email: " + EMAIL_2,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("2",
					new Object[] {
							"Update2", "Kiểm Tra Update user", " user_input: " + USER_2 + "\n" + " pass_input: "
									+ PASS_2 + " fullname: " + FULLNAME_2 + " Email: " + EMAIL_2,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void TestUpdate3() {
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

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("3",
					new Object[] { "Update3", "Kiểm Tra Update user",
							" user_input: " + USER_3 + "\n" + " pass_input: " + PASS_3 + "\n" + " fullname: "
									+ FULLNAME_3 + "\n" + " Email: " + EMAIL_3,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("3",
					new Object[] {
							"Update3", "Kiểm Tra Update user", " user_input: " + USER_3 + "\n" + " pass_input: "
									+ PASS_3 + " fullname: " + FULLNAME_3 + " Email: " + EMAIL_3,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 4)
	public void TestUpdate4() {
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

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("4",
					new Object[] { "Update4", "Kiểm Tra Update user",
							" user_input: " + USER_4 + "\n" + " pass_input: " + PASS_4 + "\n" + " fullname: "
									+ FULLNAME_4 + "\n" + " Email: " + EMAIL_4,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("4",
					new Object[] {
							"Update4", "Kiểm Tra Update user", " user_input: " + USER_4 + "\n" + " pass_input: "
									+ PASS_4 + " fullname: " + FULLNAME_4 + " Email: " + EMAIL_4,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void TestUpdate5() {
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

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("5",
					new Object[] { "Update5", "Kiểm Tra Update user",
							" user_input: " + USER_5 + "\n" + " pass_input: " + PASS_5 + "\n" + " fullname: "
									+ FULLNAME_5 + "\n" + " Email: " + EMAIL_5,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("5",
					new Object[] {
							"Update5", "Kiểm Tra Update user", " user_input: " + USER_5 + "\n" + " pass_input: "
									+ PASS_5 + " fullname: " + FULLNAME_5 + " Email: " + EMAIL_5,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 6)
	public void TestUpdate6() {
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

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("6",
					new Object[] { "Update6", "Kiểm Tra Update user",
							" user_input: " + USER_6 + "\n" + " pass_input: " + PASS_6 + "\n" + " fullname: "
									+ FULLNAME_6 + "\n" + " Email: " + EMAIL_6,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("6",
					new Object[] {
							"Update6", "Kiểm Tra Update user", " user_input: " + USER_6 + "\n" + " pass_input: "
									+ PASS_6 + " fullname: " + FULLNAME_6 + " Email: " + EMAIL_6,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 7)
	public void TestUpdate7() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_7);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_7);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_7);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_7);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("7",
					new Object[] { "Update7", "Kiểm Tra Update user",
							" user_input: " + USER_7 + "\n" + " pass_input: " + PASS_7 + "\n" + " fullname: "
									+ FULLNAME_7 + "\n" + " Email: " + EMAIL_7,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("7",
					new Object[] {
							"Update7", "Kiểm Tra Update user", " user_input: " + USER_7 + "\n" + " pass_input: "
									+ PASS_7 + " fullname: " + FULLNAME_7 + " Email: " + EMAIL_7,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 8)
	public void TestUpdate8() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_8);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_8);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_8);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_8);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("8",
					new Object[] { "Update8", "Kiểm Tra Update user",
							" user_input: " + USER_8 + "\n" + " pass_input: " + PASS_8 + "\n" + " fullname: "
									+ FULLNAME_8 + "\n" + " Email: " + EMAIL_8,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("8",
					new Object[] {
							"Update8", "Kiểm Tra Update user", " user_input: " + USER_8 + "\n" + " pass_input: "
									+ PASS_8 + " fullname: " + FULLNAME_8 + " Email: " + EMAIL_8,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 9)
	public void TestUpdate9() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_9);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_9);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_9);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_9);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("9",
					new Object[] { "Update9", "Kiểm Tra Update user",
							" user_input: " + USER_9 + "\n" + " pass_input: " + PASS_9 + "\n" + " fullname: "
									+ FULLNAME_9 + "\n" + " Email: " + EMAIL_9,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("9",
					new Object[] {
							"Update9", "Kiểm Tra Update user", " user_input: " + USER_9 + "\n" + " pass_input: "
									+ PASS_9 + " fullname: " + FULLNAME_9 + " Email: " + EMAIL_9,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 10)
	public void TestUpdate10() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_10);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_10);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_10);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_10);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("10",
					new Object[] { "Update10", "Kiểm Tra Update user",
							" user_input: " + USER_10 + "\n" + " pass_input: " + PASS_10 + "\n" + " fullname: "
									+ FULLNAME_10 + "\n" + " Email: " + EMAIL_10,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("10",
					new Object[] {
							"Update10", "Kiểm Tra Update user", " user_input: " + USER_10 + "\n" + " pass_input: "
									+ PASS_10 + " fullname: " + FULLNAME_10 + " Email: " + EMAIL_10,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 11)
	public void TestUpdate11() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_11);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_11);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_11);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_11);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("11",
					new Object[] { "Update11", "Kiểm Tra Update user",
							" user_input: " + USER_11 + "\n" + " pass_input: " + PASS_11 + "\n" + " fullname: "
									+ FULLNAME_11 + "\n" + " Email: " + EMAIL_11,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("11",
					new Object[] {
							"Update11", "Kiểm Tra Update user", " user_input: " + USER_11 + "\n" + " pass_input: "
									+ PASS_11 + " fullname: " + FULLNAME_11 + " Email: " + EMAIL_11,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 12)
	public void TestUpdate12() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_12);

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(PASS_12);

			WebElement fullname = driver.findElement(By.name("fullname"));
			fullname.sendKeys(FULLNAME_12);

			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys(EMAIL_12);

			WebElement update = driver.findElement(By.id("update"));
			update.click();

			Thread.sleep(1000);
			testNGResult.put("12",
					new Object[] { "Update12", "Kiểm Tra Update user",
							" user_input: " + USER_12 + "\n" + " pass_input: " + PASS_12 + "\n" + " fullname: "
									+ FULLNAME_12 + "\n" + " Email: " + EMAIL_12,
							"Cập nhật user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("12",
					new Object[] {
							"Update12", "Kiểm Tra Update user", " user_input: " + USER_12 + "\n" + " pass_input: "
									+ PASS_12 + " fullname: " + FULLNAME_12 + " Email: " + EMAIL_12,
							"Cập nhật user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@BeforeClass
	public void suiteSetUp() {
		WebDriverManager.chromedriver().setup();
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("Test Update User Result");
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
			FileOutputStream out = new FileOutputStream(new File("TestUpdateUserResultExcel.xls"));
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
