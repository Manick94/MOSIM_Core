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

class MMIRegisterService_GetAvailableMMUs_result
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        0 => array(
            'var' => 'success',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRUCT,
            'vtype' => TType::LST,
            'key' => array(
                'type' => TType::STRUCT,
                'class' => '\MMUDescription',
            ),
            'val' => array(
                'type' => TType::LST,
                'etype' => TType::STRUCT,
                'elem' => array(
                    'type' => TType::STRUCT,
                    'class' => '\MIPAddress',
                    ),
                ),
        ),
    );

    /**
     * @var array
     */
    public $success = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['success'])) {
                $this->success = $vals['success'];
            }
        }
    }

    public function getName()
    {
        return 'MMIRegisterService_GetAvailableMMUs_result';
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
                case 0:
                    if ($ftype == TType::MAP) {
                        $this->success = array();
                        $_size117 = 0;
                        $_ktype118 = 0;
                        $_vtype119 = 0;
                        $xfer += $input->readMapBegin($_ktype118, $_vtype119, $_size117);
                        for ($_i121 = 0; $_i121 < $_size117; ++$_i121) {
                            $key122 = new \MMUDescription();
                            $val123 = array();
                            $key122 = new \MMUDescription();
                            $xfer += $key122->read($input);
                            $val123 = array();
                            $_size124 = 0;
                            $_etype127 = 0;
                            $xfer += $input->readListBegin($_etype127, $_size124);
                            for ($_i128 = 0; $_i128 < $_size124; ++$_i128) {
                                $elem129 = null;
                                $elem129 = new \MIPAddress();
                                $xfer += $elem129->read($input);
                                $val123 []= $elem129;
                            }
                            $xfer += $input->readListEnd();
                            $this->success[$key122] = $val123;
                        }
                        $xfer += $input->readMapEnd();
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
        $xfer += $output->writeStructBegin('MMIRegisterService_GetAvailableMMUs_result');
        if ($this->success !== null) {
            if (!is_array($this->success)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('success', TType::MAP, 0);
            $output->writeMapBegin(TType::STRUCT, TType::LST, count($this->success));
            foreach ($this->success as $kiter130 => $viter131) {
                $xfer += $kiter130->write($output);
                $output->writeListBegin(TType::STRUCT, count($viter131));
                foreach ($viter131 as $iter132) {
                    $xfer += $iter132->write($output);
                }
                $output->writeListEnd();
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
