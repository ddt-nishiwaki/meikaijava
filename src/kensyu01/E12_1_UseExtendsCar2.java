package kensyu01;

/****************************************************
	インポート
****************************************************/
// 入力を扱うためにスキャナークラスをインポートする
import java.util.Scanner;

/****************************************************
	クラス
****************************************************/
/*
 * Carクラス第二版 に以下機能を拡張したクラス を検証するクラス
 * 
 * 1) インスタンスを作成する
 * 2) 移動を行うメソッドを実行する
 * 3) 総走行距離フィールドを確認するためにスペック表示を行う
 */
public class E12_1_UseExtendsCar2 {

	/****************************************************
		定数(Carクラスインスタンス作成用)
	****************************************************/
	// 検証用の名前を設定する
	private static final String CAR_NAME = "テスト車";
	// 検証用の幅を設定する
	private static final int CAR_WIDTH = 1885;
	// 検証用の高さを設定する
	private static final int CAR_HEIGHT = 1490;
	// 検証用の長さを設定する
	private static final int CAR_LENGTH = 5220;
	// 検証用の燃料を設定する
	private static final double CAR_FUEL = 90.0;
	// 検証用の購入年を設定する
	private static final int PURCHASE_YEAR = 2010;
	// 検証用の購入月を設定する
	private static final int PURCHASE_MONTH = 10;
	// 検証用の購入日を設定する
	private static final int PURCHASE_DATE = 15;
	
	// 移動を続けるコマンドを設定する
	private static final int NUMBER_COMMAND_MOVE = 1;
	// 移動を終了するコマンドを設定する
	private static final int NUMBER_COMMAND_END = 0;
	
	/****************************************************
		定数(メッセージ)
	****************************************************/
	// インスタンスを作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_INSTANCE = "以下インスタンスを作成しました";
	// 移動先の座標入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_DESTINATION_DOT = "移動先の座標を設定してください";
	// 移動を行うメソッドを実行することを示すメッセージを設定する
	private static final String MESSAGE_DO_MOVE = "移動を行うメソッドを実行する";
	// スペック表示を行うことを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_SPEC = "総走行距離フィールドを確認するためにスペック表示を行う";
	
	// 移動を続けるかどうかのコマンド入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_COMMAND_MOVE = "移動を行いますか？ : 1 ... 移動する  0 ... 終了する";
	// 移動を終了することを示すメッセージを設定する
	private static final String MESSAGE_END_MOVE = "移動を終了します";
	
	
	
	/****************************************************
		定数(フォーマット)
	****************************************************/
	// 座標入力を求めるフォーマットを設定する
	private static final String FORMAT_INPUT_DOT = "%s座標を入力 : ";

	/****************************************************
		定数(テキスト)
	****************************************************/
	// テキスト「x」を設定する
	protected static final String TEXT_DOT_X = "x";
	// テキスト「y」を設定する
	protected static final String TEXT_DOT_Y = "y";
	
	/****************************************************
		定数(テキスト)
	****************************************************/
	// 入力を扱うスキャナーを作成する
	private static Scanner inputScanner = new Scanner(System.in);

	/****************************************************
		メインプロセス
	****************************************************/
	// Carクラス第二版 に以下機能を拡張したクラス を検証する
	public static void main(String[] arg){
		// ユーザーのコマンドを保持する変数を宣言する
		int userCommand;
		
		/*** 検証用インスタンス作成 ****************/
		// インスタンスを作成することを示すメッセージを出力する
		System.out.println(MESSAGE_MAKE_INSTANCE);
		// 購入日を設定する
		Day purchaseDay = new Day(PURCHASE_YEAR,PURCHASE_MONTH,PURCHASE_DATE);
		// インスタンスを作成する
		ExtendsCar2 testCar = new ExtendsCar2(CAR_NAME, CAR_WIDTH, CAR_HEIGHT, CAR_LENGTH, CAR_FUEL, purchaseDay);
		// 作成したインスタンスのスペックを確認する
		testCar.mPrintSpec();
		
		/*** 検証 ****************/
		do {
			// 移動を行うメソッドを実行することを示すメッセージを出力する
			System.out.println(MESSAGE_DO_MOVE);
			// 移動先の座標入力を求める
			System.out.println(MESSAGE_REQUEST_DESTINATION_DOT);

			// x座標入力を求めるテキストを出力する
			System.out.printf(FORMAT_INPUT_DOT,TEXT_DOT_X);
			// 入力されたX座標を保持する
			int moveX = inputScanner.nextInt();

			// y座標入力を求めるテキストを出力する
			System.out.printf(FORMAT_INPUT_DOT,TEXT_DOT_Y);
			// 入力されたY座標を保持する
			int moveY = inputScanner.nextInt();

			// 移動を行うメソッドを実行する
			testCar.mMove(moveX, moveY);
			
			// スペック表示を行うことを示すメッセージを出力する
			System.out.println(MESSAGE_OUTPUT_SPEC);
			
			// スペックを表示する
			testCar.mPrintSpec();
			
			// 正しいコマンドを入力させる
			do {
				// 移動を続けるかどうかのコマンド入力を求める
				System.out.println(MESSAGE_REQUEST_COMMAND_MOVE);
				// 入力されたコマンドを保持する
				userCommand = inputScanner.nextInt();
			// 正しいコマンドが入力されるまで繰り返す
			} while(userCommand != NUMBER_COMMAND_MOVE && userCommand != NUMBER_COMMAND_END);
			
			// 終了コマンドが入力された場合の処理を行う
			if(userCommand == NUMBER_COMMAND_END){
				// 移動を終了することを示すメッセージを出力する
				System.out.println(MESSAGE_END_MOVE);
			}
		// 移動コマンドが入力された場合は繰り返す
		}while(userCommand == NUMBER_COMMAND_MOVE);
	}
}
