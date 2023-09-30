#include <iostream>
using namespace std;

int main() {
    // Variabel dan tipe data
    int angka;
    //input
    cout<<"masukkan angka : ";cin>>angka;
    
    // Output
    cout << "Angka: " << angka << endl;
    
    
    // If statement
    if (angka % 2 == 0) {
        cout << angka << "merupakan angka genap" << endl;
    } else {
        cout << "merupakan angka ganjil" << endl;
    }
    
    cout<<"akan menginputkan angka sebanyak batas yang diinputkan"<<endl;
    // Perulangan for
    for (int i = 0; i < angka; i++) {
        cout << i << " ";
    }
    cout << endl;
    
    
    // Perulangan while
    int i = 0;
    while (i < angka) {
        cout << i << " ";
        i++;
    }
    
    cout << endl;
    
    // Perulangan do while
    int j = 0;
    do {
        cout << j << " ";
        j++;
    } while (j < angka);
    
    cout << endl;
    
    // Array satu dimensi
    int arr[5] = {1, 2, 3, 4, 5};
    cout << "Elemen-elemen array: ";
    for (int k = 0; k < 5; k++) {
        cout << arr[k] << " ";
    }
    
    cout << endl;
    
    // Array multidimensi
    int matrix[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    cout << "Elemen-elemen matriks: " << endl;
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            cout << matrix[row][col] << " ";
        }
        cout << endl;
    }
    
    return 0;
}
