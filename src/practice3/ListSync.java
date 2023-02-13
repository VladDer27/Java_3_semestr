package practice3;

import java.util.*;

public class ListSync<E> implements List<E> {

    private volatile List<E> list = new ArrayList<>();

    @Override
    synchronized public int size() {
        return list.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    synchronized public Iterator iterator() {
        return list.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return list.toArray();
    }

    @Override
    synchronized public boolean add(Object o) {
        return list.add((E) o);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return list.addAll(c);
    }

    @Override
    synchronized public boolean addAll(int index, Collection c) {
        return list.addAll(index, c);
    }

    @Override
    synchronized public void clear() {
        list.clear();
    }

    @Override
    synchronized public E get(int index) {
        return list.get(index);
    }

    @Override
    synchronized public Object set(int index, Object element) {
        return list.set(index, (E) element);
    }

    @Override
    synchronized public void add(int index, Object element) {
        list.add(index, (E) element);
    }

    @Override
    synchronized public E remove(int index) {
        return list.remove(index);
    }

    @Override
    synchronized public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    synchronized public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    synchronized public ListIterator listIterator() {
        return list.listIterator();
    }

    @Override
    synchronized public ListIterator listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    synchronized public List subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return list.retainAll(c);
    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return list.removeAll(c);
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return list.containsAll(c);
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return list.toArray(a);
    }
}
