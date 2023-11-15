build-image:
	@ docker build -f devops/Dockerfile -t kuyayana:1 .
volume:
	@ docker volume create pg_kuyayana
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml kuyayana
rm:
	@ docker stack rm kuyayana
