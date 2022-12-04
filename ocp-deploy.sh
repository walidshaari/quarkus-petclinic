#!/usr/bin/env bash

printf "\n\n######## Deploying Quarkus Petclinic ########\n"

./mvnw install -Dquarkus.kubernetes.deploy=true -DskipTests=true -Dquarkus.kubernetes-client.trust-certs=true
