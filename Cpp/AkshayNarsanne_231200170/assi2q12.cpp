#include <iostream>
#include <cmath>

int main()
{
    int num, originalNum, remainder, n = 0;
    float result = 0.0;

    std::cout << "Enter an integer:\n";
    std::cin >> num;

    originalNum = num;

    while (originalNum != 0)
    {
        originalNum /= 10;
        ++n;
    }

    originalNum = num;

    while (originalNum != 0)
    {
        remainder = originalNum % 10;
        result += pow(remainder, n);
        originalNum /= 10;
    }

    if (static_cast<int>(result) == num)
    {
        std::cout << num << " is an Armstrong number.\n";
    }
    else
    {
        std::cout << num << " is not an Armstrong number.\n";
    }

    return 0;
}
