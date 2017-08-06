import sys

with open(sys.argv[1], 'r') as f:
    print(len(f.readlines()))
f.close()
