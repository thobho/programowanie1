package com.sdacademy.day4.twokings;

import java.util.Objects;

public class TwoKings {

    public int possibilities(int n) {
        return 0;
    }

    private static class King {
        private int a;
        private int b;

        public King(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int numOfLegalSquares(King king, int n) {
            if (king.a == 0 && king.b == n) {
                return n * n - 3;
            }
            //tutaj wszyskie możliwości
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            King king = (King) o;
            return a == king.a &&
                    b == king.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
