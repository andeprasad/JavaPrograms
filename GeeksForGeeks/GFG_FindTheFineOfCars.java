/*
 * Input: date = 12, car[] = [2375, 7682, 2325, 2352], fine[] = [250, 500, 350, 200]
 * Output: 600
 * Explanation: The date is 12 (even), so we collect the fine from odd-numbered cars. 
 * The odd-numbered cars and the fines associated with them are as follows:
 * 2375 -> 250
 * 2325 -> 350
 * The sum of the fines is 250+350 = 600
 */
public class GFG_FindTheFineOfCars {
    public static void main(String[] args) {
        // int date = 12, car[] = {2375, 7682, 2325, 2352}, fine[] = {250, 500, 350, 200};
        int date = 8, car[] = {2222, 2223, 2224}, fine[] = {200, 300, 400};
        System.out.println("The Total fine of cars is : " + totalFine(date, car, fine));
    }
    static public long totalFine(int date, int car[], int fine[]) {
        int sum = 0;
        if(date % 2 == 0)
        {
            for (int i = 0; i < car.length; i++) 
            {
                if(car[i] % 2 != 0)
                {
                    sum+=fine[i];
                }   
            }
        }
        else
        {
            for (int i = 0; i < car.length; i++) 
            {
                if(car[i] % 2 == 0)
                {
                    sum+=fine[i];
                }   
            }
        }
        return sum;
    }
}
