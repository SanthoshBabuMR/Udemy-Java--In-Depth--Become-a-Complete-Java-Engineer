class Looping {
    public static void main (String... args) {
        int[] days = {10,21,35,51};

        System.out.println("Option 1");
        for(int i=0;i<days.length;i++) {
            System.out.println(days[i]);
        }

        System.out.println("Option 2");
        for(int i:days) {
            System.out.println(i);
        }
    }
}
