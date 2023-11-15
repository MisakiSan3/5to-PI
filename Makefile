build-image:
	@ docker build -f devops/Dockerfile -t kuyayana:1 .
volume:
	@ docker volume create pg_tendencia_kuyayana_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml kuyayana
rm:
	@ docker stack rm kuyayana
