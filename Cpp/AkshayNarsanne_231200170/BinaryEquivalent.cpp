/*
Write a function to find the binary equivalent of this number using recursion.
*/
#include <iostream>
using namespace std;

void binaryEquivalent(int n)
{
    if (n > 0)
    {
        binaryEquivalent(n / 2);
        cout << n % 2;
    }
}

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;
    cout << "Binary Equivalent: ";
    binaryEquivalent(num);
    cout << endl;
    return 0;
}
