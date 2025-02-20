public class MakingArrays {
    int[] nums = new int [11];
    public static void main(String[] args) {

        MakingArrays make = new MakingArrays();



    }


    public MakingArrays(){
        System.out.println("welcome to array world");
        nums[1]=5;
        nums[0]=10;
        nums[2]=nums[0]*3;
        nums[3]= nums[1]*nums[2];
        nums[4] = 11;
        nums[5]= 16;
        nums[6]=0;
        nums[7]=nums[4]*3;
        nums[8]= nums[6];
        nums[9]=8 ;
        nums[10]= 3;
        printArray();
    }

    public void printArray(){
        System.out.println(nums[1]);
        System.out.println(nums[0]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[7]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);
        System.out.println(nums[10]);
    }

}
