package e13_1_shape;

/*************************************************
	インポート
*************************************************/
// 共有の定数を読み込む
import static common.CommonConstants.*;
// 入力を扱うライブラリの読み込みを行う
import java.util.Scanner;

/*
 * 図形クラスの動作をチェックするクラス
 */
public class E13_2_ShapeClassChecker {

	/*************************************************
		検証用の図形設定
	*************************************************/
	// 図形描画回数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DRAW_TIMES = "何回図形を描画しますか？";
	// 図形描画の種類入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DRAW_TYPE = "1...点/2...水平線/3...垂直線/4...長方形/5...直角三角形";
	// 図形の長さ入力を求めるメッセージを設定する

	/*************************************************
		スキャナー設定
	*************************************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner inputScanner = new Scanner(System.in);
	
	/*************************************************
		クラス変数
	*************************************************/
	// 描画回数を保持するための変数を宣言する
	public static int sDrawTimes;
	// 描画コマンド保持するための変数を宣言する
//	public static int sDrawType;
	// 図形インスタンスの確認を行うインスタンス配列を設定する
	public static AbstractShapeChecker[] sShapeCheckerList = {
			new PointChecker(),
			new HorizonChecker(),
			new VerticalChecker(),
			new RectangleChecker(),
			new RightTriangleChecker()
	};

	/*************************************************
		描画する図形の種類入力メソッド
	*************************************************/
	/**
	 * 描画する図形の種類を選択し
	 * 入力されたコマンドを返すメソッドを定義する
	 * 
	 * @author seiji nishiwaki
	 */
	private static int inputDrawType(){
		// 図形描画のコマンド入力を求める
		System.out.println(MESSAGE_REQUEST_DRAW_TYPE);
		// 入力されたコマンドを保持する
		return inputScanner.nextInt();
	}
	/*************************************************
		検証回数入力メソッド
	*************************************************/
	/*
	 * 検証のために描画する回数の入力を求めて
	 * 受け付けた入力値を保持するメソッドを定義する
	 */
	private static int sInputDrawTimes(){
		// 図形描画回数の入力を求める
		System.out.println(MESSAGE_REQUEST_DRAW_TIMES);
		// 入力された図形描画回数を保持する
		return inputScanner.nextInt();
	}
	
	/*************************************************
		コマンドに応じた図形描画
	*************************************************/
	/*
	 * 設定されている描画コマンドから
	 * 出力する図形を振り分けるメソッドを定義する
	 */
	private static void sControlDrawProcess(int drawType){
		// 指定された図形の作成と描画を行う
		sShapeCheckerList[drawType + NUMBER_FORMAT_INDEX].mCheckShape();
	}
	
	/*************************************************
		メインプロセス
	*************************************************/
	// 検証を行う
	public static void main(String[] arg){
		
		/*************************************************
			描画回数設定
		*************************************************/
		// 描画回数の入力を取得する
		int drawTimes = sInputDrawTimes();

		/*************************************************
			図形インスタンス作成
		*************************************************/
		// 設定された回数分処理を繰り返す
		for (int drawCount = INITIALIZE_ZERO; drawCount < drawTimes; drawCount++){
			// 入力されたコマンドに応じた図形を出力する
			sControlDrawProcess( inputDrawType() );
		}
	}
}
