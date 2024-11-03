# k8s-ingress-demo
#### **Overview**

This proof of concept (PoC) demonstrates the use of Kubernetes Ingress to manage external access to services within a Kubernetes cluster. The aim is to showcase how Ingress can simplify routing and enhance the security of applications deployed in Kubernetes.

#### **Features**

Ingress Controller: Configure an Ingress controller to handle incoming traffic and route it to the appropriate services.

Path-Based Routing: Demonstrate how to route traffic based on URL paths.

TLS Termination: Implement TLS termination to secure communication with clients.

Load Balancing: Provide basic load balancing for multiple service instances.

#### **Architecture**

Kubernetes Cluster: The foundation for deploying applications and services.

Ingress Resource: Defines rules for routing external HTTP(S) traffic to services within the cluster.

Ingress Controller: A component that processes Ingress resources and manages traffic routing.

#### **Prerequisites**

A running Kubernetes cluster (e.g., Minikube, GKE, EKS)
kubectl installed and configured