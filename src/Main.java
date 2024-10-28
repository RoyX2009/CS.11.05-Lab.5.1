import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int sum = 0;
        for(int i: totalWasteKgPerCapitaPerYear) sum +=i;
        return (int) Math.round((sum/totalWasteKgPerCapitaPerYear.length)+0.5);
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesKgPerCapitaPerYear){sum += i;}
        return (int) Math.round(sum * 1.0 / retailEstimatesKgPerCapitaPerYear.length);
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesTonnesPerYear){
            sum += i;
        }
        return (int) Math.round(sum*1.0/retailEstimatesTonnesPerYear.length);
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int result = 0;
        for(int food : foodServiceEstimatesTonnesPerYear) {
            result += food;
        }
        return result/foodServiceEstimatesTonnesPerYear.length+1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int result = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        if(totalWasteKgPerCapitaPerYear.length%2==1){
            result = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
        }
        else if(totalWasteKgPerCapitaPerYear.length%2==0){
            int num1 = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
            int num2 = totalWasteKgPerCapitaPerYear[(totalWasteKgPerCapitaPerYear.length/2) + 1];
            result = (num1 + num2) / 2;
        }
        return result;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int median = 0;
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int middleNum = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length / 2];
        if (householdEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            int afterMiddle = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length / 2 + 1];
            median = (middleNum + afterMiddle) / 2;
        } else {
            median = middleNum;
        }
        return median;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int length =
                householdEstimatesTonnesPerYear.length;
        int median;
        if (length % 2 == 0) {
            median = (householdEstimatesTonnesPerYear[length / 2 - 1]) + (householdEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            median = householdEstimatesTonnesPerYear[length / 2];
        }
        return median;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int median;
        if (retailEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            median = (retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length/2)] + retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length/2)-1]) / 2;
        }
        else {
            median = retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length)/2];
        }
        return median;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int length = retailEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (retailEstimatesTonnesPerYear[length / 2 - 1] + retailEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = retailEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int min = retailEstimatesKgPerCapitaPerYear[0];
        for (int i = 1; i < retailEstimatesKgPerCapitaPerYear.length; i++) {
            if (retailEstimatesKgPerCapitaPerYear[i] < min) {
                min = retailEstimatesKgPerCapitaPerYear[i];
            }
        }
        return min;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear){


        int min = retailEstimatesTonnesPerYear[0];
        for (int i : retailEstimatesTonnesPerYear){

            if ( i < min){
                min = i;
            }


        }
        return min;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

        /**
         * Max Methods
         */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[]foodServiceEstimatesKgPerCapitaPerYear){
        int biggest = 0;
        for (int i = 0; i < foodServiceEstimatesKgPerCapitaPerYear.length; i++) {
            if (biggest < foodServiceEstimatesKgPerCapitaPerYear[i]) {
                biggest = foodServiceEstimatesKgPerCapitaPerYear[i];
            }
        }
        return biggest;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int c = 0;
        for(int i = 0; i<countries.length; i++){
            if (countries[i].equals(country)){
                c = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[c];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int large = 0;
        for(int i = 0; i<totalWasteKgPerCapitaPerYear.length; i++){
            if (totalWasteKgPerCapitaPerYear[large]<totalWasteKgPerCapitaPerYear[i]){
                large = i;
            }

        }
        return countries[large];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double greatestPercent = getMaxPercent(percentagesShareInPoverty);

        int count = 0;
        for (double j: percentagesShareInPoverty){
            if(j == greatestPercent){
                count++;
            }
        }

        String[] countriesWithHighestPovertyPercentage = new String[count];
        int index = 0;
        for(int i=0; i<percentagesShareInPoverty.length; i++){
            if(percentagesShareInPoverty[i] == greatestPercent){
                countriesWithHighestPovertyPercentage[index] = countries[i];
                index++;
            }
        }
        return countriesWithHighestPovertyPercentage;
    }

    public static double getMaxPercent(double[] percentagesShareInPoverty){
        double greatestPercent = percentagesShareInPoverty[0];
        for(double v: percentagesShareInPoverty){
            if(greatestPercent < v){
                greatestPercent = v;
            }
        }
        return greatestPercent;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        ArrayList<String> highestCountries = new ArrayList<String>();
        for (int i=0; i<confidences.length; i++){
            if(confidences[i].equals("High Confidence")){
                highestCountries.add(countries[i]);
            }
        }
        String[] greatest = highestCountries.toArray(new String[highestCountries.size()]);
        return greatest;
    }
}
