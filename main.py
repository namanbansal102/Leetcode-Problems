import os
print(os.listdir())
for fileName in os.listdir():
    index=fileName.find(".class")
    if index!=-1:
        os.remove(fileName)