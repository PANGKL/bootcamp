public enum Suit {
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADES(4)
  ;

  private int num;

  private Suit (int num){
    this.num = num;
  }

  public int getNum() {
    return num;
  }


  public int compare(Rank rank) {
    if(this.num > rank.getNum())
      return 1;
    else if(this.num < rank.getNum())
      return -1;
    return 0;
  }

  
}
