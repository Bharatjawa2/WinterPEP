class Main {
public static void main(String[] args) {
    int[] arr={4,2,6,3,6,1,4,6,4,9,7,6,8};
    int k=5;
    int n=arr.length;
    int sum=0;

    for(int i=0;i<k;i++){
        sum+=arr[i];
    }
    int max=sum;
    for(int i=k;i<n;i++){
        sum-=arr[i-k];
        sum+=arr[i];
        max=Math.max(max,sum);
    }
    System.out.println(max);
  }
}
