FROM node:14

# Utilizando apenas no BUILD
ARG PORT_BUILD=4000

# Será refletido no container
ENV PORT=$PORT_BUILD
EXPOSE ${PORT}
WORKDIR /app-node-gilson
COPY . .
RUN npm install
ENTRYPOINT npm start