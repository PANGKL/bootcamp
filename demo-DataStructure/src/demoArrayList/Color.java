package demoArrayList;
public enum Color {
  RED(0, 100), //
  BLUE(1, 200), //
  YELLOW(2, 300), //
  ;

  private int score;
  private int colorid;

  private Color(int colorid, int score) {
    this.colorid = colorid;
    this.score = score;

  }

  public int getScore() {
    return score;
  }

  public int getColorid() {
    return colorid;
  }

  public static Color getColor(int id) {
    if (id < 0 || id > 2)
      return null;
    switch (id) {
      case 0:
        return Color.RED;
      case 1:
        return Color.BLUE;
      case 2:
        return Color.YELLOW;
    }
    return null;
  }



}
