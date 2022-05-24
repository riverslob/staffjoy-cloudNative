
# local run
### start sequences:
mail -> bot -> account -> company -> www -> whoami -> faraday


# docker run
nerdctl run -d -p 9001:80 boboweike/app-spa
nerdctl run -d -p 9000:80 boboweike/myaccount-spa