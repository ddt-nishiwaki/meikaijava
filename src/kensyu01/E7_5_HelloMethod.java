package kensyu01;

/*** クラス ******************************/
// 「こんにちは」を出力するメソッドをもつクラス
public class E7_5_HelloMethod {

	/*** 定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "挨拶を出力します。";
	// 挨拶を設定する
	private static final String GREETING_MESSAGE = "こんにちは。";


	/*** メソッド ******************************/
	// 入力された挨拶を出力するメソッド
	private static void outputHello ( String greeting ) {

		/*** 出力処理 ******************************/
		// 受け取った挨拶を出力する
		System.out.println(greeting);
	}
	

	/*** メインメソッド ******************************/
	public static void main (String[] arg) {

		/*** 内容説明処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 出力処理 ******************************/
		// 挨拶を出力する
		outputHello(GREETING_MESSAGE);
	}
}
