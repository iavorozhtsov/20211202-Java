package lesson_04;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    //Map
    public static int mapMinHeight = 3;
    public static int mapMaxHeight = 4;
    public static int mapMinWidth = 3;
    public static int mapMaxWidth = 4;
    public static char[][] map;
    public static char fogOfWar = '·';
    public static char empty = '_';
    public static char ready = '*';
    public static char player = '@';
    public static char trap = 'T';
    public static int mapLevel = 0;
    public static int mapWidth = getRndInt(mapMinWidth, mapMaxWidth);
    public static int mapHeight = getRndInt(mapMinHeight, mapMaxHeight);

    //Player
    public static String playerName = "Ninja";
    public static int playerHP = 100;
    public static int playerMaxHP = 100;
    public static int playerLevelHP = 100;
    public static int playerX;
    public static int playerY;
    public static int playerDirection;
    public static final int playerMoveUp = 8;
    public static final int playerMoveRight = 6;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static char[][] playerMap;


    //Trap
    public static int trapCount;
    public static int trapX;
    public static int trapY;
    public static int trapPower;

    public static void main(String[] args){

        do {
            createMap(mapWidth, mapHeight);
            spawnPlayer();
            spawnTraps();

            System.out.println("Map size is: [" + mapWidth + "x" + mapHeight + "], your HP: " + playerHP +
                                ", level: " + mapLevel + ", trap count: " + trapCount + ", trap power: " + trapPower);
//            showMap(map);
            showMap(playerMap);
            playerTurn();

            System.out.println("Would you like to continue?\n1 - yes, 0 - no, please.");
            if (scn.nextInt() == 0)
                break;

        }while (true);
    }

    private static void playerTurn() {
        int tryX = playerX;
        int tryY = playerY;

        do {
            System.out.print("Make your step (" + playerMoveUp + "- Up, " + playerMoveRight +
                            "- Right, " + playerMoveDown + " - Down, " + playerMoveLeft + " - Left) :");
            playerDirection = scn.nextInt();
            switch (playerDirection){
                case playerMoveDown:
                    tryY = playerY + 1;
                    break;
                case playerMoveLeft:
                    tryX = playerX - 1;
                    break;
                case playerMoveRight:
                    tryX = playerX + 1;
                    break;
                case playerMoveUp:
                    tryY = playerY - 1;
                    break;
                default:
                    System.out.println("Please use only 2, 4, 6 and 8 digit.");

            }
            if (isPossible(tryX, tryY)){
                playerMove(tryX, tryY);
            }else {
                System.out.println("You can not do that. Please, try again.");
                tryX = playerX;
                tryY = playerY;
            }

            if (isDead()){
                System.out.println("Seems like you are died...");
                break;
            }
            if (isWin()){
                playerHP += trapCount * getRndInt(trapPower - 5, trapPower);
                System.out.println("Congratulation! Level is complete!\nYou restore a bit of your HP! Your HP is now: " + playerHP);
                mapLevel++;
                break;
            }
            showMap(playerMap);
        }while (true);
    }

    private static boolean isWin() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == empty || map[y][x] == trap ){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isDead() {
        return playerHP <= 0;
    }

    private static void playerMove(int nextX, int nextY) {
        if (map[nextY][nextX] == trap){
            playerHP -= trapPower;
            System.out.println("Ough! You find the trap and lose " + trapPower + " hp. Your health is " + ((playerHP < 0) ? "above zero" : playerHP) + " now.");
        }

        map[playerY][playerX] = ready;
        map[nextY][nextX] = player;
        playerMap[playerY][playerX] = ready;
        playerMap[nextY][nextX] = player;
        playerX = nextX;
        playerY = nextY;
    }

    private static boolean isPossible(int x, int y) {
        return ((x >= 0 && x < mapWidth) && (y >= 0 && y < mapHeight));
    }

    private static void spawnPlayer() {
        if (isDead()){
            playerHP = playerLevelHP;
        } else {
            playerHP += mapLevel * 10;
            playerLevelHP = playerHP;
        }

        do {
            playerX = rnd.nextInt(mapWidth);
            playerY = rnd.nextInt(mapHeight);
        } while (!isEmpty(playerX, playerY));
        map[playerY][playerX] = player;
        playerMap[playerY][playerX] = player;

        System.out.println("Hello " + playerName + "!\nWelcome to the New World!\nPlease help me to find all traps!");
    }

    private static void spawnTraps() {
        int trapMinPower;
        trapCount = (mapHeight + mapWidth) / 2 + mapLevel;
        trapMinPower = playerHP / (trapCount * 2);
        trapPower = getRndInt(trapMinPower, trapMinPower + 20) + mapLevel * 2;

        if (trapCount > (mapHeight*mapWidth - 1))
            trapCount = mapHeight*mapWidth - 1;

        for (int i = 0; i < trapCount; i++) {
            do {
                trapX = rnd.nextInt(mapWidth);
                trapY = rnd.nextInt(mapHeight);
            } while (!isEmpty(trapX, trapY));
            map[trapY][trapX] = trap;
        }
    }

    public static void showMap(char[][] myMap){

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(myMap[y][x]);
            }
            System.out.println();
        }
    }

    public static void createMap(int mapX, int mapY){

        map = new char[mapY][mapX];
        playerMap  = new char[mapY][mapX];

        for (int y = 0; y < mapY; y++) {
            for (int x = 0; x < mapX; x++) {
                map[y][x] = empty;
                playerMap[y][x] = fogOfWar;
            }
        }
    }

    public static boolean isEmpty(int x, int y){
        return (map[y][x] == empty);
    }

    public static int getRndInt(int min, int max){
        return min + rnd.nextInt(max - min + 1);
    }
}