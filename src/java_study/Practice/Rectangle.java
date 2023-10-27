/*
package java_study.Practice;

 class Rect {
    private int x;
    private int y;
    private int width;
    private int height;

    Rect(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void show(){
        System.out.println("(" + x + ","+ y +")에서 크기가" + width + "x" + height +"인 사각형");
    }
    public int square() {
        return(width*height);
    }
    boolean contains(Rect r){
        if(x<r.x && y < r.y)
            if((width+x) > (r.x + r.width) && (height + y) > (r.y+r.height))
        return true;
        return false;
    }
}
    public class Rectangle{
        public static void main(String[] args) {
            Rect r = new Rect(2,2,8,7);
            Rect s = new Rect(5,5,6,6);
            Rect t = new Rect(1,1,10,10);

            r.show();
            System.out.println("s의 면적은" + s.square());
            if(t.contains(r)) System.out.println("t는 r을 포함");
            if(t.contains(s)) System.out.println("t는 s를 포함");
        }
    }*/
