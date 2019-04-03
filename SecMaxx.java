
public class SecMaxx{
public static void main(String[] args)
{




    int max = 0, temp = 0, secondMax = 0, number = 0;

    number = 1239;
    while (number != 0)
    {
        temp = number % 10;

        if (max == 0)
        {

            max = temp;
            secondMax = temp;

        }
        else if (temp > max)
        {
            int lastmax = max;

            max = temp;

            if (lastmax > secondMax)
            {
                secondMax = lastmax;
            }


        }

        if ((temp > secondMax && temp < max) || secondMax >= max)
        {
            secondMax = temp;
        }

        number = number / 10;
    }

    int Result = secondMax;
    System.out.println(max);

    System.out.println(Result);
    
}

}