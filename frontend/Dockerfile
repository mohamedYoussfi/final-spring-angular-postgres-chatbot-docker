#FROM node:20 as builder
#WORKDIR /app
#COPY package*.json ./
#RUN npm install
#COPY . .
#ARG BACKEND_HOST
#ENV BACKEND_HOST=$BACKEND_HOST
#ARG CONFIGURATION=production
#ENV CONFIGURATION=$CONFIGURATION
#RUN npm run build --configuration=${CONFIGURATION}

FROM nginx:alpine
COPY ./nginx.conf  /etc/nginx/conf.d/default.conf
COPY dist/frontend/browser /usr/share/nginx/html
EXPOSE 80



