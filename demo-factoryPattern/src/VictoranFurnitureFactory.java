import chair.VictorianChair;

public class VictoranFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }

  static void main(String[] args) {
    VictoranFurnitureFactory vFactory = new VictoranFurnitureFactory();
    Chair chair = vFactory.createChair();
  }

}
