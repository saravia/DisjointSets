package disjointsetsjava;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class class_disjointsets {
public LinkedList sets;
	class_disjointsets() {
	    sets = new LinkedList();
	  }
	
public void makeSet(Object x) throws Exception {
    if (x == null) {
      throw new Exception("DisjointSets.makeSet:"
          + " x es nulo");
    }
if (findSet(x) != null) {
      throw new Exception("DisjointSets.makeSet:"
          + " x ya existe");
    }
 LinkedList si = new LinkedList();
    si.add(x);
    sets.add(si);
  }
public void union(Object x, Object y) throws Exception {
    if (x == null || y == null) {
      throw new Exception("DisjointSets.union:" + " x o y son nulos");
    }
    LinkedList sx = findTheSet(x);
    LinkedList sy = findTheSet(y);
    if (sx == null || sy == null) {
      throw new Exception("DisjointSets.union:" + " x o y no estan presenten");
    }
    LinkedList sxy = new LinkedList(sx);
    for (Iterator i = sy.iterator(); i.hasNext(); sxy.add(i.next())) {
      }
    sets.add(sxy);
    sets.remove(sx);
    sets.remove(sy);
  }
  public Object findSet(Object x) {
    LinkedList s = findTheSet(x);
    if (s == null) {
      return null;
    }
    Iterator i = s.iterator();
    if (i.hasNext()) {
      return i.next();
    } else {
      return null;
    }
  }
    LinkedList findTheSet(Object x) {
    Iterator i = sets.iterator();
    LinkedList s = null;
    while (i.hasNext()) {
      LinkedList si = (LinkedList) i.next();
      if (si.contains(x)) {
        s = si;
        break;
      }
    }
    return s;
  }
  void printSets() {
    int counter = 0;
    Iterator si = sets.iterator();
    while (si.hasNext()) {
      LinkedList s = (LinkedList) si.next();
      System.out.print("conjunto"  + ": {");
      Iterator mi = s.iterator();
      while (mi.hasNext()) {
        System.out.print(mi.next().toString() + " ");
      }
     System.out.println("}");
    }
  }
}