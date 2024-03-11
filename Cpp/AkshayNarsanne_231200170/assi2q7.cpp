#include <iostream>
using namespace std;

int main()
{

    float basicSalary, hra, da, pf, grossSalary, netSalary;
    cout << "Enter Basic Salary:\n";
    cin >> basicSalary;

    hra = 0.15 * basicSalary;
    da = 0.30 * basicSalary;
    grossSalary = basicSalary + hra + da;
    pf = 0.125 * grossSalary;
    netSalary = grossSalary - pf;
    return 0;
}