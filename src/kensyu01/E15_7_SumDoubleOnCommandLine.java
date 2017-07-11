package kensyu01;

/***********************************************
	インポート
***********************************************/
// 合計値を求めるためのクラスを読み込む
import static math.Sum.*;
/**
 * コマンドライン引数に指定された数値を全て加算するクラス
 * @author wakkky05
 *
 */
public class E15_7_SumDoubleOnCommandLine {
	/****************************************
		定数(String)
	****************************************/
	private static final String MESSAGE_OUTPUT_SUM = "合計値です";
	// 合計値を出力することを示すメッセージです
	/**
	 * コマンドライン引数に指定された数値を全て加算します
	 */
	public static void main(String[] operandList){
		// 合計値を出力することを示すメッセージを出力します
		System.out.println(MESSAGE_OUTPUT_SUM);
		// 合計値を出力します
		System.out.println( sum(operandList) );
	}
}
