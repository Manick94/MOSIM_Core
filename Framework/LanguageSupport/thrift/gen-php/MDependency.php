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

class MDependency
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'ID',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'Type',
            'isRequired' => true,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'MinVersion',
            'isRequired' => true,
            'type' => TType::STRUCT,
            'class' => '\MVersion',
        ),
        4 => array(
            'var' => 'MaxVersion',
            'isRequired' => true,
            'type' => TType::STRUCT,
            'class' => '\MVersion',
        ),
        5 => array(
            'var' => 'ExcludedVersions',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MVersion',
                ),
        ),
        6 => array(
            'var' => 'Name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $ID = null;
    /**
     * @var int
     */
    public $Type = null;
    /**
     * @var \MVersion
     */
    public $MinVersion = null;
    /**
     * @var \MVersion
     */
    public $MaxVersion = null;
    /**
     * @var \MVersion[]
     */
    public $ExcludedVersions = null;
    /**
     * @var string
     */
    public $Name = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['ID'])) {
                $this->ID = $vals['ID'];
            }
            if (isset($vals['Type'])) {
                $this->Type = $vals['Type'];
            }
            if (isset($vals['MinVersion'])) {
                $this->MinVersion = $vals['MinVersion'];
            }
            if (isset($vals['MaxVersion'])) {
                $this->MaxVersion = $vals['MaxVersion'];
            }
            if (isset($vals['ExcludedVersions'])) {
                $this->ExcludedVersions = $vals['ExcludedVersions'];
            }
            if (isset($vals['Name'])) {
                $this->Name = $vals['Name'];
            }
        }
    }

    public function getName()
    {
        return 'MDependency';
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
                        $xfer += $input->readString($this->ID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->Type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->MinVersion = new \MVersion();
                        $xfer += $this->MinVersion->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->MaxVersion = new \MVersion();
                        $xfer += $this->MaxVersion->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->ExcludedVersions = array();
                        $_size65 = 0;
                        $_etype68 = 0;
                        $xfer += $input->readListBegin($_etype68, $_size65);
                        for ($_i69 = 0; $_i69 < $_size65; ++$_i69) {
                            $elem70 = null;
                            $elem70 = new \MVersion();
                            $xfer += $elem70->read($input);
                            $this->ExcludedVersions []= $elem70;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Name);
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
        $xfer += $output->writeStructBegin('MDependency');
        if ($this->ID !== null) {
            $xfer += $output->writeFieldBegin('ID', TType::STRING, 1);
            $xfer += $output->writeString($this->ID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Type !== null) {
            $xfer += $output->writeFieldBegin('Type', TType::I32, 2);
            $xfer += $output->writeI32($this->Type);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->MinVersion !== null) {
            if (!is_object($this->MinVersion)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('MinVersion', TType::STRUCT, 3);
            $xfer += $this->MinVersion->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->MaxVersion !== null) {
            if (!is_object($this->MaxVersion)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('MaxVersion', TType::STRUCT, 4);
            $xfer += $this->MaxVersion->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ExcludedVersions !== null) {
            if (!is_array($this->ExcludedVersions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('ExcludedVersions', TType::LST, 5);
            $output->writeListBegin(TType::STRUCT, count($this->ExcludedVersions));
            foreach ($this->ExcludedVersions as $iter71) {
                $xfer += $iter71->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Name !== null) {
            $xfer += $output->writeFieldBegin('Name', TType::STRING, 6);
            $xfer += $output->writeString($this->Name);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
