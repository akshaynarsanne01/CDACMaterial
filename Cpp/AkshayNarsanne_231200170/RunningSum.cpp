/*
Write a recursive function to obtain the running sum of n numbers.
 */
#include <iostream>
using namespace std;

int runningSum(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return n + runningSum(n - 1);
}

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;
    cout << "Running Sum: " << runningSum(num) << endl;
    return 0;
}
