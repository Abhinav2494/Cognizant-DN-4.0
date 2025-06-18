// package Week_1.Algorithms_And_Data_Structures;
import java.util.*;


public class Main {

    public static class Product{
        String productId;
        String productName;
        String category;
    
        Product(String ProductId , String ProductName, String category){
            this.productId = ProductId;
            this.productName = ProductName;
            this.category = category;
        }
    
    }
    
    public class Productsearch{
        //Linear Search Method
        public static Product linearSearch(List<Product> ProductList, String productId){
            for(Product product : ProductList ){
                if(productId.equals(product.productId)){
                    return product;
                }
            }
            return null;
        }
        
        //Binary Search Method
        public static Product BinarySearch(List<Product> ProductList,String productId){
            Collections.sort(ProductList,  Comparator.comparing(product -> product.productId));
            int left = 0;
            int right = ProductList.size() - 1;
            int mid = 0;
            while(left <= right){
                mid = left + (right - left) / 2;
                if(productId.equals(ProductList.get(mid).productId)){
                    return ProductList.get(mid);
                }
                else if(productId.compareTo(ProductList.get(mid).productId) > 0){
                    left = mid +1;
                }
                else{
                    right = mid - 1;
                }
            }
            return null;
        }
    
        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List for storing Product type objects
        List<Product> ProductList = new ArrayList<>();
        
        // Taking details of products from the user
        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();
        
        
        
        for(int i = 0; i < numberOfProducts; i++){
            System.out.print("\n Enter the Details of Product No." + (i+1) );
            System.out.print("\n Enter ProductId :  ");

            String ProductId = sc.nextLine();
            System.out.print(" Enter ProductName :  ");
            String ProductName = sc.nextLine();
            System.out.print(" Enter category : ");
            String category = sc.nextLine();
            ProductList.add( new  Product( ProductId, ProductName, category ));
        }

        
        //Selecting searching method

        System.out.println("\n Enter ProductId for searching: ");
        String search_With_productId = sc.nextLine();
        if(search_With_productId != null){
            System.out.print("\n --> Enter '1' for Linear Search  \n -->  Enter '2' for Binary Search  \n --> Enter '0' for aborting \n -->" );
            int search_type = sc.nextInt();
            Product result = null;

            if(search_type == 1){
                 result =  Productsearch.linearSearch(ProductList, search_With_productId);
            }else if(search_type == 2){
                 result =  Productsearch.BinarySearch(ProductList, search_With_productId);
            }

            if(result != null){
                System.out.println("\n ProductId : " + result.productId + "\n ProductName : " + result.productName + "\n category : " + result.category );
            }else{
                System.out.println("\n Result not found");
            }
        }
        sc.close();
    }
} 
