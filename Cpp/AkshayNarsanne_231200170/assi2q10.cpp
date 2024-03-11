#include <iostream>

int main()
{
    int num1, num2, num3, max;

    std::cout << "Enter three numbers:\n";
    std::cin >> num1 >> num2 >> num3;

    max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

    std::cout << "Maximum: " << max << "\n";

    return 0;
}