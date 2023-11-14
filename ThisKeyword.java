public class ThisKeyword {
    //int i = 20;
    int i;
    //void setValue(){
    void setValue(int i){
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        ThisKeyword tk = new ThisKeyword();
        //tk.setValue();
        tk.setValue(10);
        tk.show();
    }
}
