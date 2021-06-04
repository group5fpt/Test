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

public class TestDelete {

	WebDriver driver;
	String url = "http://localhost:8080/Poly.AsgJv4/Login";

	String USER_1 = "test";
	String USER_2 = "teonv";
	String USER_3 = "phuln";

	LocalDateTime localDateTime = LocalDateTime.now();
	LocalDate localDate = localDateTime.toLocalDate();
	String date = " " + localDate;
	Map<String, Object[]> testNGResult;
	HSSFWorkbook workbook;
	HSSFSheet sheet;

	@Test(priority = 1)
	public void TestDelete1() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_1);

			WebElement delete = driver.findElement(By.id("delete"));
			delete.click();

			Thread.sleep(1000);
			testNGResult.put("1", new Object[] { "Delete1", "Kiểm Tra Delete user", " user_input: " + USER_1,
					"Xóa user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("1", new Object[] { "Delete1", "Kiểm tra Delete user", " user_input: " + USER_1,
					"Xóa user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void TestDelete2() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_2);

			WebElement delete = driver.findElement(By.id("delete"));
			delete.click();

			Thread.sleep(2000);
			testNGResult.put("2", new Object[] { "Delete2", "Kiểm Tra Delete user", " user_input: " + USER_2,
					"Xóa user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("2", new Object[] { "Delete2", "Kiểm tra Delete user", " user_input: " + USER_2,
					"Xóa user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void TestDelete3() {
		try {
			driver.get(url);
			driver.manage().window().maximize();

			WebElement chonAdmin = driver.findElement(By.id("as"));
			chonAdmin.click();

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(USER_3);

			WebElement delete = driver.findElement(By.id("delete"));
			delete.click();

			Thread.sleep(3000);
			testNGResult.put("3", new Object[] { "Delete3", "Kiểm Tra Delete user", " user_input: " + USER_3,
					"Xóa user thành công", "Pass", date });
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testNGResult.put("3", new Object[] { "Delete3", "Kiểm tra Delete user", " user_input: " + USER_3,
					"Xóa user thành công", "Fail", date });
			Assert.assertTrue(false);
		}
	}

	@BeforeClass
	public void suiteSetUp() {
		WebDriverManager.chromedriver().setup();
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("Test Delete User Result");
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
			FileOutputStream out = new FileOutputStream(new File("TestDeleteUserResultExcel.xls"));
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
