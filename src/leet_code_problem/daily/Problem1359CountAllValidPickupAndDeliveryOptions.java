package leet_code_problem.daily;

public class Problem1359CountAllValidPickupAndDeliveryOptions {

    public int countOrders(int n) {
        double ans = 1;
        double value = Math.pow(10, 9) + 7;
        for(int i=2*n; i>0; i--){
            ans = (ans%value) * i;
        }

        return (int) ((ans/Math.pow(2,n))%value);
    }
}
