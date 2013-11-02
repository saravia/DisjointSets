package disjointsetsjava;
public class main_disjoint {
	public static void main(String[] args) throws Exception {
		try {
		      Integer[] items = new Integer[7];
		      for (int i = 0; i < 7; ++i) {
		        items[i] = new Integer(i);
		      }
		      class_disjointsets ds = new class_disjointsets();
		      ds.printSets();

		      System.out.println("\nHacer un conjunto con elemento(7))");
		      ds.makeSet(new Integer(7));
		      ds.makeSet(new Integer(6));   
		      ds.makeSet(new Integer(5));
		      ds.makeSet(new Integer(4));
		      ds.makeSet(new Integer(3));
		      ds.makeSet(new Integer(2));
		      ds.makeSet(new Integer(1));
		      ds.printSets();

		      
		      System.out.println("\nunion({5}, {6})");
		     ds.union(items[5], items[6]);
		     ds.printSets();

		      System.out.println("\nunion({5}, {3})");
		      ds.union(items[5], items[3]);
		      ds.printSets();

		System.out.println("\nfindSet({3}) = " + ds.findSet(items[3]).toString());
		      ds.printSets();
		    }  catch (Exception e) {
		        e.printStackTrace();
		    }

	}

}
