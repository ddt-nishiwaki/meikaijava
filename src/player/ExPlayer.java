package player;

/**
 * 
 * @author wakkky05
 * @see Player
 *
 */
public interface ExPlayer extends Player {
	
	/****************************************
		定数(String)
	****************************************/
	// スロー再生することを示すメッセージフォーマットを設定する
	public static final String FORMAT_SLOW_PLAY = "%sスロー再生開始\n";

	/****************************************
		メソッド
	****************************************/
	/**
	 * スロウ再生メソッドの実装を強制します
	 */
	void mSlow();
}
