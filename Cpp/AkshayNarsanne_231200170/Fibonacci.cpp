/*
Write a recursive function to obtain n numbers of a Fibonacci series
0 1 1 2 3 5 8 13 21 34 55 89...

*/
#include <iostream>
using namespace std;

int fibonacci(int n)
{
    if (n <= 1)
    {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
    int n;
    cout << "Enter the number of Fibonacci series elements: ";
    cin >> n;
    cout << "Fibonacci Series: ";
    for (int i = 0; i < n; ++i)
    {
        cout << fibonacci(i) << " ";
    }
    cout << endl;
    return 0;
}
