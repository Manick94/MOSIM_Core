// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "MInverseKinematicsService.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using namespace  ::MMIStandard;

class MInverseKinematicsServiceHandler : virtual public MInverseKinematicsServiceIf {
 public:
  MInverseKinematicsServiceHandler() {
    // Your initialization goes here
  }

  void ComputeIK( ::MMIStandard::MAvatarPostureValues& _return, const  ::MMIStandard::MAvatarPostureValues& postureValues, const std::vector<MIKProperty> & properties) {
    // Your implementation goes here
    printf("ComputeIK\n");
  }

  void CalculateIKPosture(MIKServiceResult& _return, const  ::MMIStandard::MAvatarPostureValues& postureValues, const std::vector< ::MMIStandard::MConstraint> & constraints, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("CalculateIKPosture\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<MInverseKinematicsServiceHandler> handler(new MInverseKinematicsServiceHandler());
  ::std::shared_ptr<TProcessor> processor(new MInverseKinematicsServiceProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}
