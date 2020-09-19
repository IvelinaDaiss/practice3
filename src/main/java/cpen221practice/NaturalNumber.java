package cpen221practice;

class NaturalNumber {
    //check if the number i
    // s the natural number and calculate the aliquot sum
    private int num;//this is the input number

    public NaturalNumber(int number) {
        num = number;
    }

    public int getAquilotSum() {

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + num;
            }
        }
    }
    public enum getClassification() {
        if(sum == num)
        {
            return Classification.PERFECT;
        } else if(sum < num)
        {
            return Classification.DEFICIENT;
        } else
        {
            return Classification.ABUNDANT;
        }
    }
}

