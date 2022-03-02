# Spring boot demo web app

Simple SpringBoot Calculator Web App  

## Running with Docker:
```bash
docker-compose up
```
## Deploying on local k8s using minikube
```bash
minikube start
eval $(minikube docker-env)
docker build -t spring-boot-demo-web-app_web .
kubectl apply -f web-service.yaml
kubectl apply -f web-deployment.yaml
minikube tunnel
```
