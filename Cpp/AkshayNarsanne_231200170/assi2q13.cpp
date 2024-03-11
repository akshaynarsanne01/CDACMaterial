#include <iostream>

int main()
{
    int num;
    bool isPrime = true;

    std::cout << "Enter a positive integer:\n";
    std::cin >> num;

    if (num <= 1)
    {
        std::cout << num << " is not a prime number.\n";
        return 0;
    }

    for (int i = 2; i <= num / 2; ++i)
    {
        if (num % i == 0)
        {
            isPrime = false;
            break;
        }
    }

    if (isPrime)
        std::cout << num << " is a prime number.\n";
    else
        std::cout << num << " is not a prime number.\n";

    return 0;
}
