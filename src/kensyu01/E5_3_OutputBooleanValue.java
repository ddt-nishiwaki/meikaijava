package kensyu01;

// 設定したboolean型変数の値を文字列で出力するクラス
public class E5_3_OutputBooleanValue {

	// trueの値を設定する
	private static final boolean VALUE_OF_TRUE = true;
	// falseの値を設定する
	private static final boolean VALUE_OF_FALSE = false;
	// VALUE_OF_TRUEの値を出力する際のメッセージを設定する
	private static final String MESSAGE_OF_TRUE = "VALUE_OF_TRUEの値は";
	// VALUE_OF_FALSEの値を出力する際のメッセージを設定する
	private static final String MESSAGE_OF_FALSE = "VALUE_OF_FALSEの値は";

	/************************************************************/

	// 設定したboolean型変数の値を文字列で出力する処理を行う
	public static void main(String[] arg){

		// VALUE_OF_TRUEの値を出力する
		System.out.println(MESSAGE_OF_TRUE+VALUE_OF_TRUE);
		// VALUE_OF_FALSEの値を出力する
		System.out.println(MESSAGE_OF_FALSE+VALUE_OF_FALSE);
	}
}
