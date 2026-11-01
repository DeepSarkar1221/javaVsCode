public class ArrayLearn {
    
    public static void main(String[] args) {


        //Normal Array
        int nums[][]=new int[3][4];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
        }
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println("\n");
        }


        System.out.println("Jagged array");
        //Jagged Array 
        int num[][]= new int[4][];
        num[0]=new int[3];
        num[1]=new int[2];
        num[2]=new int[3];
        num[3]=new int[6];

        for (int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*100);
            }
        }
        for(int n[]:num){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println("\n");
        }
        
        
        

    }
}
