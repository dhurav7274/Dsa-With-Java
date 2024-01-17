public class LinearSerach{
    int[] arrayInput;
    int length;
    public static void main(String[] args) {
        int[] array={58,68,8,3,79,83,96};
        int searchingElement=83;
        LinearSerach ls=new LinearSerach();
        ls.linearSerch(array,83);
    }

    public void linearSerch(int[] array,int searchingElement){
        this.arrayInput=array;
        this.length=arrayInput.length;

        for(int i=0; i<length; i++){
            if(this.arrayInput[i]==searchingElement){
                System.out.println("Element is find on index numbner:-"+ i);
                break;
            }

        }
    }

}