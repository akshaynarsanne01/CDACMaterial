#include <iostream>

int main()
{
    char ch;
    std::cout << "Enter a character:\n";
    std::cin >> ch;

    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        ch = (ch >= 'a' && ch <= 'z') ? ch - 32 : ch + 32;
        std::cout << "Opposite case: " << ch << "\n";
    }
    else
    {
        std::cout << "Error: Not an alphabet.\n";
    }

    return 0;
}