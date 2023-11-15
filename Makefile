build-image:
	@ docker build -f devops/Dockerfile -t institutobackend:1 .
volume:
	@ docker volume create pg_tendencia_instituto_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml instituto
rm:
	@ docker stack rm instituto
