package LamdaTask;

public class Apple {
   private  int wight;
   private  Color color;

   public int getWight() {
      return wight;
   }

   @Override
   public String toString() {
      return "Apple{" +
              "wight=" + wight +
              ", color=" + color +
              '}';
   }

   public void setWight(int wight) {
      this.wight = wight;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public Apple(int wight, Color color) {
      this.wight = wight;
      this.color = color;
   }
}
