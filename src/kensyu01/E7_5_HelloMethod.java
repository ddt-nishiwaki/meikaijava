package kensyu01;

/*** クラス ******************************/
// 「こんにちは」を出力するメソッドをもつクラス
public class E7_5_HelloMethod {

	/*** 定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "挨拶を出力します。";
	// 挨拶を設定する
	private static final String GREETING_MESSAGE = "こんにちは。";


	/*** メソッド名 ******************************/
	// 入力された挨拶を出力するメソッド
	public static void outputHello ( String greeting ) {
		/*** 処理 ******************************/
		// 受け取った挨拶を出力する
		System.out.println(greeting);
	}
	

	/*** メインメソッド ******************************/
	public static void main (String[] arg) {
		/*** 処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 挨拶を出力する
		System.out.println(GREETING_MESSAGE);
	}
}
