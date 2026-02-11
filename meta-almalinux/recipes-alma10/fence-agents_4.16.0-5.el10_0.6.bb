
PN = "fence-agents"
PE = "0"
PV = "4.16.0"
PR = "5.el10_0.6"
PACKAGES = "fence-agents-aliyun fence-agents-all fence-agents-amt-ws fence-agents-apc fence-agents-apc-snmp fence-agents-aws fence-agents-azure-arm fence-agents-bladecenter fence-agents-brocade fence-agents-cisco-mds fence-agents-cisco-ucs fence-agents-common fence-agents-drac5 fence-agents-eaton-snmp fence-agents-emerson fence-agents-eps fence-agents-gce fence-agents-heuristics-ping fence-agents-hpblade fence-agents-ibm-powervs fence-agents-ibm-vpc fence-agents-ibmblade fence-agents-ifmib fence-agents-ilo-moonshot fence-agents-ilo-mp fence-agents-ilo-ssh fence-agents-ilo2 fence-agents-intelmodular fence-agents-ipdu fence-agents-ipmilan fence-agents-kdump fence-agents-kubevirt fence-agents-lpar fence-agents-mpath fence-agents-openstack fence-agents-redfish fence-agents-rhevm fence-agents-rsa fence-agents-rsb fence-agents-sbd fence-agents-scsi fence-agents-virsh fence-agents-vmware-rest fence-agents-vmware-soap fence-agents-wti fence-virt fence-virtd fence-virtd-cpg fence-virtd-libvirt fence-virtd-multicast fence-virtd-serial fence-virtd-tcp ha-cloud-support fence-agents-lpar"


URI_fence-agents-aliyun = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-aliyun-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-aliyun = "
 python3
 fence-agents-common
 ha-cloud-support
 python3-jmespath
"

URI_fence-agents-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-all-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-all = "
 fence-agents-ifmib
 fence-agents-ilo-moonshot
 fence-agents-ilo-mp
 fence-agents-ilo-ssh
 fence-agents-ilo2
 fence-agents-intelmodular
 fence-agents-ipdu
 fence-agents-ipmilan
 fence-agents-kdump
 fence-agents-mpath
 fence-agents-redfish
 fence-agents-rhevm
 fence-agents-rsa
 fence-agents-rsb
 fence-agents-sbd
 fence-agents-scsi
 fence-agents-vmware-rest
 fence-agents-vmware-soap
 fence-agents-wti
 fence-agents-amt-ws
 fence-virt
 fence-agents-apc
 fence-agents-apc-snmp
 fence-agents-bladecenter
 fence-agents-brocade
 fence-agents-cisco-mds
 fence-agents-cisco-ucs
 fence-agents-drac5
 fence-agents-eaton-snmp
 fence-agents-emerson
 fence-agents-eps
 fence-agents-heuristics-ping
 fence-agents-hpblade
 fence-agents-ibmblade
"

URI_fence-agents-amt-ws = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-amt-ws-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-amt-ws = "
 python3
 openwsman-python3
 fence-agents-common
"

URI_fence-agents-apc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-apc-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-apc = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-apc-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-apc-snmp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-apc-snmp = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-aws = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-aws-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-aws = "
 python3
 fence-agents-common
 ha-cloud-support
"

URI_fence-agents-azure-arm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-azure-arm-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-azure-arm = "
 python3
 fence-agents-common
 ha-cloud-support
"

URI_fence-agents-bladecenter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-bladecenter-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-bladecenter = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-brocade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-brocade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-brocade = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-cisco-mds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-cisco-mds-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-cisco-mds = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-cisco-ucs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-cisco-ucs-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-cisco-ucs = "
 python3
 fence-agents-common
"

URI_fence-agents-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-common-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-common = "
 python3
 openssl-libs
 pkgconf-pkg-config
 libcurl
 glibc
 python3-pexpect
 python3-ptyprocess
"

URI_fence-agents-drac5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-drac5-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-drac5 = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-eaton-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-eaton-snmp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-eaton-snmp = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-emerson = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-emerson-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-emerson = "
 python3
 fence-agents-common
"

URI_fence-agents-eps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-eps-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-eps = "
 python3
 fence-agents-common
"

URI_fence-agents-gce = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-gce-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-gce = "
 python3
 fence-agents-common
 ha-cloud-support
"

URI_fence-agents-heuristics-ping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-heuristics-ping-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-heuristics-ping = "
 python3
 fence-agents-common
"

