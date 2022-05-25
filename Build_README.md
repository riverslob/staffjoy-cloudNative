
# local run
### start sequences:
mail -> bot -> account -> company -> www -> whoami -> faraday

mvn clean package -DskipTests

# docker run

nerdctl build -t yanzxu/myaccount-spa:1 . -f myaccount/Dockerfile

nerdctl run -d -p 9001:80 boboweike/app-spa
nerdctl run -d -p 9000:80 boboweike/myaccount-spa