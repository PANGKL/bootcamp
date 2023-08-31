public enum Rank {
  ONE(1), //
  TWO(2), //
  THREE(3), //
  FOUR(4), //
  FIVE(5), //
  SIX(6), //
  SEVEN(7), //
  EIGHT(8), //
  NIGHT(9), //
  TEN(10), //
  JACK(11), //
  QUEEN(12), //
  KING(13), //
  // JOKER(14), //
  ;

  private int num;

  private Rank(int num) {
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  public int compare(Rank rank) {
    if (this.num > rank.getNum())
      return 1;
    if (this.num < rank.getNum())
      return -1;
    return 0;
  }



}
