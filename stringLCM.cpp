#include <iostream>
#include <string>

using namespace std;

void solve() {
  string a,b;
  cin >> a >> b;

  if (a == b) {
    cout << a;
  }

  string result = "";
  if (a.size() < b.size()) {
    result = a;
  } else {
    result = b;
  }
  while (a!=b) {
    if (a.size() == b.size() && a!=b) {
      cout << -1;
      return;
    } 
    if (a.size() > b.size()) {
      for (int i = 0; i < b.size(); i++) {
        if (a[i] != b[i]) {
          cout << -1;
          return;
        }
      }
      
      result = result + b;
      
    } else {
      for (int i = 0; i < a.size(); i++) {
        if (a[i] != b[i]) {
          cout << -1;
          return;
        }
      }
      result = result + a;
    }
  }
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}

