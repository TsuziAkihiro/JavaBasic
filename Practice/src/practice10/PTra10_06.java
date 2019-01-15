package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];

		Car car1 = new Car();
			car1.serialNo = 10000;
			car1.color = "赤";
			car1.gasoline = 40;

		Car car2 = new Car();
			car2.serialNo = 20000;
			car2.color = "白";
			car2.gasoline = 45;

		Car car3 = new Car();
			car3.serialNo = 30000;
			car3.color = "黒";
			car3.gasoline = 50;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for(int i = 0;i < cars.length;i++) {
			int total =0;
			 for(int n =0;total <= 300;n++) {
				 int dis = cars[i].run();
				 if(dis == -1) {
					 System.out.println("目的地に到達できませんでした");
					 break;
				 }else {
					 total += dis;
				 }
				 if(total >= 300) {
					 System.out.println("目的地にまで"+ n +"時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					 break;
				 }
			 }
		}
	}
}
