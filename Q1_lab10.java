class Main{
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        try{
            System.out.println(array[array.length+ 1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            for(int i=0;i<array.length;i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}