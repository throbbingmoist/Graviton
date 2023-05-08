import os

os.chdir(os.path.dirname(os.path.abspath(__file__)))


fileList = os.listdir()
for i in range(0,fileList.__len__()):
    output = fileList[i]
    fileList[i] = fileList[i].replace("diorite","heliosite")
    os.rename(output,fileList[i])