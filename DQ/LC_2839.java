class LC_2839 {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.length() != 4 || s2.length() != 4) return false;
        if(s1.equals(s2)) return true;

        char[] arr = s1.toCharArray();

        swap(arr, 0, 2);
        if (new String(arr).equals(s2)) return true;

        arr = s1.toCharArray();
        swap(arr, 1, 3);
        if (new String(arr).equals(s2)) return true;

        arr = s1.toCharArray();
        swap(arr, 0, 2);
        swap(arr, 1, 3);
        if (new String(arr).equals(s2)) return true;

        return false;
    }

    void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
