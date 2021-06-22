package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    void decToBinary(int n)
{
int binarynumber[32];
int j = 0;
while (n > 0) {
binaryNum[j] = n % 2;
n = n / 2;
j++;
}
for (int k = j - 1; k >= 0; k--)
cout << binaryNum[k];
}
int main()
{
int n = 17;
decToBinary(n);
    return "";
  }
}
