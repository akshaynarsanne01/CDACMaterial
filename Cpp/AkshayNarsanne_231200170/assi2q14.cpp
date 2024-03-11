#include <iostream>

int main()
{
    int length, breadth;

    std::cout << "Enter length and breadth of the rectangle:\n";
    std::cin >> length >> breadth;

    for (int i = 0; i < length; ++i)
    {
        for (int j = 0; j < breadth; ++j)
        {
            if (i == 0 || i == length - 1 || j == 0 || j == breadth - 1)
            {
                std::cout << "*";
            }
            else
            {
                std::cout << " ";
            }
        }
        std::cout << "\n";
    }

    return 0;
}