public class House {
    private int numStories;
    private int numWindows;
    private String color;

    public House(){

    }
    public House(int numWindows,int numStories,String color){
        this.numWindows=numWindows;
        this.numStories=numStories;
        this.color=color;
    }

    public int getNumStories(){
        return  numStories;
    }
    public void setNumStories(int numStories){
        this.numStories=numStories;
    }
    public int getNumWindows(){
        return numWindows;
    }
    public void setNumWindows(int numWindows){
        this.numWindows=numWindows;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}
