package player;


/**
 * DVDプレーヤを作成するクラス
 * 再生,スロー再生,停止メソッドを持ちます
 * @author wakkky05
 * @see ExPlayer
 * @see Player
 */
public class DVDPlayer implements ExPlayer{

	/****************************************
		定数(String)
	****************************************/
	private static final String MEDIA_NAME = "DVD";
	
	/**
	 * 再生を行うことをメッセージ出力します
	 */
	public void play(){
		System.out.printf(FORMAT_PLAY,MEDIA_NAME);
	}

	/**
	 * 停止を行うことをメッセージ出力します
	 */
	public void stop(){
		System.out.printf(FORMAT_STOP,MEDIA_NAME);
	}

	/**
	 * スロウ再生を行うことをメッセージ出力します
	 */
	public void slow(){
		System.out.printf(FORMAT_SLOW_PLAY,MEDIA_NAME);
	}
}
