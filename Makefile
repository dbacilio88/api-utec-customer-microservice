APP_NAME := api-utec-customer-microservice
DOCKER_REGISTRY := 654654431014.dkr.ecr.us-east-1.amazonaws.com
DOCKER_IMAGE := $(DOCKER_REGISTRY)/$(APP_NAME)
GIT_COMMIT := $(shell git rev-parse --short HEAD)
VERSION := $(shell mvn help:evaluate -Dexpression=project.version -q -DforceStdout)
DOCKER_TAG := $(GIT_COMMIT)

all: release

build:
	@echo "Clean and build jar $(APP_NAME):$(GIT_COMMIT)"
	mvn clean compile package

docker_build:
	@echo "build image  $(APP_NAME):$(GIT_COMMIT)"
	@docker image build -t $(APP_NAME):$(GIT_COMMIT) .

docker_tag:
	@echo "tag image  $(APP_NAME):$(GIT_COMMIT) to $(DOCKER_IMAGE):latest"
	@docker tag $(APP_NAME):$(GIT_COMMIT) $(DOCKER_IMAGE):latest

docker_push:
	@echo "push image latest $(DOCKER_IMAGE):latest"
	@docker push $(DOCKER_IMAGE):latest
	@echo "push image current $(DOCKER_IMAGE):$(DOCKER_TAG)"
	@docker push $(DOCKER_IMAGE):$(DOCKER_TAG)

docker_clean:
	@echo "remove image $(DOCKER_IMAGE):latest"
	@docker rmi $(DOCKER_IMAGE):latest
	@echo "remove image $(DOCKER_IMAGE):$(DOCKER_TAG)"
	@docker rmi $(DOCKER_IMAGE):$(DOCKER_TAG)

release: docker_build docker_tag docker_push docker_clean

.PHONY: build docker_build docker_tag docker_push docker_clean