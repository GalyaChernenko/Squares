package ru.netology.qa52.Squares;

public class SQRService {


    public int calcSqr(int numMin, int numMax) {

        int digitCount = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= numMin && i * i <= numMax) {
                digitCount++;
            }

        }
        return digitCount;

    }
}
