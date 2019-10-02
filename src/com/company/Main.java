package com.company;

public class Main {
   private double starTime;
   private double endTime;
   public Main()
   {
   }
   public Main(double starTime, double endTime)
   {
       this.starTime=starTime;
       this.endTime=endTime;
   }
    public double getStarTime() {
        return starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        this.starTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
       return this.endTime- this.starTime;
    }

    public static void main(String[] args) {
        int[] array=new int[10000];
        for(int i=0;i<10000;i++){
            array[i]=(int) (Math.random()*100)+1;
        }
        System.out.print("Array: ");
        for(int i=0;i<10000;i++){
            System.out.print(" "+array[i]);
        }
        Main t=new Main();
        t.start();
        System.out.print("\n Start time: "+ t.getStarTime());
        for (int i=0;i<10000;i++){
            for(int j=i+1;j<10000;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        t.stop();
        System.out.print("End time: "+ t.getEndTime());
        System.out.print("\n Ordered array: ");
        for(int e:array){
            System.out.print(e+" ");
        }
        System.out.print("\n ElapsedTime: "+t.getElapsedTime()+" ms");
    }
}
