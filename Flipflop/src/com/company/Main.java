package com.company;

public class Main {

    public static void main(String[] args) {
	for( int i=1;i<100;i++){
	    if(i%15==0){
            System.out.println("Flipflop");
        }
	    else if(i%3==0){
            System.out.println("Flip");
        }
	    else if(i%5==0){
            System.out.println("Flop");
        }
	    else System.out.println(i);
    }
        System.out.println("régi verzió");
        for( int i=1;i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Flipflop");
            }
            if(i%3==0 && i%5!=0){
                System.out.println("Flip");
            }
            if(i%3!=0 && i%5==0){
                System.out.println("Flop");
            }
            else System.out.println(i);
        }

    }
}
