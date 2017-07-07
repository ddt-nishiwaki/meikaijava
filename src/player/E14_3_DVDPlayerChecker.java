package player;

/**
 * DVDPlayerのインスタンスをチェックするクラス
 * @author wakkky05
 *
 */
public class E14_3_DVDPlayerChecker {

	/*****************************************************
		定数(String)
	*****************************************************/
	private static final String MESSAGE_CHECK_DVD_PLAYER = "DVDプレーヤーをテストします";
	private static final String MESSAGE_CHECK_PLAY_BUTTON = "再生ボタンを押します";
	private static final String MESSAGE_CHECK_SLOW_BUTTON = "スロー再生ボタンを押します";
	private static final String MESSAGE_CHECK_STOP_BUTTON = "停止ボタンを押します";

	/*****************************************************
		メソッド
	*****************************************************/
	/**
	 * DVDPlayerインスタンスを作成して
	 * 実装された以下3メソッドの動作を確認します<br>
	 * mPlay<br>
	 * mSlowPlay<br>
	 * mStop
	 * @param arg
	 */
	public static void main(String[] arg){
		// テスト用のDVDPlayerインスタンスを作成します
		DVDPlayer testPlayer = new DVDPlayer();

		// テストを行うことをメッセージ出力します
		System.out.println(MESSAGE_CHECK_DVD_PLAYER);

		// 再生テストを行うことをメッセージ出力します
		System.out.println(MESSAGE_CHECK_PLAY_BUTTON);
		// 再生メソッドの出力を確認します
		testPlayer.mPlay();
		
		// スロー再生テストを行うことをメッセージ出力します
		System.out.println(MESSAGE_CHECK_SLOW_BUTTON);
		// スロー再生メソッドの出力を確認します
		testPlayer.mSlow();;

		// 停止テストを行うことをメッセージ出力します
		System.out.println(MESSAGE_CHECK_STOP_BUTTON);
		// 停止メソッドの出力を確認します
		testPlayer.mStop();;
		
	}
}
