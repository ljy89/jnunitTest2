package annoutation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest2 {

	@BeforeClass
	public static void beforCalss() { //@BeforeClass ������̼� �޼ҵ�� public static void
		System.out.println("@BeforClass");
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterCalss");
	}
	
	@Before
	public void beforMethod() {
		System.out.println("@Before - �� �׽�Ʈ ���� �� ����");
	}

	
	@After
	public void afterMethod() {
		System.out.println("@After - �� �׽�Ʈ ���� �� ����");
	}
	
	@Test
	public void test_method01() {
		System.out.println("@Test - �ך� �޼ҵ� 1");
	}
	
	@Test
	public void test_method02() {
		System.out.println("@Test - �ך� �޼ҵ� 2");
	}
	
	
	@Ignore
	public void ignorTest() {
		System.out.println("@Ignore - �׽�Ʈ���� ���ܵ�");
	}
	
}
