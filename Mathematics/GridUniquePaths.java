public class GridUniquePaths {
    public int uniquePaths(int A, int B) {
        return helper(0, 0, A, B);
    }
    
    public int helper(int x, int y, int A, int B) {
        if (x == A || y == B) return 0;
        if (x == A-1 && y == B-1) return 1;
        return helper(x+1, y, A, B) + helper(x, y+1, A, B);
    }
}
