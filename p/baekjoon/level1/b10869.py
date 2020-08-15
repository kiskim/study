a, b = input().split()
a = int(a)
b = int(b)
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
# 함수를 이용한 몫, 나머지
# 속도는 떨어짐
print(*divmod(a, b))