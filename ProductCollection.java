import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private ArrayList<Product> products = new ArrayList<>();
  private int count;

/// tied to nested class; give access to nested class
  public ItemOperation createOperation(){
    return new ItemOperation(this);
  }

  public void add(Product product) {
    products.add(product);
    ++count;
  }

  public String pop() {
    --count;
    return products.get(count).toString();
  }

  public void getProduct(int num){
    System.out.println(products.get(num).toString());
  }

  public void printProducts() {
    System.out.println(products);
  }

  public class ItemOperation implements Operation {
    private ProductCollection productCollection;
    private int index;

    /// import main class
    public ItemOperation(ProductCollection productCollection){
      this.productCollection = productCollection;
    }

    @Override
    public boolean hasNext(){
  //    return (index < productCollection.count);
      return (index < productCollection.products.size());
    };
     @Override
    public String current(){
//      productCollection.getProduct(index);
      return productCollection.products.get(index).toString();
    };
     @Override
    public void next(){
      ++index;
    };

  }

}