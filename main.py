n=input()
t=int(input())
d={}
for i in n:
    if i in d:
        d[i]+=1 
    else:
        d[i]=1 
x=[]
for i in d.keys():
    if d[i]>=t:
        x.append(i);
x=sorted(x)
print(x[0])
