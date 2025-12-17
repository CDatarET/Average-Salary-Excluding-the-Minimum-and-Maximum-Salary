class Solution {
    public double average(int[] salary) {
        if(salary.length <= 2){
            return(0);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < salary.length; i++){
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum = sum + salary[i];
        }

        double ret = (sum - max - min) / (double)(salary.length - 2);
        if(ret <= 0) return 0.0;
        else return ret;
    }
}
