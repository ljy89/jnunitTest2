package Junit.sample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AssertionTest {
	//@Ignore �׽�Ʈ���� ����
	@Test
	public void test() {
		//�׽�Ʈ ������
		String str1 = new String("abc");
		String str2= new String("abc");
		String str3 = null;
		int val1 = 5;
		int val2 = 6;
		
		//�� ��ü�� ���� ��ġ�ϴ��� �׽�Ʈ
		assertEquals(str1, str2);
		
		//������ true���� �׽�Ʈ
		assertTrue(val1< val2);
		
		//������ false���� �׽�Ʈ
		assertFalse(val1> val2);
		
		//��ü�� null���� �׽�Ʈ
		assertNull(str3);
		//assertNotNull(str3); �׽�Ʈ ����
	}

}
