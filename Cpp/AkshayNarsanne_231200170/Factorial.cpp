#include <iostream>

using namespace std;

int factorial(int n)
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    return n * factorial(n - 1);
}

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;
    cout << "Factorial: " << factorial(num) << endl;
    cout << "Factorial Series: ";
    for (int i = 1; i <= num; ++i)
    {
        cout << factorial(i) << " ";
    }
    cout << endl;

    return 0;
}
