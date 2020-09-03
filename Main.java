
class Main {
  public static void main(String[] args) {
    // Product product01 = new Product(1, "Toyota");
    // System.out.println(product01.toString());

    ProductCollection productCollection = new ProductCollection();
    productCollection.add(new Product(1, "Toyota"));
    productCollection.add(new Product(2, "Buick"));
    productCollection.add(new Product(3, "Benz"));
    //productCollection.printProducts();
    //productCollection.getProduct(2);

    var itemOperation = productCollection.createOperation();
    while(itemOperation.hasNext()){
      System.out.println(itemOperation.current());
      itemOperation.next();
    }
  }
}