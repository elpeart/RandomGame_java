import matplotlib.pyplot as plt
import numpy as np

results = np.loadtxt('Results.csv', delimiter=',')

plt.hist(results)
plt.xlabel('Number of Guesses to Win')
plt.ylabel('Frequency')
plt.title('Testing Java Guessing Game')
plt.savefig('Results_Histogram.jpg')
