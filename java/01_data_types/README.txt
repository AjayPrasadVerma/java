DATA TYPES IN JAVA

Primitive types (8 in total):
  int      - whole numbers, like 25
  long     - very big whole numbers, add L at the end: 100L
  double   - decimal numbers, like 55000.50
  float    - decimal numbers with less precision, add f: 3.5f
  char     - a single character in single quotes: 'A'
  boolean  - true or false
  byte, short - small whole numbers (rarely used)

Points to remember:
  1. int is the default for whole numbers.
  2. double is the default for decimal numbers.
  3. String is NOT a primitive type, it is a class.

Example:
  int age = 25;
  double salary = 55000.50;


SIZE

int - 4 bytes -> (-2^31)  to (2^31 - 1)
long - 8 bytes -> (-2^63)  to (2^63 - 1)
short - 2 bytes -> (-2^15)  to (2^15 - 1)
byte - 1 byte -> (-2^7)  to (2^7 - 1)

float - 4 byte
double - 8 byte

char - 2 bytes