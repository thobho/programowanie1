package com.sdacademy.day1;

/*
Proszę napisać metodę, która wyświetli na konsoli "przepis" jak rozwiązać problem wież Hanoi.
Problem będzie omawiany na zajęciach.
https://www.mathsisfun.com/games/towerofhanoi.html
 */
public class Exercise6 {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

        if (n == 1) {
            System.out.println("Przenieś 1 krążek z "+from_rod+ " na "+to_rod);
        }

        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);

    }

    //  Driver method
    public static void main(String args[]) {
        int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods
    }
}
