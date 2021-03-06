/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
        ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	 String line = scanner.nextLine();
                 String[] player = line.split(",", 0);
                 Player md = new Player();
	                 md.setPosition(player[0]);
	                 md.setName(player[1]);
	                 md.setCountry(player[2]);
	                 md.setTeam(player[3]);
	                boolean b = player[3].contains("バルセロナ");
	                boolean c = player[3].contains("レアル・マドリード");
	                if(b != true && c != true) {
	                	array.add(md);
	                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


//		 ★ 削除後のArrayListの中身を全件出力してください
        for(Player player:array){
            System.out.println(player);
        }

	}
}
