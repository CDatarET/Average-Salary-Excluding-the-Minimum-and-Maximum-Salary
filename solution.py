class Solution:
    def average(self, salary):
        if len(salary) <= 2: return 0

        high = salary[0]
        low = salary[0]
        total = 0
        for n in salary:
            high = max(high, n)
            low = min(low, n)
            total += n
        
        avg = (total - high - low) / (len(salary) - 2)
        if avg <= 0: return 0.0
        else: return avg
