void main() {
    System.out.println(multiples(999, 3, 5));
}

static int multiples(int n, int a, int b) {
    int counter = 0;
    for(int i = n; i > 0; i--) {
        if(i % a == 0 | i % b == 0) {
            counter++;
        }
    }
    return counter;

}