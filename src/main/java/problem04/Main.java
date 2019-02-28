package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random random = new Random(); 
		Scanner key = new Scanner(System.in); 
		
		int x = random.nextInt(10-3);
		int y = random.nextInt(10-1);
		
		
		for(x=1; x<=9; x++){
			for(y=2; y<=9; y++){
				System.out.print(y+"x"+x+"="+x*y+"\t");
			}System.out.println();
		}



// 
//        int x; 
//        int y; 
//        boolean flag = true; 
//        int i; 
//        int calculate; 
// 
//        String input; 
// 
//        do 
//        { 
//            int count = 0; 
//            int correct = 0; 
//            for (i = 1; i <= 18; i++){ 
//            	for (int j = 0; j < 2; j++) {
//            		x = random.nextInt(9); 
//            		y = random.nextInt(9); 
//            		
//            		System.out.print(x + " * " + y + " : "); 
//            		calculate = key.nextInt(); 
//            		
//            		if(calculate == (x*y)) 
//            			correct++; 
//            		
//            		count++;
//            		x++;
//            		y++;
//            	} 
//					
//				}
//            System.out.println("총 " + count + "문제 중 " + correct + "문제를 맞혔습니다."); 
//            System.out.println("계속 하시겠습니까? y/n :"); 
// 
//            input = key.next(); 
//            if(input.equals("n")||input.equals("N")) 
//                flag = false;
//        }while(flag);

	}
}