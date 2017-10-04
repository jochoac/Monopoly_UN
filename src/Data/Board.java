/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import Data.PropertyCard;
/**
 *
 * @author Juan Ochoa
 */
public class Board {
    private static Square[][] gameBoard;
    private ArrayList<PropertyCard> propertys = new ArrayList<>();
    private ArrayList<LuckyCard> luckyCards = new ArrayList<>();
    
    public Board() {
        PropertyCard bogota = new PropertyCard(3500,"Bogotá");
        PropertyCard cartagena = new PropertyCard(3400,"Cartagena");
        PropertyCard tayrona = new PropertyCard(3300,"Parque Tayrona");
        PropertyCard medellin = new PropertyCard(3200,"Medellin");
        PropertyCard santaMarta = new PropertyCard(3100,"Santa Marta");
        PropertyCard sanAndres = new PropertyCard(3000,"San Andres");
        PropertyCard cali = new PropertyCard(2999,"Cali");
        PropertyCard guatape = new PropertyCard(678,"Guatape");
        PropertyCard barranquilla = new PropertyCard(2800,"Barranquilla");
        PropertyCard salento = new PropertyCard(456,"Salento");
        PropertyCard villaLeyva = new PropertyCard(2600,"villaLeyva");
        PropertyCard taganga = new PropertyCard(2500,"Taganga");
        PropertyCard popayan = new PropertyCard(2400,"Popayan");
        PropertyCard manizales = new PropertyCard(2300,"Manizales");
        PropertyCard sanAgustin = new PropertyCard(2200,"San Agustin");
        PropertyCard chicamocha = new PropertyCard(2100,"Chicamocha");
        PropertyCard pereira = new PropertyCard(2000,"Pereira");
        PropertyCard bucaramanga = new PropertyCard(1900,"Bucaramanga");
        PropertyCard sanGil = new PropertyCard(300,"San Gil");
        PropertyCard leticia = new PropertyCard(1700,"Leticia");
        PropertyCard armenia = new PropertyCard(1200,"Armenia");
        PropertyCard chiquinquira = new PropertyCard(1555,"Chiquinquira");
        PropertyCard zipaquira = new PropertyCard(1454,"Zipaquira");
        PropertyCard barichara = new PropertyCard(1373,"Barichara");
        PropertyCard losNevados = new PropertyCard(744,"Los Nevados");
        PropertyCard pasto = new PropertyCard(1023,"Pasto");
        PropertyCard rioHacha = new PropertyCard(567,"Rio Hacha");
        PropertyCard ipiales = new PropertyCard(345,"Ipiales");
        
        LuckyCard jail = new LuckyCard("Exit to Jail", 0, 0, "Exit to Jail");
        LuckyCard bonus100 = new LuckyCard("Received 100 dollars", 0, 100, "Bonus + $100");
        LuckyCard penalty150 = new LuckyCard("You lose 150 dollars", 150, 0, "Penalty - $150");
        LuckyCard returnDice = new LuckyCard("Returns to roll the die", 150, 0, "Roll the die");
        
        
        propertys.add(bogota);
        propertys.add(cartagena);
        propertys.add(tayrona);
        propertys.add(medellin);
        propertys.add(santaMarta);
        propertys.add(sanAndres);
        propertys.add(cali);
        propertys.add(guatape);
        propertys.add(barranquilla);
        propertys.add(salento);
        propertys.add(villaLeyva);
        propertys.add(taganga);
        propertys.add(popayan);
        propertys.add(manizales);
        propertys.add(sanAgustin);
        propertys.add(chicamocha);
        propertys.add(pereira);
        propertys.add(bucaramanga);
        propertys.add(sanGil);
        propertys.add(leticia);
        propertys.add(armenia);
        propertys.add(chiquinquira);
        propertys.add(zipaquira);
        propertys.add(barichara);
        propertys.add(losNevados);
        propertys.add(pasto);
        propertys.add(rioHacha);
        propertys.add(sanGil);
        propertys.add(ipiales);
        
        luckyCards.add(jail);
        luckyCards.add(bonus100);
        luckyCards.add(penalty150);
        
        
        
        //probar push
        int value = 0;
        gameBoard = new Square[11][11];
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard.length; col++) {
                PropertySquare square = new PropertySquare(row, col, "");
                gameBoard[row][col] = square;
            }
        }
    }

    public static Square[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(Square[][] gameBoard) {
        Board.gameBoard = gameBoard;
    }
    
    public String printBoard(String player, int r, int c) 
    {
        String printBoard = "\n";

        for (int row = 0; row < 11; row++) {
            printBoard = printBoard.concat("\t|");
            for (int col = 0; col < 11; col++) {
                
                if(row==r && col==c)
                {
                    printBoard = printBoard.concat("|"+player+"|");
                }
                else if(row==0&&col==0)
                {
                    printBoard = printBoard.concat("|   GO   |");
                }
                else if(row==0&&col==10)
                {
                    printBoard = printBoard.concat("   JAIL  |");
                }
                else if(row==10&&col==0)
                {
                    printBoard = printBoard.concat("|GO TO JAIL|");
                }
                else if(row==10&&col==10)
                {
                    printBoard = printBoard.concat("FREE STOP|");
                }
                else if((row==0||row==10))
                {
                    printBoard = printBoard.concat(
                        gameBoard[row][col].getName().concat("|"));
                }
                else if((col==0||col==10))
                {
                    printBoard = printBoard.concat("|".concat(
                        gameBoard[row][col].getName().concat("|")));
                }
                else
                {
                    printBoard = printBoard.concat("         ");
                }
                
            }
            printBoard = printBoard.concat("\n");
        }
        return printBoard;
    }
}
