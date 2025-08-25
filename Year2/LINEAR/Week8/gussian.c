#include <stdio.h>
#include <math.h>

#define MAXN 100
#define EPS 1e-12

int main() {
    int n;
    if (scanf("%d", &n) != 1 || n <= 0 || n > MAXN) return 1;
    double A[MAXN][MAXN], b[MAXN], x[MAXN];
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < n; ++j)
            if (scanf("%lf", &A[i][j]) != 1) return 1;
    for (int i = 0; i < n; ++i)
        if (scanf("%lf", &b[i]) != 1) return 1;

    for (int k = 0; k < n; ++k) {
        int pivot = k;
        double maxabs = fabs(A[k][k]);
        for (int i = k + 1; i < n; ++i) {
            double v = fabs(A[i][k]);
            if (v > maxabs) { maxabs = v; pivot = i; }
        }
        if (maxabs < EPS) { puts("No unique solution"); return 0; }
        if (pivot != k) {
            for (int j = 0; j < n; ++j) {
                double t = A[k][j]; A[k][j] = A[pivot][j]; A[pivot][j] = t;
            }
            double tb = b[k]; b[k] = b[pivot]; b[pivot] = tb;
        }
        for (int i = k + 1; i < n; ++i) {
            double m = A[i][k] / A[k][k];
            A[i][k] = 0.0;
            for (int j = k + 1; j < n; ++j) A[i][j] -= m * A[k][j];
            b[i] -= m * b[k];
        }
    }

    for (int i = n - 1; i >= 0; --i) {
        double s = b[i];
        for (int j = i + 1; j < n; ++j) s -= A[i][j] * x[j];
        if (fabs(A[i][i]) < EPS) { puts("No unique solution"); return 0; }
        x[i] = s / A[i][i];
    }

    for (int i = 0; i < n; ++i) printf("%.9f%c", x[i], i+1==n?'\n':' ');
    return 0;
}

