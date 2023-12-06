import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

class Tictactoe1player{
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosistions = new ArrayList<Integer>();
	
	public static void main(String[] args){
		
		
		
		char gameBoard[][] = {
			{' ' , '|' , ' ' , '|' , ' '},
			{'-' , '+' , '-' , '+' , '-'},
			{' ' , '|' , ' ' , '|' , ' '},	
			{'-' , '+' , '-' , '+' , '-'},
			{' ' , '|' , ' ' , '|' , ' '}
		};
		
		printBoard(gameBoard);
		
		System.out.println();
		
		while(true){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your placement (1-9): ");
		int playerPos = input.nextInt();
		while(playerPositions.contains(playerPos) || cpuPosistions.contains(playerPos)){
			System.out.println("Position taken, choose again");
			playerPos = input.nextInt();

			
		}
		
		System.out.println();
		
		piecePos(gameBoard,playerPos,"player");
		
			String win = checkWinner();
		if (win.length()>0){
			System.out.println(win);
			break;
		}
		
		Random rad = new Random();
		int cpuPos = rad.nextInt(9) + 1;
		while(playerPositions.contains(cpuPos) || cpuPosistions.contains(cpuPos)){
			cpuPos = rad.nextInt(9) + 1;
		}
		piecePos(gameBoard,cpuPos,"cpu");
		
		printBoard(gameBoard);
		
		win = checkWinner();
		if (win.length()>0){
			System.out.println(win);
			break;
		}
		
		}
		
	}
	
	static void printBoard(char board[][]){
		for (char row[] : board){	
			for(char col:row){
			System.out.print(col);
			}
			System.out.println();
		}
	}
	
	static void piecePos(char [][] gameBoard,int pos, String user){
		char symbol = ' ';
		
		if (user.equals("player")){
			symbol = 'X';
			playerPositions.add(pos);
		}else if (user.equals("cpu")){
			symbol = 'O';
			cpuPosistions.add(pos);
		}
		
		
		switch(pos){
			case 1:
			gameBoard[0][0] = symbol;
			break;
		    case 2:
			gameBoard[0][2] = symbol;
			break;
			case 3:
			gameBoard[0][4] = symbol;
			break;
			case 4:
			gameBoard[2][0] = symbol;
			break;
			case 5:
			gameBoard[2][2] = symbol;
			break;
			case 6:
			gameBoard[2][4] = symbol;
			break;
			case 7:
			gameBoard[4][0] = symbol;
			break;
			case 8:
			gameBoard[4][2] = symbol;
			break;
			case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
		}
	}
	
	static String checkWinner(){
		
		List trow = Arrays.asList(1,2,3);
		List mrow = Arrays.asList(4,5,6);
		List brow = Arrays.asList(7,8,9);
		List lCol = Arrays.asList(1,4,7);
		List mCol = Arrays.asList(2,5,8);
		List rCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(3,5,7);
		
		List<List> winner = new ArrayList<List>();
		winner.add(trow);
		winner.add(mrow);
		winner.add(brow);
		winner.add(lCol);
		winner.add(mCol);
		winner.add(rCol);
		winner.add(cross1);
		winner.add(cross2);
		
		for (List l:winner){
			if (playerPositions.containsAll(l)){
				return "Congratulations you won!!!";
			}else if (cpuPosistions.containsAll(l)){
				return "CPU on, you lost :(";
			}else if (playerPositions.size() + cpuPosistions.size() == 9){
				return "Draw ^_^";
			}
		}
		
		return "";
		
		
	}
	
}