package RockPaperScissors;

/**************************************
	インポート
**************************************/
// 全パッケージ共有の定数をインポートする
import static common.CommonConstants.*;
// 全パッケージ共有のオブジェクトをインポートする
import static common.CommonObject.*;
// 全パッケージ共有のメソッドをインポートする
import static common.CommonMethods.*;

/**************************************
	クラス
**************************************/
/**
 * じゃんけんを行うシーンクラス
 * @author wakkky05
 */
public class ScenePlayRockPaperScissers {

	/**************************************
		定数(メッセージ)
	**************************************/
	// じゃんけんを開始することを示すメッセージを設定する
	private static final String MESSAGE_START_GAME = "じゃんけんを開始します";
	// プレーヤーを示すメッセージを設定する
	private static final String MESSAGE_SHOW_PLAYER = "人間 vs コンピューター";
	// ゲームを続けるかどうかを尋ねるメッセージを設定する
	private static final String MESSAGE_REQUEST_CONTINUE_GAME = "じゃんけんを続けますか？";

	/**************************************
		定数(テキスト)
	**************************************/
	// テキス「グー」を設定する
	private static final String TEXT_ROCK = "グー";
	// テキス「チョキ」を設定する
	private static final String TEXT_SCISSERS = "チョキ";
	// テキス「パー」を設定する
	private static final String TEXT_PAPER = "パー";

	/**************************************
		定数(フォーマット)
	**************************************/
	// 互いの手を確認するためのフォーマットを設定する
	private static final String FORMAT_SHOW_HAND = "人間 => %s  vs  %s <= コンピューター\n";

	/**************************************
		定数(数値)
	**************************************/
	// じゃんけんを終了するための値を設定する
	private static final int NUMBER_GAME_END = 0;
	// グーを示す値を設定する
	private static final int COMMAND_ROCK = 1;
	// チョキを示す値を設定する
	private static final int COMMAND_SCISSERS = 2;
	// パーを示す値を設定する
	private static final int COMMAND_PAPER = 3;
	// 勝ちを示す値を設定する
	private static final int NUMBER_WIN = 1;
	// 負けを示す値を設定する
	private static final int NUMBER_LOOSE = -1;
	// あいこを示す値を設定する
	private static final int NUMBER_DRAW = 0;

	/**************************************
		定数(数値)
	**************************************/
	// 勝ったことを示すメッセージを設定する
	private static final String MESSAGE_YOU_WIN = "あなたの勝ちです";
	// 負けたことを示すメッセージを設定する
	private static final String MESSAGE_YOU_LOOSE = "あなたの負けです";
	// あいこを示すメッセージを設定する
	private static final String MESSAGE_DRAW = "あいこです";
	// じゃんけんを終了することを示すメッセージを設定する
	private static final String MESSAGE_END_GAME = "じゃんけんを終了します";
	/**************************************
		クラス変数
	**************************************/
	// 決定した手を示す文字列を設定する
	private static String[] sTextPlayerHand = {
		TEXT_ROCK,	
		TEXT_SCISSERS,	
		TEXT_PAPER
	};

	/**************************************
		プレーヤー設定
	**************************************/
	// プレーヤー(人間)を設定する
	private static AbstractPlayer human = new HumanPlayer();
	// プレーヤー(コンピューター)を設定する
	private static AbstractPlayer computer = new ComputerPlayer();
	
