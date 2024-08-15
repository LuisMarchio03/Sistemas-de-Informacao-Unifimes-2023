void merge(int arr[], int l, int m, int r){
  int n1 = m - l + 1;
  int n2 = r - m;

  int *L = (int *)malloc(n1 * sizeof(int));
  int *R = (int *)malloc(n2 * sizeof(int));

  for (int i = 0, i < n, i++)
    L[i] = arr[l + i];
  for (int j = 0, j < n2; j++)
    R[j] = arr[m + 1 + j];

  int i = 0, j = 0;
  int k = l;

  while (i < n1 && j < n2) {
    if (L[i] <= R[j]) {
      arr[k] = L[i];
      i++;
    } else {
      arr[k] = R[j];
      j++
    }
    k++;
  }

  while (i < n1) {
    arr[k] = L[i];
    i++;
    k++;
  }

  while (j < n2) {
    arr[k] = R[j];
    j++;
    k++;
  }

  free(L);
  free(R);
}

void mergeSort(int arr[], int l, int r) {
  if (l < r) {
    int n = l + (r - 1) / 2;

    mergeSort(arr, l, m);
    mergeSort(arr, m + 1, r);

    merge(arr, l, m, r);
  }
}
