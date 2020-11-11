<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class MWalkPointEstimationServiceClient extends \MMIServiceBaseClient implements \MWalkPointEstimationServiceIf
{
    public function __construct($input, $output = null)
    {
        parent::__construct($input, $output);
    }


    public function EstimateWalkPoints(array $sceneObjects, \MSceneObject $target, $amount, array $properties)
    {
        $this->send_EstimateWalkPoints($sceneObjects, $target, $amount, $properties);
        return $this->recv_EstimateWalkPoints();
    }

    public function send_EstimateWalkPoints(array $sceneObjects, \MSceneObject $target, $amount, array $properties)
    {
        $args = new \MWalkPointEstimationService_EstimateWalkPoints_args();
        $args->sceneObjects = $sceneObjects;
        $args->target = $target;
        $args->amount = $amount;
        $args->properties = $properties;
        $bin_accel = ($this->output_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_write_binary');
        if ($bin_accel) {
            thrift_protocol_write_binary(
                $this->output_,
                'EstimateWalkPoints',
                TMessageType::CALL,
                $args,
                $this->seqid_,
                $this->output_->isStrictWrite()
            );
        } else {
            $this->output_->writeMessageBegin('EstimateWalkPoints', TMessageType::CALL, $this->seqid_);
            $args->write($this->output_);
            $this->output_->writeMessageEnd();
            $this->output_->getTransport()->flush();
        }
    }

    public function recv_EstimateWalkPoints()
    {
        $bin_accel = ($this->input_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_read_binary');
        if ($bin_accel) {
            $result = thrift_protocol_read_binary(
                $this->input_,
                '\MWalkPointEstimationService_EstimateWalkPoints_result',
                $this->input_->isStrictRead()
            );
        } else {
            $rseqid = 0;
            $fname = null;
            $mtype = 0;

            $this->input_->readMessageBegin($fname, $mtype, $rseqid);
            if ($mtype == TMessageType::EXCEPTION) {
                $x = new TApplicationException();
                $x->read($this->input_);
                $this->input_->readMessageEnd();
                throw $x;
            }
            $result = new \MWalkPointEstimationService_EstimateWalkPoints_result();
            $result->read($this->input_);
            $this->input_->readMessageEnd();
        }
        if ($result->success !== null) {
            return $result->success;
        }
        throw new \Exception("EstimateWalkPoints failed: unknown result");
    }
}