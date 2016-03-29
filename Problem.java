/**
 * Created by Magnus on 3/29/2016.
 */
public class Problem {

    public static void main(String[] args) {
        int waysToWin = 0;

        for (int a1 = 0; a1 < 10; a1++) {
            for (int a2 = 0; a2 < 10; a2++) {
                if (a2 == a1) continue;
                for (int a3 = 0; a3 < 10; a3++) {
                    if (a3 == a1 || a3 == a2) continue;
                    for (int a4 = 0; a4 < 10; a4++) {
                        if (a4 == a1 || a4 == a2 || a4 == a3) continue;
                        for (int a5 = 0; a5 < 10; a5++) {
                            if (a5 == a1 || a5 == a2 || a5 == a3 || a5 == a4) continue;
                            for (int a6 = 0; a6 < 10; a6++) {
                                if (a6 == a1 || a6 == a2 || a6 == a3 || a6 == a4 || a6 == a5) continue;
                                for (int a7 = 0; a7 < 10; a7++) {
                                    if (a7 == a1 || a7 == a2 || a7 == a3 || a7 == a4 || a7 == a5 || a7 == a6) continue;
                                    for (int a8 = 0; a8 < 10; a8++) {
                                        if (a8 == a1 || a8 == a2 || a8 == a3 || a8 == a4 || a8 == a5 || a8 == a6 || a8 == a7) continue;
                                        for (int a9 = 0; a9 < 10; a9++) {
                                            if (a9 == a1 || a9 == a2 || a9 == a3 || a9 == a4 || a9 == a5 || a9 == a6 || a9 == a7 || a9 == a8) continue;
                                            for (int a10 = 0; a10 < 10; a10++) {
                                                if (a10 == a1 || a10 == a2 || a10 == a3 || a10 == a4 || a10 == a5 || a10 == a6 || a10 == a7 || a10 == a8 || a10 == a9) continue;

                                                double totalValue = (a1 * 100 + a2 * 10 + a3) * (a4 * 10 + a5) - (a6 * 100 + a7 * 10 + a8) * (a9 * 10 + a10);
                                                if (totalValue == 0) {
                                                    waysToWin++;
                                                    System.out.println("" + a1 + a2 + a3 + "*" + a4 + a5 + " - " + a6 + a7 + a8 + "*" + a9 + a10);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("There are " + waysToWin + " ways to solve this problem!");
    }

}