URI_fence-agents-hpblade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-hpblade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-hpblade = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-ibm-powervs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibm-powervs-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibm-powervs = "
 python3
 fence-agents-common
"

URI_fence-agents-ibm-vpc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibm-vpc-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibm-vpc = "
 python3
 fence-agents-common
"

URI_fence-agents-ibmblade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibmblade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibmblade = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-ifmib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ifmib-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ifmib = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-ilo-moonshot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-moonshot-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-moonshot = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-ilo-mp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-mp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-mp = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-ilo-ssh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-ssh-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-ssh = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-ilo2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo2-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo2 = "
 python3
 fence-agents-common
 gnutls-utils
"

URI_fence-agents-intelmodular = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-intelmodular-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-intelmodular = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-ipdu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ipdu-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ipdu = "
 python3
 net-snmp-utils
 fence-agents-common
"

URI_fence-agents-ipmilan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ipmilan-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ipmilan = "
 python3
 fence-agents-common
 ipmitool
"

URI_fence-agents-kdump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-kdump-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-kdump = "
 glibc
 fence-agents-common
"

URI_fence-agents-kubevirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-kubevirt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-kubevirt = "
 python3
 python3-oauthlib
 python3-pyyaml
 python3-urllib3
 python3-requests
 python3-charset-normalizer
 fence-agents-common
 python3-pyasn1
 python3-dateutil
 python3-six
 python3-requests-oauthlib
"

URI_fence-agents-lpar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-lpar-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-lpar = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-mpath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-mpath-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-mpath = "
 python3
 fence-agents-common
 device-mapper-multipath
"

URI_fence-agents-openstack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-openstack-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-openstack = "
 python3
 fence-agents-common
 python3-requests
"

URI_fence-agents-redfish = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-redfish-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-redfish = "
 python3
 fence-agents-common
 python3-requests
"

URI_fence-agents-rhevm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rhevm-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rhevm = "
 python3
 fence-agents-common
"

URI_fence-agents-rsa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rsa-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rsa = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-rsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rsb-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rsb = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-agents-sbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-sbd-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-sbd = "
 python3
 fence-agents-common
 sbd
"

URI_fence-agents-scsi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-scsi-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-scsi = "
 python3
 sg3_utils
 fence-agents-common
"

URI_fence-agents-virsh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-virsh-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-virsh = "
 python3
 fence-agents-common
 openssh-clients
 libvirt-client
"

URI_fence-agents-vmware-rest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-vmware-rest-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-vmware-rest = "
 python3
 fence-agents-common
"

URI_fence-agents-vmware-soap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-vmware-soap-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-vmware-soap = "
 python3
 fence-agents-common
"

URI_fence-agents-wti = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-wti-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-wti = "
 python3
 fence-agents-common
 openssh-clients
"

URI_fence-virt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virt = "
 glibc
 systemd
 nss
"

URI_fence-virtd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd = "
 libuuid
 nss
 nss-util
 glibc
 nspr
"

URI_fence-virtd-cpg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-cpg-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-cpg = "
 libqb
 nss
 corosynclib
 fence-virtd
 nss-util
 glibc
 libvirt-libs
 nspr
"

URI_fence-virtd-libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-libvirt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-libvirt = "
 nss
 fence-virtd
 nss-util
 glibc
 libvirt-libs
 libvirt
 nspr
"

URI_fence-virtd-multicast = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-multicast-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-multicast = "
 nss
 fence-virtd
 nss-util
 glibc
 nspr
"

URI_fence-virtd-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-serial-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-serial = "
 nss
 fence-virtd
 libxml2
 nss-util
 glibc
 libvirt-libs
 libvirt
 nspr
"

URI_fence-virtd-tcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-tcp-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-tcp = "
 nss
 fence-virtd
 nss-util
 glibc
 nspr
"

URI_ha-cloud-support = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ha-cloud-support-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:ha-cloud-support = "
 python3-cffi
 python3-charset-normalizer
 python3-cryptography
 python3-dateutil
 python3-jmespath
 python3-idna
 python3-packaging
 python3-pycparser
 python3-pyparsing
 python3-oauthlib
 python3-pyyaml
 python3-requests
 python3-six
 awscli2
 python3-typing-extensions
 python3-urllib3
 python3-protobuf
 python3-pyasn1
 python3-colorama
 glibc
 python3-requests-oauthlib
 python3-docutils
"

URI_fence-agents-lpar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fence-agents-lpar-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-lpar = "
 python3
 fence-agents-common
 openssh-clients
"
