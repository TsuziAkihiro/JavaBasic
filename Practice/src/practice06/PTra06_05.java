package practice06;
/*
 * PTra06_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_05 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 */
		System.out.println( "-----------------------------------");

		for(int i = 0;i < 5;i++) {

			System.out.print("■");

			for(int j = 0;j < 4;j++) {

				System.out.print("■");
				if(j == 3) {
					System.out.println("");
				}


			}
		}
	}
}
