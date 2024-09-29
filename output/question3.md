Static count: 1
Instance count: 1
Static count: 2
Instance count: 1
Static count: 3
Instance count: 1

since `instance` is not static the starting value will always be zero and be incremented on the constructor call to 1. While `count` is static hence it will change to the incremented value when ever a new instance is created.