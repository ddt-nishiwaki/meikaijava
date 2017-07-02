package RockPaperScissors;

/**************************************
	インポート
**************************************/
// 全パッケージ共有のオブジェクトをインポートする
import static common.CommonObject.*;

/**************************************
	クラス
**************************************/
/**
 * じゃんけんプレーヤー(人間)クラス
 * @author wakkky05
 */
public class HumanPlayer extends AbstractPlayer{

	/**************************************
		定数(数値)
	**************************************/
	// じゃんけんコマンドの最小値を設定する
	private static final int COMMAND_MINIMUM = 1;
	// じゃんけんコマンドの最大値を設定する
	private static final int COMMAND_MAX = 3;

	/**************************************
		定数(メッセージ)
	**************************************/
	// グーチョキパーのコマンドを示すメッセージを設定する
	private static final String MESSAGE_REQUEST_ROCK_PAPER_SCISSERS = "じゃんけん\n1...グー / 2...チョキ / 3...パー";

	/**************************************
		実装　インスタンスメソッド
	**************************************/
	/**
	 * 出す手を決めるメソッドを定義する
	 * 
	 * 1...グー / 2...チョキ / 3...パー
	 * のいずれかの値を返す
	 */
	public int mDecideHand(){
		// 入力されたコマンドを保持する変数を宣言する
		int inputCommand;
		// グーチョキパーのいずれかを確実に入力させる
		do{
			// グーチョキパーの入力を求める
			System.out.println(MESSAGE_REQUEST_ROCK_PAPER_SCISSERS);
			// 入力されたコマンドを保持する
			inputCommand = sInputScanner.nextInt();
		// コマンドが不正な場合は繰り返す
		}while(inputCommand < COMMAND_MINIMUM || inputCommand > COMMAND_MAX);
		// 入力されたコマンドを返す
		return inputCommand;
	};
}
