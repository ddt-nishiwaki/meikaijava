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
public class E13_1_ShapeClassChecker {

	/*************************************************
		検証用の図形設定
	*************************************************/
	// 図形描画回数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DRAW_TIMES = "何回図形を描画しますか？";
	// 図形描画の種類入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DRAW_TYPE = "1...点/2...水平線/3...垂直線/4...長方形";
	// 図形の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_LENGTH = "長さを入力してください";
	// 図形の幅入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_WIDTH = "幅を入力してください";
	// 図形の高さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_HEIGHT = "幅を入力してください";
	// 点を描画するコマンドを設定する
	private static final int COMMAND_MAKE_POINT = 1;
	// 水平線を描画するコマンドを設定する
	private static final int COMMAND_MAKE_HORIZON = 2;
	// 垂直線を描画するコマンドを設定する
	private static final int COMMAND_MAKE_VERTICAL_LINE = 3;
	// 長方形を描画するコマンドを設定する
	private static final int COMMAND_MAKE_RECTANGLE = 4;

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
	public static int sDrawType;

	/*************************************************
		描画する図形の種類入力メソッド
	*************************************************/
	/*
	 * 描画する図形の種類を選択し
	 * 入力されたコマンドを保持するメソッドを定義する
	 */
	private static void sSetDrawType(){
		// 図形描画のコマンド入力を求める
		System.out.println(MESSAGE_REQUEST_DRAW_TYPE);
		// 入力されたコマンドを保持する
		sDrawType = inputScanner.nextInt();
	}
	/*************************************************
		検証回数入力メソッド
	*************************************************/
	/*
	 * 検証のために描画する回数の入力を求めて
	 * 受け付けた入力値を保持するメソッドを定義する
	 */
	private static void sSetDrawTimes(){
		// 図形描画回数の入力を求める
		System.out.println(MESSAGE_REQUEST_DRAW_TIMES);
		// 入力された図形描画回数を保持する
		sDrawTimes = inputScanner.nextInt();
	}
	
	/*************************************************
		コマンドに応じた図形描画
	*************************************************/
	/*
	 * 設定されている描画コマンドから
	 * 出力する図形を振り分けるメソッドを定義する
	 */
	private static void sControlDrawProcess(){
		// 図形の長さを保持する変数を宣言する
		int length;
		// 図形の幅を保持する変数を宣言する
		int width;
		// 図形の高さを保持する変数を宣言する
		int height;

		// コマンドの種類に応じて処理を振り分ける
		switch(sDrawType){
			// コマンドが点描画だった場合の処理を行う
			case COMMAND_MAKE_POINT :
				// 点を作成する
				AbstractShape point = new Point();
				// 点を出力する
				point.print();
				// 処理を抜ける
				break;
			// コマンドが水平線描画だった場合の処理を行う
			case COMMAND_MAKE_HORIZON :
				// 水平線の長さ入力を求める
				System.out.println(MESSAGE_REQUEST_INPUT_LENGTH);
				// 入力された長さを保持する
				length = inputScanner.nextInt();
				// 水平線を作成する
				AbstractShape horizon = new HorizonLine(length);
				// 水平線を描画する
				horizon.print();
				// 処理を抜ける
				break;
			// コマンドが垂直線描画だった場合の処理を行う
			case COMMAND_MAKE_VERTICAL_LINE :
				// 垂直線の長さ入力を求める
				System.out.println(MESSAGE_REQUEST_INPUT_LENGTH);
				// 入力された長さを保持する
				length = inputScanner.nextInt();
				// 垂直線を作成する
				AbstractShape verticalLine = new VerticalLine(length);
				// 水平線を描画する
				verticalLine.print();
				// 処理を抜ける
				break;
			// コマンドが長方形描画だった場合の処理を行う
			case COMMAND_MAKE_RECTANGLE :
				// 幅の入力を求める
				System.out.println(MESSAGE_REQUEST_INPUT_WIDTH);
				// 入力された幅を保持する
				width = inputScanner.nextInt();
				// 高さの入力を求める
				System.out.println(MESSAGE_REQUEST_INPUT_HEIGHT);
				// 入力された高さを保持する
				height = inputScanner.nextInt();
				// 長方形を作成する
				AbstractShape rectangle = new Rectangle(width,height);
				// 長方形を描画する
				rectangle.print();
				// 処理を抜ける
				break;
		}
	}

	/*************************************************
		メインプロセス
	*************************************************/
	// 検証を行う
	public static void main(String[] arg){


		/*************************************************
			図形インスタンス作成
		*************************************************/
		// 描画する回数を設定する
		sSetDrawTimes();
		
		// 設定された回数分処理を繰り返す
		for (int drawCount = INITIALIZE_ZERO; drawCount < sDrawTimes; drawCount++){
			// 描画する図形を選択する
			sSetDrawType();
			// 入力されたコマンドに応じた図形を出力する
			sControlDrawProcess();
		}
	}
}
