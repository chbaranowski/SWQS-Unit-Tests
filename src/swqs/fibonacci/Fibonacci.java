package swqs.fibonacci;

public class Fibonacci {
	
	private CachingService cachingService;
	
	public long fib(int n) {
		long fib = cachingService.getFib(n);
		if(fib > 0){
			return fib;
		}
        if (n <= 1){ 
        	cachingService.addFib(n);
        	return n;
        }
        else { 
        	fib = fib(n-1) + fib(n-2);
        	cachingService.addFib(fib);
        	return fib(n-1) + fib(n-2);
        }
    }

}
