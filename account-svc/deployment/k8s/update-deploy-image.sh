IMAGE_TAG=$1

if test -z "$(kubectl get deploy deployment-account-svc -n dev)"; then
    echo "******* deployment-account-svc not exist, create new deployment with tag: $IMAGE_TAG *******"
    sed -e "s/{IMAGE_TAG}/$IMAGE_TAG/g" deployment-account-svc-template.yaml > deployment-account-svc.yaml;
    kubectl apply -f ./deployment-account-svc.yaml
    kubectl apply -f ./svc-account-svc.yaml
    rm -rf ./deployment-account-svc.yaml
else
    echo "******* deployment-account-svc already exist, update image tag to: $IMAGE_TAG *******"
    kubectl set image deployment/deployment-account-svc account-svc=yanzxu/account-svc:"$IMAGE_TAG" -n dev
fi
