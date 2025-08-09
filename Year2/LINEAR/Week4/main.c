#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int** createMinorMatrix(int size, int **inputMatrix, int excludedRow, int excludedCol);
int calculateDeterminant(int size, int **inputMatrix);
void free2DMatrix(int **matrix, int size);

double** createMinorMatrixDouble(int size, double **matrix, int excludedRow, int excludedCol);
double calculateDeterminantDouble(int size, double **matrix);
void free2DMatrixDouble(double **matrix, int size);
double** cofactorMatrix(double **matrix, int size);
double** transposeMatrix(double **matrix, int size);
double** inverseMatrix(double **matrix, int size);

int main(void)
{
    int size;
    printf("Enter matrix size (n): ");
    scanf("%d", &size);

    double **inputMatrix = malloc(size * sizeof(double *));
    if (inputMatrix == NULL) return 1;

    for (int i = 0; i < size; i++) {
        inputMatrix[i] = malloc(size * sizeof(double));
        if (inputMatrix[i] == NULL) {
            free2DMatrixDouble(inputMatrix, i);
            return 1;
        }

        for (int j = 0; j < size; j++) {
            scanf("%lf", &inputMatrix[i][j]);
        }
    }

    double **inverse = inverseMatrix(inputMatrix, size);

    if (inverse == NULL) {
        free2DMatrixDouble(inputMatrix, size);
        return 0;
    }
    printf("Inverse matrix:\n");
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            printf("%8.3lf ", inverse[i][j]);
        }
        printf("\n");
    }

    free2DMatrixDouble(inputMatrix, size);
    return 0;
}

double** cofactorMatrix(double **matrix, int size)
{
    double **cof = malloc(size * sizeof(double *));
    for (int i = 0; i < size; i++) {
        cof[i] = malloc(size * sizeof(double));
        for (int j = 0; j < size; j++) {
            double **minor = createMinorMatrixDouble(size, matrix, i, j);
            cof[i][j] = pow(-1, i + j) * calculateDeterminantDouble(size - 1, minor);
            free2DMatrixDouble(minor, size - 1);
        }
    }
    return cof;
}

double** transposeMatrix(double **matrix, int size)
{
    double **trans = malloc(size * sizeof(double *));
    for (int i = 0; i < size; i++) {
        trans[i] = malloc(size * sizeof(double));
        for (int j = 0; j < size; j++) {
            trans[i][j] = matrix[j][i];
        }
    }
    return trans;
}

double** inverseMatrix(double **matrix, int size)
{
    double det = calculateDeterminantDouble(size, matrix);
    if (det == 0) return NULL;

    double **cof = cofactorMatrix(matrix, size);
    double **adj = transposeMatrix(cof, size);
    double **inv = malloc(size * sizeof(double *));
    for (int i = 0; i < size; i++) {
        inv[i] = malloc(size * sizeof(double));
        for (int j = 0; j < size; j++) {
            inv[i][j] = adj[i][j] / det;
        }
    }

    free2DMatrixDouble(cof, size);
    free2DMatrixDouble(adj, size);
    return inv;
}

double** createMinorMatrixDouble(int size, double **matrix, int excludedRow, int excludedCol)
{
    double **minor = malloc((size - 1) * sizeof(double *));
    for (int i = 0, mi = 0; i < size; i++) {
        if (i == excludedRow) continue;
        minor[mi] = malloc((size - 1) * sizeof(double));
        for (int j = 0, mj = 0; j < size; j++) {
            if (j == excludedCol) continue;
            minor[mi][mj++] = matrix[i][j];
        }
        mi++;
    }
    return minor;
}

double calculateDeterminantDouble(int size, double **matrix)
{
    if (size == 1) return matrix[0][0];
    if (size == 2) return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];

    double det = 0;
    for (int col = 0; col < size; col++) {
        double **minor = createMinorMatrixDouble(size, matrix, 0, col);
        det += pow(-1, col) * matrix[0][col] * calculateDeterminantDouble(size - 1, minor);
        free2DMatrixDouble(minor, size - 1);
    }
    return det;
}

void free2DMatrixDouble(double **matrix, int size)
{
    for (int i = 0; i < size; i++)
        free(matrix[i]);
    free(matrix);
}
