import sys
import threading

# Force Python to switch threads much more frequently (every 1 microsecond)
#sys.setswitchinterval(0.0001)

counter = 0

def get_one():
  return 1

def worker():
  global counter
  # Bumped up to 1,000,000 iterations to ensure interleaving occurs
  for _ in range(1_000_000):
    counter += get_one()


# Spawn 5 threads (Total expected: 5,000,000)
threads = [threading.Thread(target=worker) for _ in range(5)]

for t in threads:
  t.start()
for t in threads:
  t.join()

print(f"Expected counter value: 5,000,000")
print(f"Actual counter value:   {counter:,}")