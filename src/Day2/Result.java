package Day2;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double total;
        double tip;
        double tax;

        tip = meal_cost / 100 * tip_percent;
        tax = (double) tax_percent / 100 * meal_cost;
        total = meal_cost + tip + tax;

        System.out.println(Math.round(total));

    }

}