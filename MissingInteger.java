
public class MissingInteger {
        public int solution(int[] A) {
            int n = A.length+1;
            int _total = n*(n+1)/2;
            for(int x=0;x<A.length;x++){
                _total = _total - A[x];
            }
            System.out.println(_total);
          return _total;
        }
}
