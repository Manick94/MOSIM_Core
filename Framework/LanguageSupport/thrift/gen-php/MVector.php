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

class MVector
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'Values',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::DOUBLE,
            'elem' => array(
                'type' => TType::DOUBLE,
                ),
        ),
    );

    /**
     * @var double[]
     */
    public $Values = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['Values'])) {
                $this->Values = $vals['Values'];
            }
        }
    }

    public function getName()
    {
        return 'MVector';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->Values = array();
                        $_size0 = 0;
                        $_etype3 = 0;
                        $xfer += $input->readListBegin($_etype3, $_size0);
                        for ($_i4 = 0; $_i4 < $_size0; ++$_i4) {
                            $elem5 = null;
                            $xfer += $input->readDouble($elem5);
                            $this->Values []= $elem5;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('MVector');
        if ($this->Values !== null) {
            if (!is_array($this->Values)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Values', TType::LST, 1);
            $output->writeListBegin(TType::DOUBLE, count($this->Values));
            foreach ($this->Values as $iter6) {
                $xfer += $output->writeDouble($iter6);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
