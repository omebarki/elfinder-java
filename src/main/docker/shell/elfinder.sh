#!/usr/bin/env bash
java -Xmx400m -Dserver.port=$WEB_PORT \
    -Dspring.security.user.name=$UI_LOGIN \
    -Dspring.security.user.password=$UI_PASSWORD \
    -jar /elfinder/lib/@project.build.finalName@.@project.packaging@