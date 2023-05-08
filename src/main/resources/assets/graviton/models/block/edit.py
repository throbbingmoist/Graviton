import os

os.chdir(os.path.dirname(os.path.abspath(__file__)))


fileList = os.listdir()
fileList = [x for x in fileList if ".py" not in x]
fileList = [x for x in fileList if ".ini" not in x]
        
for i in range(0,fileList.__len__()):
    output = fileList[i]
    with open(output, "r+") as file:
        content = file.read()
        print(output)
        if "diorite" in content:
            content = content.replace("diorite","heliosite")
            file.close()
            with open(output, "w") as file:
                file.write(content)
            
    # fileList[i] = fileList[i].replace("quartz_","heliosite_")
    # os.rename(output,fileList[i])