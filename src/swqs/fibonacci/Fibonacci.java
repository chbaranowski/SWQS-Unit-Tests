package swqs.fibonacci;

public class Fibonacci {
	
	private CachingService cachingService;
	
	public void setCachingService(CachingService cachingService) {
		this.cachingService = cachingService;
	}

	public long fib(long n) {
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
        	return fib;
        }
    }

}
