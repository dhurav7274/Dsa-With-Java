public class MargeShort {
    int[] aaray;
    int[] temMergeArr;
    int lenght;
    public static void main(String[] args) {
        int[] arry ={23,45,6,7,23,24,45};
        System.out.print("Befor sorting array is :- ");
        for (int i : arry) {
            System.out.print(i + " ");
        }

        System.out.println(' ');
        MargeShort ms=new MargeShort();
        ms.sort(arry);

        System.out.print("after sorting array is :- ");
        for (int i : arry) {
            System.out.print(i + " ");
        }
    }

    public void sort(int inputArr[]){
        this.aaray=inputArr;
        this.lenght=inputArr.length;
        this.temMergeArr=new int[lenght];
        divideArray(0, lenght-1);
    }

    public void divideArray(int lowerIndex , int higherIndex){
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            // it will sort the left side of an array 
            divideArray(lowerIndex, middle);

            // it will sort the right sight of aaray
            divideArray(middle+1, higherIndex);

            margeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void margeArray(int lowerIndex,int middle ,int higherIndex){
         for(int i=lowerIndex; i<=higherIndex; i++){
            temMergeArr[i]=aaray[i];
         }
         int i=lowerIndex;
         int j=middle+1;
         int k=lowerIndex;

         while (i<=middle && j<=higherIndex) {
            if(temMergeArr[i]<=temMergeArr[j]){
                aaray[k]=temMergeArr[i];
                i++;
            }else{
                aaray[k]=temMergeArr[j];
                j++;
            }
            k++;
         } 

         while (i<=middle) {
            aaray[k]=temMergeArr[i];
            k++;
            i++;
            
         }
    }
}