
//  PRIVATE ACCESS MODIFIRE-OUTSIDE PACKAGE BY SUBCLASS ONLY   

package demo1;
import access_modifires_demo.test1;

public class test3 extends test1 {

	public static void main(String[] args) {
		test3 t3 = new test3();
		t3.show();
		System.out.println(t3.i);

	}

}
