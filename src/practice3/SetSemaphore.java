package practice3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SetSemaphore<E> implements Set<E> {

    private Semaphore semaphore = new Semaphore(1);
    private volatile Set<E> set = new HashSet<>();
        @Override
        public int size() {
            int size = 0;
            try {
                semaphore.acquire();
                size = set.size();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
            return  size;
        }

        @Override
        public boolean isEmpty() {
            boolean emptiness = true;

            try {
                semaphore.acquire();
                emptiness = set.isEmpty();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return emptiness;
        }

        @Override
        public boolean contains(Object o) {
            boolean temp = false;
            try {
                semaphore.acquire();
                temp = set.contains(o);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  temp;
        }

        @Override
        public Iterator<E> iterator() {
            Iterator<E> iterator = null;
            try {
                semaphore.acquire();
                iterator = set.iterator();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  iterator;
        }

        @Override
        public Object[] toArray() {
            Object[] objects = new Object[]{};
            try {
                semaphore.acquire();
                objects = set.toArray();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return objects;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            Object[] objects = new Object[]{};
            try {
                semaphore.acquire();
                objects = set.toArray();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  (T[]) objects;
        }

        @Override
        public boolean add(E e) {
            boolean add_status = false;
            try {
                semaphore.acquire();
                add_status = set.add(e);
            } catch (InterruptedException er) {
                er.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  add_status;
        }

        @Override
        public boolean remove(Object o) {
            boolean remove_status = false;
            try {
                semaphore.acquire();
                remove_status = set.remove(o);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  remove_status;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            boolean contains_status = false;
            try {
                semaphore.acquire();
                contains_status = set.containsAll(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return contains_status;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            boolean add_All = false;
            try {
                semaphore.acquire();
                add_All = set.addAll(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  add_All;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            boolean status = false;
            try {
                semaphore.acquire();
                status = set.retainAll(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  status;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            boolean removeAllStatus = false;
            try {
                semaphore.acquire();
                removeAllStatus = set.removeAll(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
            return  removeAllStatus;
        }

        @Override
        public void clear() {
            try {
                semaphore.acquire();
                set.clear();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }
}
