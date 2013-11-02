package disjointsetsjava;
import java.util.Iterator;
import java.util.LinkedList;
public class Components_Conected {
public static void main(String[] args) throws Exception {
	int a=5,i,j; 
	int matriz[][]={{0,1,1,0,0,0,0,0,0,0},{1,0,1,1,0,0,0,0,0,0},{1,1,0,0,0,0,0,0,0,0},
			        {0,1,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,1,0,0,0},{0,0,0,0,1,0,0,0,0,0},
			        {0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,1,0},{0,0,0,0,0,0,0,1,0,0},
			        {0,0,0,0,0,0,0,0,0,0}};
	class_disjointsets ds = new class_disjointsets(); 
	System.out.println("\nMatriz de adyacencia : ");
	for (i=0;i<10;i++)
	{ for(j=0;j<10;j++)
	{ 
		System.out.print(matriz[i][j]);
		  }
	     System.out.println(" ");
	}
	System.out.println("\nConjunto Inicial");
	for(int k=0;k<10;k++)
		ds.makeSet(k);
	ds.printSets();
	for (i=0;i<10;i++)
	{ for(j=0;j<=i;j++)
	{ 
		if(matriz[i][j]==1 && (ds.findSet(i)!=ds.findSet(j)))
		 ds.union(j, i);
		  }
	     
	}
	System.out.println("\nComponentes conectadas");
	ds.printSets();
}
		}
		
	


