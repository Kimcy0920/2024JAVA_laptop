package java0725;

class MyClass2 {
	void method() throws MyException2 { // throws
		throw new MyException2("음..음흠.음...흠!음."); // 예외 발생
		// throw new: (생성자)
	}
}

public class MyExceptionEx2 {

	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		mc.method();
	}

}
