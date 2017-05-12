package kensyu01;

// 入力した値を扱う機能を読み込む
import java.util.Scanner;

/********************************************************/

// 2つの値の入力を受つけ、それぞれ float,double型の値として出力するクラス
public class E5_2_OutputFloatDouble {

	// float型の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_FLOAT = "float型の値を設定します。 : ";
	// double型の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DOUBLE = "double型の値を設定します。 : ";
	// テキスト「float型」を設定する
	private static final String TEXT_FLOAT = "float型";
	// テキスト「double型」を設定する
	private static final String TEXT_DOUBLE = "double型";
	// テキスト「出力する」を設定する
	private static final String TEXT_OUTPUT = "出力する";


	/********************************************************/

	// 2つの値の入力を受つけ、それぞれ float,double型の値として出力する処理を行う
	public static void main(String[] arg) {

		// float型の値入力を扱うオブジェクトを作成する
		Scanner scannerFloatInput = new Scanner(System.in);
		// double型の値入力を扱うオブジェクトを作成する
		Scanner scannerDoubleInput = new Scanner(System.in);


		/********************************************************/

		// float型の値入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_FLOAT);
		// 入力された値をfloat型で保持する
		float floatValue = scannerFloatInput.nextFloat();

		// double型の値入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_DOUBLE);
		// 入力された値をdouble型で保持する
		double doubleValue = scannerDoubleInput.nextDouble(); 

		// 入力されたfloat型の値を出力するメッセージを表示する
		System.out.print(TEXT_FLOAT+"で"+TEXT_OUTPUT);
		// 入力されたfloat型の値を出力する
		System.out.println(floatValue);

		// 入力されたdouble型の値を出力するメッセージを表示する
		System.out.print(TEXT_DOUBLE+"で"+TEXT_OUTPUT);
		// 入力されたdouble型の値を出力する
		System.out.println(doubleValue);


		/********************************************************/

		// float型入力ストリームを閉じる
		scannerFloatInput.close();
		// double型入力ストリームを閉じる
		scannerDoubleInput.close();
	}
}
