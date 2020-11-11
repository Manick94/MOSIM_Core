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

class MTransformUpdate
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'Position',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::DOUBLE,
            'elem' => array(
                'type' => TType::DOUBLE,
                ),
        ),
        2 => array(
            'var' => 'Rotation',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::DOUBLE,
            'elem' => array(
                'type' => TType::DOUBLE,
                ),
        ),
        3 => array(
            'var' => 'Parent',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var double[]
     */
    public $Position = null;
    /**
     * @var double[]
     */
    public $Rotation = null;
    /**
     * @var string
     */
    public $Parent = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['Position'])) {
                $this->Position = $vals['Position'];
            }
            if (isset($vals['Rotation'])) {
                $this->Rotation = $vals['Rotation'];
            }
            if (isset($vals['Parent'])) {
                $this->Parent = $vals['Parent'];
            }
        }
    }

    public function getName()
    {
        return 'MTransformUpdate';
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
                        $this->Position = array();
                        $_size0 = 0;
                        $_etype3 = 0;
                        $xfer += $input->readListBegin($_etype3, $_size0);
                        for ($_i4 = 0; $_i4 < $_size0; ++$_i4) {
                            $elem5 = null;
                            $xfer += $input->readDouble($elem5);
                            $this->Position []= $elem5;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->Rotation = array();
                        $_size6 = 0;
                        $_etype9 = 0;
                        $xfer += $input->readListBegin($_etype9, $_size6);
                        for ($_i10 = 0; $_i10 < $_size6; ++$_i10) {
                            $elem11 = null;
                            $xfer += $input->readDouble($elem11);
                            $this->Rotation []= $elem11;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Parent);
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
        $xfer += $output->writeStructBegin('MTransformUpdate');
        if ($this->Position !== null) {
            if (!is_array($this->Position)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Position', TType::LST, 1);
            $output->writeListBegin(TType::DOUBLE, count($this->Position));
            foreach ($this->Position as $iter12) {
                $xfer += $output->writeDouble($iter12);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Rotation !== null) {
            if (!is_array($this->Rotation)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Rotation', TType::LST, 2);
            $output->writeListBegin(TType::DOUBLE, count($this->Rotation));
            foreach ($this->Rotation as $iter13) {
                $xfer += $output->writeDouble($iter13);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Parent !== null) {
            $xfer += $output->writeFieldBegin('Parent', TType::STRING, 3);
            $xfer += $output->writeString($this->Parent);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}