package kensyu01;

/**********************************************
	インポート
**********************************************/
// 円作成のためにCircleクラスを読み込む
import shape.Circle;
import static common.CommonConstants.*;
/**
 * 引数に設定した半径から
 * 円の円周の長さと面積を表示するクラス
 * 引数はコマンドラインから取得します
 * @author wakkky05
 *
 */
public class E15_6_MakeCircleOnCommandLine {

	/***********************************
		定数(String)
	***********************************/
	// 作成した円の情報を出力することを示すメッセージです
	private static final String MESSAGE_OUTPUT_CIRCLE_DETAIL = "円を作成しました。以下詳細です";
	/**
	 * 円を作成してその詳細を出力します
	 */
	public static void main(String[] args){
		// 設定された引数をdouble型の数値に変換する
		double radius = Double.parseDouble(args[NUMBER_FIRST_INDEX]);
		// 円を作成します
		Circle circle = new Circle(radius);
		// 作成した円の情報を出力することをメッセージ出力する
		System.out.println(MESSAGE_OUTPUT_CIRCLE_DETAIL);
		// 円の詳細を出力する
		System.out.println(circle);
	}
}
