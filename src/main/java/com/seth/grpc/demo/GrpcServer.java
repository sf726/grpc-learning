package com.seth.grpc.demo;

import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServer extends GreeterGrpc.GreeterImplBase{

 @Override
 public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
  HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + req.getName()).build();
  responseObserver.onNext(reply);
  responseObserver.onCompleted();
 }

 }