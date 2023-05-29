minikube start --extra-config=apiserver.service-node-port-range=1-65535 --driver=none --apiserver-ips 127.0.0.1 --apiserver-name localhost --kubernetes-version=v1.21.2

cp /root/.kube/config /home/hasret/.kube/
cp -r /root/.minikube /home/hasret/

sed -i 's/root/home\/hasret/' /home/hasret/.kube/config

chmod -R 777 /home/hasret/.kube
chmod -R 777 /home/hasret/.minikube

kubectl apply -f postgres.yml 
kubectl apply -f keycloak.yaml 

# docker run -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin \
#     -e KEYCLOAK_IMPORT=./realm-export.json -v ./realm-export.json:/tmp/realm-export.json jboss/keycloak

kubectl apply -f mongo.yaml 
kubectl create cm test-config --from-file=/home/hasret/test1.json
kubectl apply -f job.yaml 
kubectl apply -f house.yaml


kubectl apply -f Nexus_Repository/Nexus-Namespace.yaml
kubectl apply -f Nexus_Repository/
