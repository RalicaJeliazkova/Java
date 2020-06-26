package com.company;

public class Test {

    public static void main(String[] args) {
       /* MonetaryCoin mc1 = new MonetaryCoin(25);
        MonetaryCoin mc2 = new MonetaryCoin(13);
        MonetaryCoin mc3 = new MonetaryCoin(33);
        MonetaryCoin[] test = new MonetaryCoin[2];
        test[0] = mc2;
        test[1] = mc3;
        int total = mc1.add(test);
        int value = mc2.getValue();
        System.out.println("total: " + total + " values: " + value);


        int tailCount = 0, headCount = 0;
        for(int i=0; i<25; i++){
            MonetaryCoin myCoin = new MonetaryCoin(13);
            myCoin.flip();
            System.out.println(myCoin.toString());
            if(myCoin.isHeads())
                headCount++;
            else
                tailCount++;
        }

        System.out.println ("The number flips: " + 13);
        System.out.println ("The number of heads: " + headCount);
        System.out.println ("The number of tails: " + tailCount);

    }*/

        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;

        MonetaryCoin money1, money2, money3;

        money1 = new MonetaryCoin();
        money1.setValue(0.25);

        money2 = new MonetaryCoin();
        money2.setValue(0.50);

        money3 = new MonetaryCoin();
        money3.setValue(1.00);

        System.out.println("The value of the second object is: " + money1.getValue());
        System.out.println("The value of the second object is: " + money2.getValue());
        System.out.println("The value of the third object is: " + money3.getValue());

        System.out.println();

        System.out.println ("The summation of the 3 objects is: " +
                (money1.getValue() + money2.getValue() + money3.getValue()));

        MonetaryCoin myCoin = new MonetaryCoin(); // instantiate the Coin object

        for (int count=1; count <= NUM_FLIPS; count++)
        {
            myCoin.flip();

            if (myCoin.isHeads())
                heads++;
            else
                tails++;
        }

        System.out.println ("The number flips: " + NUM_FLIPS);
        System.out.println ("The number of heads: " + heads);
        System.out.println ("The number of tails: " + tails);
    }
}