	/**
	 * じゃんけんの勝負結果を返すメソッドを定義する
	 */
	private static int mGetGameResult(int myHand, int opponentHand){
		// 勝負結果を保持する変数を設定する
		int gameResult = NUMBER_DRAW;
		// 負けているかどうかを判定する
		gameResult = mDecideLoose(myHand, opponentHand);
		// 負けていなかった場合の処理を行う
		if(gameResult != NUMBER_LOOSE){
			// 勝っているかどうかを判定する
			gameResult = mDecideWin(myHand, opponentHand);
		}
		// 勝負結果を返す
		return gameResult;
	}
	/**
	 * 負けていた場合の値を返すメソッドを定義する
	 */
	private static int mDecideLoose(int myHand, int opponentHand){
		// 勝負結果を保持する変数を設定する
		int gameDecision = NUMBER_DRAW;
		// グーvsパー の場合の処理を行う
		gameDecision = (myHand == COMMAND_ROCK && opponentHand == COMMAND_PAPER) ? NUMBER_LOOSE : gameDecision;
		// パーvsチョキ の場合の処理を行う
		gameDecision = (myHand == COMMAND_PAPER && opponentHand == COMMAND_SCISSERS) ? NUMBER_LOOSE : gameDecision;
		// チョキvsグー の場合の処理を行う
		gameDecision = (myHand == COMMAND_SCISSERS && opponentHand == COMMAND_ROCK) ? NUMBER_LOOSE : gameDecision;
		// 判定結果を返す
		return gameDecision;
	}
	/**
	 * 勝っていた場合の値を返すメソッドを定義する
	 */
	private static int mDecideWin(int myHand, int opponentHand){
		// 勝負結果を保持する変数を設定する
		int gameDecision = NUMBER_DRAW;
		// グーvsチョキ の場合の処理を行う
		gameDecision = (myHand == COMMAND_ROCK && opponentHand == COMMAND_SCISSERS) ? NUMBER_WIN : gameDecision;
		// チョキvsパー の場合の処理を行う
		gameDecision = (myHand == COMMAND_SCISSERS && opponentHand == COMMAND_PAPER) ? NUMBER_WIN : gameDecision;
		// パーvsグー の場合の処理を行う
		gameDecision = (myHand == COMMAND_PAPER && opponentHand == COMMAND_ROCK) ? NUMBER_WIN : gameDecision;
		// 判定結果を返す
		return gameDecision;
	}
	
	/**
	 * 決定した手を示す文字列を返すメソッドを定義する
	 */
	private static String mGetPlayerHand(int decideHand){
		return sTextPlayerHand[decideHand + NUMBER_FORMAT_INDEX];
	}
	
	/**
	 * 勝負結果を出力するメソッドを定義する
	 */
	private static void mOutputGameResult(int gameResult){
		// 勝っていた場合の処理を行う
		if(gameResult == NUMBER_WIN){
			// 勝ったことをメッセージで出力する
			System.out.println(MESSAGE_YOU_WIN);
		// 負けていた場合の処理を行う
		} else if(gameResult == NUMBER_LOOSE) {
			// 負けたことをメッセージで出力する
			System.out.println(MESSAGE_YOU_LOOSE);
		} else {
			System.out.println(MESSAGE_DRAW);
		}
	}
	
	/**
	 * じゃんけんを行うメソッドを宣言する
	 */
	private static void mPlayGame(){
		int humanHand;		// 人間の手を設定する変数を宣言する
		int computerHand;	// コンピューターの手を設定する変数を宣言する
		int gameResult;		// 勝負結果を保持する変数を宣言する
		// じゃんけんを繰り返す
		do{
			// プレーヤー(人間)の手を設定する
			humanHand = human.mDecideHand();
			// プレーヤー(コンピューター)の手を設定する
			computerHand = computer.mDecideHand();
			// 互いの手を確認する
			System.out.printf(FORMAT_SHOW_HAND, mGetPlayerHand(humanHand),mGetPlayerHand(computerHand));
			// 勝負結果を取得する
			gameResult = mGetGameResult(humanHand, computerHand);
			// 勝負結果を出力する
			mOutputGameResult(gameResult);
			// 勝負を続けるかどうか尋ねる
			System.out.println(MESSAGE_REQUEST_CONTINUE_GAME);
		// 終了コマンドが入力されるまで繰り返す
		}while(sInputYesOrNo() != NUMBER_GAME_END);
		// ゲームを終了することを示すメッセージを出力する
		System.out.println(MESSAGE_END_GAME);
	}
	
	/**
	 * メインプロセス
	 */
	public static void main(String[] arg){
		// じゃんけんを開始することをメッセージで出力する
		System.out.println(MESSAGE_START_GAME);
		// プレーヤーを示すメッセージを出力する
		System.out.println(MESSAGE_SHOW_PLAYER);
		// じゃんけんを開始する
		mPlayGame();
		// 入力ストリームを閉じる
		sInputScanner.close();
	}
}
