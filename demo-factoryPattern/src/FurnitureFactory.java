public interface FurnitureFactory {

  Chair createChair();

  Sofa createSofa();

  public static void main(String[] args) {
    //
  }



  // static Chair newChair()
  static FurnitureFactory createFactory(Style style){
    FurnitureFactory factory = switch(style){
      case MORDEN -> new ModernFurnitureFactory();
      case VICTORIAN -> new VictoranFurnitureFactory();
    }
    return factory;
  }

}
