package math;

/**
 * double型の値を出力するメソッドクラス
 * @author wakkky05
 *
 */
public class DoublePrinter {
	
	/**
	 * double型の値を指定した桁数で表示します
	 * @param value 出力対象となる値です
	 * @param minDigit 最低桁数を指定します
	 * @param floatDigit 小数点以下の桁数を指定します
	 * 
	 */
	public static void printDouble(double value, int minDigit, int floatDigit){
		int intDigitSetting;		// フォーマットに指定する浮動小数点以下の桁数を設定するための変数です
		// 設定条件を満たす整数値桁数の値を取得する
		intDigitSetting = decideIntDigit(value, minDigit, floatDigit);
		// 小数点数以下の値を設定された桁数だけ文字列として取得する
		String stringFloatValue = getStringFloatValue(value,floatDigit);
		// フォーマットを設定します
		String formatOutputDouble = String.format("%%0%dd%s",intDigitSetting, stringFloatValue);
		// 設定されたdouble型の数値を出力します
		System.out.printf(formatOutputDouble, (int)value, stringFloatValue);
	}
	/**
	 * イント型引数の桁数を決定します
	 * @param value
	 * @param minDigit
	 * @param floatDigit
	 * @return
	 */
	private static int decideIntDigit(double value, int minDigit, int floatDigit){
		int notEnoughDigit;			// 不足分の桁数を設定するための変数です
		int intDigitSetting;		// 整数値の出力桁数を設定するための変数です
		// 設定された値の整数部分の桁数を取得する
		int intDigit = getIntDigit(value);
		// 桁数が不足している 場合の処理を行う
		if ( minDigit > intDigit + floatDigit ){
			// 不足分の桁数を求める
			notEnoughDigit = minDigit - ( intDigit + floatDigit );
			// 整数値部分の桁数を設定する
			intDigitSetting = intDigit + notEnoughDigit;
		// 最小桁数を満たしている 場合の処理を行う
		} else {
		 // 整数値の桁数を設定する
			intDigitSetting = intDigit;
		}
		// 整数値の桁数を返す
		return intDigitSetting; 
	}
	/**
	 * 整数値の桁数を取得します
	 * @return int
	 */
	private static int getIntDigit(double value){
		// 設定された値の整数部分の桁数を取得して返します
		return String.valueOf( (int)value ).length();
	}
	/**
	 * double型の小数点以下の値をString型で取得して返します
	 * @return String
	 */
	private static String getStringFloatValue(double value, int floatDigit){
		// 設定されたdouble型の値の整数値部分の桁数を取得します
		int intDigit = getIntDigit(value);
		// 設定された桁数とインデックスのズレを修正する
		floatDigit++;
		// 小数点以下の値から設定された桁数までを文字列として取得します
		return String.valueOf(value).substring(intDigit, (intDigit + floatDigit));
	}

	

}
