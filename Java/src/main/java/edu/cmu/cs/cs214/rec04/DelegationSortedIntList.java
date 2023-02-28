package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sorted;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.sorted = new SortedIntList();
        this.totalAdded = 0;
    }

    public boolean add(int num) {
        this.totalAdded++;
        return sorted.add(num);
    }

    public boolean addAll(IntegerList list) {
        this.totalAdded += list.size();
        return sorted.addAll(list);
    }

    public int get(int index) {
        return sorted.get(index);
    }

    public boolean remove(int num) {
        return sorted.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return sorted.removeAll(list);
    }

    public int size() {
        return sorted.size();
    }

    public int getTotalAdded() {
        return this.totalAdded;
    }
}