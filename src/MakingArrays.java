public class MakingArrays {
   public int[] nums;
   public double total;

    public static void main(String[] args) {

        MakingArrays make = new MakingArrays();



    }


    public MakingArrays(){

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

        printArray();
    }

    public void printArray(){
        nums = new int [33];
        for(int x=0;x<nums.length;x=x+1){
            System.out.println(nums[x] = (int)(100*Math.random()));
        }

        for(int x=0;x<nums.length;x=x+1) {
            total=total+nums[x];
        }

        System.out.println("this is the total" +total);

        }



        }


