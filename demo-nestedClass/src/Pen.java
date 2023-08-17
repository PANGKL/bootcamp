public class Pen {
  int size;
  Color color;
  int prize;

  public Pen(Builder builder) {
    this.size = builder.size;
    this.color = builder.color;
    this.prize = builder.prize;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private int size;
    private Color color;
    private int prize;

    public Builder size(int size) {
      this.size = size;
      return this;
    }

    public Builder color(Color color) {
      this.color = color;
      return this;
    }

    public Builder prize(int prize) {
      this.prize = prize;
      return this;
    }

    public Pen build() {
      return new Pen(this);
    }



  }

  public static void main(String[] args) {
    Pen p1 = Pen.builder()//
        .color(Color.RED) //
        .size(5) //
        .prize(20) //
        .build(); //

  }

}
