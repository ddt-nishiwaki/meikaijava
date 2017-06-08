package kensyu01;




//乱数を生成する機能を読み込む
import java.util.Random;

/*** クラス ******************************/
// int,long,float,double型それぞれの絶対値を返すメソッドを実行するクラス
public class E7_31_absoluteMethodOverload {

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "int,long,float,double型それぞれの絶対値を出力します\n";
	// int型の値の絶対値を表示することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_INT = "次のint型の値の絶対値を表示します";
	// long型の値の絶対値を表示することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_LONG = "次のlong型の値の絶対値を表示します";
	// float型の値の絶対値を表示することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_FLOAT = "次のfloat型の値の絶対値を表示します";
	// double型の値の絶対値を表示することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_TARGET_DOUBLE = "次のdouble型の値の絶対値を表示します";
	// 絶対の出力を示す文字列を設定する
	private static final String FORMAT_OUTPUT_TARGET_ABSOLUTE= "絶対値 => ";
	// int,long型の値を出力するためのフォーマットを設定する
	private static final String FORMAT_INT_LONG = "%d\n\n";
	// float,double型の値を出力するためのフォーマットを作成する
	private static final String FORMAT_FLOAT_DOUBLE = "%f\n\n";

	/*** オブジェクト作成 ******************************/
	// 演算対象となる整数を生成するオブジェクトを作成する
	private static Random operandGenerator = new Random();	

	/*** メソッド absolute******************************/
	// int型絶対値を返すメソッドを設定する
	private static int absolute(int operand) {
		// 引数の絶対値を求める
		int absoluteValue = (operand > 0) ? operand : -operand; 
		// 求めた絶対値を返す
		return absoluteValue;
	}
	// long型絶対値を返すメソッドを設定する
	private static long absolute(long operand) {
		// 引数の絶対値を求める
		long absoluteValue = (operand > 0) ? operand : -operand; 
		// 求めた絶対値を返す
		return absoluteValue;
	}
	// float型絶対値を返すメソッドを設定する
	private static float absolute(float operand) {
		// 引数の絶対値を求める
		float absoluteValue = (operand > 0) ? operand : -operand; 
		// 求めた絶対値を返す
		return absoluteValue;
	}
	// double型絶対値を返すメソッドを設定する
	private static double absolute(double operand) {
		// 引数の絶対値を求める
		double absoluteValue = (operand > 0) ? operand : -operand; 
		// 求めた絶対値を返す
		return absoluteValue;
	}
	

	/*** メインメソッド ******************************/
	// int,long,float,double型それぞれの絶対値を返すメソッドを実行する
	public static void main (String[] arg) {
		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 絶対値に変換する値を設定 ******************************/
		// int型乱数を設定する
		int integerValue = operandGenerator.nextInt();
		// long型乱数を設定する
		long longValue = operandGenerator.nextLong();
		// float型乱数を設定する
		float floatValue = operandGenerator.nextFloat();
		// double型乱数を設定する
		double doubleValue = operandGenerator.nextDouble();
		
		/*** int 出力 ******************************/
		// int型の値の絶対値を表示することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_INT);
		// 対象となる値を出力する
		System.out.println(integerValue);
		// int型の値の絶対値を出力する
		System.out.printf(FORMAT_OUTPUT_TARGET_ABSOLUTE+FORMAT_INT_LONG,absolute(integerValue));

		/*** long 出力 ******************************/
		// long型の値の絶対値を表示することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_LONG);
		// 対象となる値を出力する
		System.out.println(longValue);
		// long型の値の絶対値を出力する
		System.out.printf(FORMAT_OUTPUT_TARGET_ABSOLUTE+FORMAT_INT_LONG,absolute(longValue));

		/*** float 出力 ******************************/
		// float型の値の絶対値を表示することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_FLOAT);
		// 対象となる値を出力する
		System.out.println(floatValue);
		// float型の値の絶対値を出力する
		System.out.printf(FORMAT_OUTPUT_TARGET_ABSOLUTE+FORMAT_FLOAT_DOUBLE,absolute(floatValue));

		/*** double 出力 ******************************/
		// double型の値の絶対値を表示することを示すメッセージをを出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_DOUBLE);
		// 対象となる値を出力する
		System.out.println(doubleValue);
		// double型の値の絶対値を出力する
		System.out.printf(FORMAT_OUTPUT_TARGET_ABSOLUTE+FORMAT_FLOAT_DOUBLE,absolute(doubleValue));
	}
}
