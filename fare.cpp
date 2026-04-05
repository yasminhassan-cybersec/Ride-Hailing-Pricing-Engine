#include <iostream>
using namespace std;

double calculateFare(double distance) {
    double baseFare = 200;
    double costPerKm = 50;
    return baseFare + (distance * costPerKm);
}

int main() {
    double distance;
    cout << "Enter distance (km): ";
    cin >> distance;
    
    double fare = calculateFare(distance);
    cout << "Total fare: " << fare << " KES" << endl;
    
    return 0;
}