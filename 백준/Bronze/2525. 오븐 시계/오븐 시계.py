h, m = map(int, input().split())
mt = int(input())
m += mt
h += (m//60)
m = m%60
if h>=24:
    h -= 24
print(h, m)

