package interviewQuestions.telegramSource.JavaExercises.StringAssignment;

import java.util.*;

public class SplitStringWithDynamicSeperator implements Separator, Collection<Separator> {

    Stack<Character> q = new Stack();

    SplitStringWithDynamicSeperator() {
    }

    SplitStringWithDynamicSeperator(Character c) {
        q.add(c);
    }

    public Set<Separator> getSetOfSeperator(String str) {
        Set<Separator> s = new HashSet<Separator>();
        for (Character c : str.toCharArray()) {
            s.add(new SplitStringWithDynamicSeperator(c));
        }
        return s;
    }



    @Override
    public char get() {
        return q.pop();
    }


    public static void main(String[] args) {
        SplitStringWithDynamicSeperator t = new SplitStringWithDynamicSeperator();
        test2 t1 = new test2();
        Set<Separator> s = t.getSetOfSeperator("%_@");
        System.out.println(t1.split("aa_b%%%%b_c_a@@jksl__", s));
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Separator> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Separator separator) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Separator> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }
}

