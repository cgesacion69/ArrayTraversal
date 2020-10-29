class Main {
  public static void main(String[] args) {
   
   int[] buckets = new int[] {5, 10, 15, 20, 25};

int j = 0;
for (int i = 0; i < buckets.length; i++) {
 buckets[i] = j;
 j += 5;
 System.out.println(buckets[i]);
}
  }
}


   


    
  
