IMAGENAME?=terzi/centos7.0.1406
CONTAINERNAME?=terzi-centos7

.PHONY: help
help:
	@echo "Usage"
	@echo "  build  : Build the image"
	@echo "  delete : Deletes the container"
	@echo "  logs   : Shows container logs"
	@echo "  shell  : Starts interactive shell"
	@echo "  start  : Starts the container (you need to run 'make build' once first)"
	@echo "  status : Shows container status"
	@echo "  stop   : Stops the container"
	@echo "  "
    
.PHONY: build
build:
	docker build -t "$(IMAGENAME)" -f ./Dockerfile ../../
	docker run  --name "$(CONTAINERNAME)" -t -d "$(IMAGENAME)" /bin/bash

 
.PHONY: start
start:
	docker container start "$(CONTAINERNAME)"

.PHONY: stop
stop:
	docker stop "$(CONTAINERNAME)"

.PHONY: delete
delete:
	docker rm "$(CONTAINERNAME)"
 
.PHONY: logs
logs:
	docker container logs --follow "$(CONTAINERNAME)"
 
.PHONY: shell
shell:
	docker exec -it "$(CONTAINERNAME)" bash || true
 
.PHONY: status
status:
	docker ps -f name="$(CONTAINERNAME)"

