public class ClassTVK<T, V, K> {
    private T t;
    private V v;
    private K k;

    public ClassTVK(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void showTVk() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        ClassTVK<String, Integer, Double> example = new ClassTVK<>("Test String", 123, 45.67);


        example.showTVk();


        System.out.println("Value of T: " + example.getT());
        System.out.println("Value of V: " + example.getV());
        System.out.println("Value of K: " + example.getK());


        example.setT("New String");
        example.setV(456);
        example.setK(89.10);


        System.out.println("New value of T: " + example.getT());
        System.out.println("New value of V: " + example.getV());
        System.out.println("New value of K: " + example.getK());
    }
}
