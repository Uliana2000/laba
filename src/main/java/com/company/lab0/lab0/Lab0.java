package com.company.lab0.lab0;

public class Lab0 {

    public static class Pair {
        int first;
        double second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first &&
                    pair.second-second <= 0.00000001;
        }

        public Pair () { }
        public Pair(int first, double second) {
            this.first = first;
            this.second = second;
        }

    }
    /**
     * Дано три параметра А, В, С. Якщо їх значення впорядковані по зростанню, то подвоїти їх. Упротележному випадку
     * замінити кожне значення на протилежне. Вивести нові значення А, В, С.
     */
    /*??????*/
    }

    /**
     * CASE. Дано ціле число в діапазоні 20 - 69 визначальне вік (в роках). Вивести рядок-опис зазначеного віку.
     */
    /*????*/
    public String switchTack (int number) {
        assert number >= 20 && number <= 69;
        int decade = number / 10;
        int year = number - decade *10;
        String decStr;
        switch (decade) {
            case 2:
                decStr = "двадцять ";
                break;
            case 3:
                decStr = "тридцять ";
                break;
            case 4:
                decStr = "сорок" ;
                break;
            case 5:
                decStr = "п'ятдесят ";
                break;
            default:
                decStr = "шістдесят ";
        }
        switch (year) {
            case 1:
                return decStr + "один рік";
            case 2:
                return decStr + "два роки";
            case  3:
                return decStr + "три роки";
            case 4:
                return decStr + "чотири роки";
            case 5:
                return decStr + "п'ять років";
            case 6:
                return  decStr + "шість років";
            case 7:
                return decStr + "сім років";
            case 8:
                return decStr + "вісім років";
            case 9:
                return decStr + "дев'ять років";
            default:
                return decStr + "років";
        }
    }

    /**
     * Дано ціле позитивне число. Перевірити істинність висловлювання: "Дане число є парним двозначним"
     */
    public boolean booleanTask (int a){
        assert a >=10 && a<=99;
        return a%2 == 0;

    }
    /**
     * for. given a real number A and an integer N(>0). Using one cycle to withdraw all integer powers of A from 1 to N.
     */
    public double[] forTask(double a, int n) {
        assert (n > 0) : "The power must be greater than 0.";
        double[] result = new double[n];
        double exp = 1;
        for (int i = 1; i <= n; ++i) {
            exp*=a;
            result[i-1] = exp;
        }

        return result;
    }
    /**
     * while
     */
    public Pair whileTask(double p) {
        assert (p > 0 && p < 50);

        final double START_VALUE = 10;
        final double FINAL_VALUE = 200;

        int daysCount = 1;
        double previousDay = START_VALUE;
        double sum = START_VALUE;

        while (sum <= FINAL_VALUE) {
            previousDay *= 1+ p/100;
            sum+=previousDay;
            daysCount++;
        }

        return new Pair(daysCount, sum);
    }
}
