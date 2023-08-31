public class Card {
  private Suit suit;
  private Rank rank;


  private Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public static Card of(Rank rank, Suit suit) {
    return new Card(rank, suit);
  }

  

  // public static Joker Joker() {
  //   return Joker.JOKER;
  // }



}
