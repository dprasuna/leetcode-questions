class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
		int prev = 0,  next = 0, curr = 1;
		for (int i = 1; i < n; i++) {
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		return curr;     
    }
}