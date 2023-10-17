/*Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
  Ex:
nput:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are theelements which comes in the union set  */

lass Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int counter=0,answer=n;
        
        for(int i=0;i<m;i++){       
            counter = 0;
            for(int j=0;j<n;j++){
                if(a[j]!=b[i]){
                    counter++;
                }
            }
            if(counter==n){
                answer++;
            }
        }
        return answer;
    }
      
}
