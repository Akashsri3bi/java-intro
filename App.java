package com.akash;

//MAIN CLASS..

public class App{


	public static void main(String[] args) {

            Game game = new Game("Tile Game" , 400 , 400);
            game.start();
            game.init();
            game.run();            //we need to call it separetly for me because the thread is not working!!

      }
}