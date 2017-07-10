package common;

/****************************************
	インポート
****************************************/

//全パッケージ共有のオブジェクトをインポートする
import static common.CommonObject.*;

/****************************************
	クラス
****************************************/
/**
 * 全パッケージ共有のクラスメソッドメソッド
 * @author wakkky05
 *
 */
public class CommonMethods {

	/****************************************
		定数(数値)
	****************************************/
	// Yes コマンドを示す数値を設定する
	private static final int COMMAND_YES = 1;
	// No コマンドを示す数値を設定する
	private static final int COMMAND_NO = 0;

	/****************************************
		定数(フォーマット)
	****************************************/
	private static final String MESSAGE_REQUEST_YES_NO = "1...yes / 0...No";
	
	/****************************************
		クラスメソッド
	****************************************/
	// yes / no の入力を求めるメソッドを定義する
	public static int inputYesOrNo(){
		// ユーザーの入力を保持する変数を宣言する
		int inputCommand;
		// yes/noを確実に入力させる
		do{
			// yes/no の入力を求める
			System.out.println(MESSAGE_REQUEST_YES_NO);
			// 入力されたコマンドを保持する
			inputCommand = sInputScanner.nextInt();
		// Yesコマンド/Noコマンド が入力されていない場合は繰り返す
		}while(inputCommand != COMMAND_YES && inputCommand != COMMAND_NO);
		// コマンドを返す
		return inputCommand;
	}
}
