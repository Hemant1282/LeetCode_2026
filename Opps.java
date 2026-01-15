public class Opps {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("orange");
    }
};

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    public void setTip(int newTip){
        tip = newTip;
    }
}
