public class Tjp {
    public static void main(String[] args) {
        int []arr={1,-2,-6,4,7,8,9};
        int n=arr.length;
        for( int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for ( int k=j+1; k<n; k++){
                    if( arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Multiply"+" "+arr[i]+" " + arr[j]+ " "+arr[k]);
                    }
                }
            }
        }
    }
}
