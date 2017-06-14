package kensyu01;

/*** クラス ***********************/
// 人間クラスを使用するクラス
public class E9_4_UseHumanClass {
		
		/*** ボブの情報設定 **************************/
		// 名義人「ボブ」を設定する
		private static final String NAME_BOB = "bob";

		/*** マイクの情報設定 **************************/
		// 名義人「マイク」を設定する
		private static final String NAME_MIKE = "mike";
		// マイクの身長を設定する
		private static final float NUMBER_MIKES_HEIGHT = (float)170.5;

		/*** アベルの情報設定 **************************/
		// 名義人「アベル」を設定する
		private static final String NAME_ABEL = "abel";
		// アベルの身長を設定する
		private static final float NUMBER_ABELS_HEIGHT = (float)167.5;
		// アベルの体重を設定する
		private static final float NUMBER_ABELS_WEIGHT = (float)65.5;

		/*** シェリーの情報設定 **************************/
		// 名義人「シェリー」を設定する
		private static final String NAME_CHERIE = "cherie";
		// シェリーの身長を設定する
		private static final float NUMBER_CHERIES_HEIGHT = (float)156.7;
		// シェリーの体重を設定する
		private static final float NUMBER_CHERIES_WEIGHT = (float)62.3;
		// シェリーの誕生日を設定する
		private static final Day DAY_CHERIES_BIRTHDAY = new Day(2003,3,3);
		
		/*** メインメソッド ***********************/
		// Humanクラスを定義するして設定したインスタンスから値を取り出す処理を行う
		public static void main (String[] arg){

			/*** オブジェクト作成 ***********************/
			// defaultを設定する
			HumanClass defaultHuman = new HumanClass();
			// 「ボブ」を設定する
			HumanClass bob = new HumanClass(NAME_BOB);
			//「マイク」を設定する	
			HumanClass mike = new HumanClass(NAME_MIKE,NUMBER_MIKES_HEIGHT);
			//「アベル」を設定する	
			HumanClass abel = new HumanClass(NAME_ABEL,NUMBER_ABELS_HEIGHT,NUMBER_ABELS_WEIGHT);
			//「シェリー」を設定する	
			HumanClass cherie = new HumanClass(NAME_CHERIE,NUMBER_CHERIES_HEIGHT,NUMBER_CHERIES_WEIGHT,DAY_CHERIES_BIRTHDAY);
			

			/*** defaultHumanのデータ出力 ***********************/
			// 設定を確認するためにdefaultHumanの設定を出力する
			System.out.println(defaultHuman);
			
			/*** ボブのデータ出力 ***********************/
			// 設定を確認するためにbobの設定を出力する
			System.out.println(bob);

			/*** マイクのデータ出力 ***********************/
			// 設定を確認するためにmikeの設定を出力する
			System.out.println(mike);

			/*** アベルのデータ出力 ***********************/
			// 設定を確認するためにabelの設定を出力する
			System.out.println(abel);

			/*** シェリーのデータ出力 ***********************/
			// 設定を確認するためにシェリーの設定を出力する
			System.out.println(cherie);
		}
	}