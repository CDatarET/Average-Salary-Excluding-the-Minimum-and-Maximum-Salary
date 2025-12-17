public class Solution {
    public double Average(int[] salary) {
        if(salary.Length <= 2){
            return(0);
        }

        int max = int.MinValue;
        int min = int.MaxValue;
        int sum = 0;

        for(int i = 0; i < salary.Length; i++){
            max = Math.Max(max, salary[i]);
            min = Math.Min(min, salary[i]);
            sum = sum + salary[i];
        }

        double ret = (sum - max - min) / (double)(salary.Length - 2);
        if(ret <= 0) return 0.0;
        else return ret;
    }
}
