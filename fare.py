# Functional approach using lambda
base_fare = 200
cost_per_km = 50

calculate_fare = lambda distance: base_fare + (distance * cost_per_km)

# Main program
distance = float(input("Enter distance (km): "))
fare = calculate_fare(distance)
print(f"Total fare: {fare} KES")