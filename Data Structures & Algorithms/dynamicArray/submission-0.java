class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (capacity == size) {
            resize();
        }

        arr[size] = n;
        size = size + 1;
    }

    public int popback() {
        int delete = arr[size - 1];
        this.size = this.size - 1;
        return delete;
    }

    private void resize() {
        int[] bigger = new int[capacity * 2];

        for(int i = 0; i < size; i++) {
            bigger[i] = arr[i];
        }
        
        arr = bigger;
        capacity = capacity * 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
