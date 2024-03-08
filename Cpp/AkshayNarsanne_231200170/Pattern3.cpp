#include <iostream>

using namespace std;

int main()
{
    int rows;

    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 1; i <= rows; ++i)
    {
        for (int space = 1; space < i; ++space)
        {
            cout << " ";
        }
        for (int j = i; j <= rows; ++j)
        {
            cout << "*";
        }
        for (int k = i; k < rows; ++k)
        {
            cout << "*";
        }

        cout << endl;
    }

    return 0;
}
