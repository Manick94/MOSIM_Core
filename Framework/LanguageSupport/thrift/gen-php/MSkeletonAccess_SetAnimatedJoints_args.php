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

class MSkeletonAccess_SetAnimatedJoints_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'avatarID',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'joints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
    );

    /**
     * @var string
     */
    public $avatarID = null;
    /**
     * @var int[]
     */
    public $joints = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['avatarID'])) {
                $this->avatarID = $vals['avatarID'];
            }
            if (isset($vals['joints'])) {
                $this->joints = $vals['joints'];
            }
        }
    }

    public function getName()
    {
        return 'MSkeletonAccess_SetAnimatedJoints_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->avatarID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->joints = array();
                        $_size287 = 0;
                        $_etype290 = 0;
                        $xfer += $input->readListBegin($_etype290, $_size287);
                        for ($_i291 = 0; $_i291 < $_size287; ++$_i291) {
                            $elem292 = null;
                            $xfer += $input->readI32($elem292);
                            $this->joints []= $elem292;
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
        $xfer += $output->writeStructBegin('MSkeletonAccess_SetAnimatedJoints_args');
        if ($this->avatarID !== null) {
            $xfer += $output->writeFieldBegin('avatarID', TType::STRING, 1);
            $xfer += $output->writeString($this->avatarID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->joints !== null) {
            if (!is_array($this->joints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('joints', TType::LST, 2);
            $output->writeListBegin(TType::I32, count($this->joints));
            foreach ($this->joints as $iter293) {
                $xfer += $output->writeI32($iter293);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
