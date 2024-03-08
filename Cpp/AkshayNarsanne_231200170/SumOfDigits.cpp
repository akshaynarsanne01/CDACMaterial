#include <iostream>
using namespace std;

int sumOfDigitsLoop(int number)
{
    int sum = 0;
    while (number > 0)
    {
        sum += number % 10;
        number /= 10;
    }
    return sum;
}
int sumOfDigitsRec(int number)
{
    if (number == 0)
    {
        return 0;
    }
    return number % 10 + sumOfDigitsRec(number / 10);
}
int main()
{
    int num;
    cout << "Enter a 4-digit number: ";
    cin >> num;
    cout << "Sum of digits using loop: " << sumOfDigitsLoop(num) << endl;
    cout << "Sum of digits using recursion: " << sumOfDigitsRec(num) << endl;
    return 0;
}
