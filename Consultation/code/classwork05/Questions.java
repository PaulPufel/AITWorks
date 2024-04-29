package classwork05;

public class Questions {
    public static void main(String[] args) {
        boolean isVIPPlace = true; // это флаг вип-места
    }
}

/*
изначально [x=5,y=x-- + 1]
read x [x=5,y=5 + 1]
decrement x [x=4,y=5 + 1]
sum 5 1 [x=4,y=6]

------------

изначально [x=5,y=--x + 1]
decrement x [x=4,y=x + 1]
read x [x=4,y=4 + 1]
sum 5 1 [x=4,y=5]

-----------

изначально [x=5,y=x-- + --x]
read x [x=5,y=5 + --x]
decrement x [x=4,y=5 + --x]
decrement x [x=3,y=5 + --x]
read x [x=3,y=5 + 3]
sum 5 3 [x=4,y=8]

* */

/*

первый год:         to 40k/year
после 1 года:       from 40k/year to 65k/year
после 2-4 года:     from 65k/year to 85k/year
после 3-4 лет:      from 85k/year to 100k/year
после 3-4 лет:      from 100k/year

*/
