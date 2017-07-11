package math;
/******************************************
	インポート
******************************************/
// 全パッケージ共有の定数を読み込む
import static common.CommonConstants.*;
/**
 * 配列内の全要素の合計を返すメソッドクラス
 * @author wakkky05
 *
 */
public class Sum {
	
	/**
	 * 文字列で指定された数値を全て加算して返します
	 * @return double 合計値
	 */
	public static double sum(String[] operandList){
		// 合計値を求めるための変数を設定します
		double sum = INITIALIZE_ZERO;
		// 引数の要素数を取得します
		int operandLength = operandList.length;
		// 全ての配列要素にアクセスします
		for(String element : operandList){
			sum += Double.parseDouble( element );
		}
		// 全要素の合計値を返す
		return sum;
	}
}
