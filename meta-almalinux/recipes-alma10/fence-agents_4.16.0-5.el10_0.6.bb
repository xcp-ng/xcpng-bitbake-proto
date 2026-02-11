
PN = "fence-agents"
PE = "0"
PV = "4.16.0"
PR = "5.el10_0.6"
PACKAGES = "fence-agents-aliyun fence-agents-all fence-agents-amt-ws fence-agents-apc fence-agents-apc-snmp fence-agents-aws fence-agents-azure-arm fence-agents-bladecenter fence-agents-brocade fence-agents-cisco-mds fence-agents-cisco-ucs fence-agents-common fence-agents-drac5 fence-agents-eaton-snmp fence-agents-emerson fence-agents-eps fence-agents-gce fence-agents-heuristics-ping fence-agents-hpblade fence-agents-ibm-powervs fence-agents-ibm-vpc fence-agents-ibmblade fence-agents-ifmib fence-agents-ilo-moonshot fence-agents-ilo-mp fence-agents-ilo-ssh fence-agents-ilo2 fence-agents-intelmodular fence-agents-ipdu fence-agents-ipmilan fence-agents-kdump fence-agents-kubevirt fence-agents-lpar fence-agents-mpath fence-agents-openstack fence-agents-redfish fence-agents-rhevm fence-agents-rsa fence-agents-rsb fence-agents-sbd fence-agents-scsi fence-agents-virsh fence-agents-vmware-rest fence-agents-vmware-soap fence-agents-wti fence-virt fence-virtd fence-virtd-cpg fence-virtd-libvirt fence-virtd-multicast fence-virtd-serial fence-virtd-tcp ha-cloud-support fence-agents-lpar"


URI_fence-agents-aliyun = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-aliyun-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-aliyun = "/usr/bin/python3 ( ) ha-cloud-support ( =  4.16.0-5.el10_0.6) python3-jmespath ( >=  0.9.0) fence-agents-common ( >=  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-aliyun = "fence-agents-aliyun ( =  4.16.0-5.el10_0.6) fence-agents-aliyun(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-all-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-all = "fence-agents-sbd ( ) fence-agents-amt-ws ( ) fence-agents-apc ( ) fence-agents-apc-snmp ( ) fence-agents-bladecenter ( ) fence-agents-brocade ( ) fence-agents-cisco-mds ( ) fence-agents-cisco-ucs ( ) fence-agents-drac5 ( ) fence-agents-eaton-snmp ( ) fence-agents-emerson ( ) fence-agents-eps ( ) fence-agents-heuristics-ping ( ) fence-agents-hpblade ( ) fence-agents-ibmblade ( ) fence-agents-ifmib ( ) fence-agents-ilo-moonshot ( ) fence-agents-ilo-mp ( ) fence-agents-ilo-ssh ( ) fence-agents-ilo2 ( ) fence-agents-intelmodular ( ) fence-agents-ipdu ( ) fence-agents-ipmilan ( ) fence-agents-kdump ( ) fence-agents-mpath ( ) fence-agents-redfish ( ) fence-agents-rhevm ( ) fence-agents-rsa ( ) fence-agents-rsb ( ) fence-agents-scsi ( ) fence-agents-vmware-rest ( ) fence-agents-vmware-soap ( ) fence-agents-wti ( ) fence-virt ( )"
RPROVIDES:fence-agents-all = "fence-agents ( =  4.16.0-5.el10_0.6) fence-agents-all ( =  4.16.0-5.el10_0.6) fence-agents-all(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-amt-ws = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-amt-ws-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-amt-ws = "/usr/bin/python3 ( ) openwsman-python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-amt-ws = "fence-agents-amt-ws ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-apc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-apc-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-apc = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-apc = "fence-agents-apc ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-apc-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-apc-snmp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-apc-snmp = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-apc-snmp = "fence-agents-apc-snmp ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-aws = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-aws-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-aws = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6) ha-cloud-support ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-aws = "fence-agents-aws ( =  4.16.0-5.el10_0.6) fence-agents-aws(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-azure-arm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-azure-arm-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-azure-arm = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6) ha-cloud-support ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-azure-arm = "fence-agents-azure-arm ( =  4.16.0-5.el10_0.6) fence-agents-azure-arm(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-bladecenter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-bladecenter-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-bladecenter = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-bladecenter = "fence-agents-bladecenter ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-brocade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-brocade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-brocade = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-brocade = "fence-agents-brocade ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-cisco-mds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-cisco-mds-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-cisco-mds = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-cisco-mds = "fence-agents-cisco-mds ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-cisco-ucs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-cisco-ucs-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-cisco-ucs = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-cisco-ucs = "fence-agents-cisco-ucs ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-common-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-common = "rtld(GNU_HASH) ( ) /usr/bin/python3 ( ) /usr/bin/pkg-config ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libc.so.6(GLIBC_2.15)(64bit) ( ) python3-pexpect ( ) python3-ptyprocess ( )"
RPROVIDES:fence-agents-common = "fence-agents-common ( =  4.16.0-5.el10_0.6) bundled(python3-pycurl) ( =  7.45.3) bundled(python3-suds-community) ( =  1.1.2) pkgconfig(fence-agents) ( =  4.16.0) fence-agents-common(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-drac5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-drac5-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-drac5 = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-drac5 = "fence-agents-drac5 ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-eaton-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-eaton-snmp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-eaton-snmp = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-eaton-snmp = "fence-agents-eaton-snmp ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-emerson = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-emerson-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-emerson = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-emerson = "fence-agents-emerson ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-eps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-eps-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-eps = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-eps = "fence-agents-eps ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-gce = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-gce-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-gce = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6) ha-cloud-support ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-gce = "fence-agents-gce ( =  4.16.0-5.el10_0.6) fence-agents-gce(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-heuristics-ping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-heuristics-ping-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-heuristics-ping = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-heuristics-ping = "fence-agents-heuristics-ping ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-hpblade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-hpblade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-hpblade = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-hpblade = "fence-agents-hpblade ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ibm-powervs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibm-powervs-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibm-powervs = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ibm-powervs = "fence-agents-ibm-powervs ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ibm-vpc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibm-vpc-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibm-vpc = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ibm-vpc = "fence-agents-ibm-vpc ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ibmblade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ibmblade-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ibmblade = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ibmblade = "fence-agents-ibmblade ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ifmib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ifmib-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ifmib = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ifmib = "fence-agents-ifmib ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ilo-moonshot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-moonshot-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-moonshot = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ilo-moonshot = "fence-agents-ilo-moonshot ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ilo-mp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-mp-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-mp = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ilo-mp = "fence-agents-ilo-mp ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ilo-ssh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo-ssh-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo-ssh = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ilo-ssh = "fence-agents-ilo-ssh ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ilo2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ilo2-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ilo2 = "/usr/bin/python3 ( ) gnutls-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ilo2 = "fence-agents-ilo2 ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-intelmodular = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-intelmodular-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-intelmodular = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-intelmodular = "fence-agents-intelmodular ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ipdu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ipdu-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ipdu = "/usr/bin/python3 ( ) net-snmp-utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ipdu = "fence-agents-ipdu ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-ipmilan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-ipmilan-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-ipmilan = "/usr/bin/python3 ( ) /usr/bin/ipmitool ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-ipmilan = "fence-agents-ipmilan ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-kdump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-kdump-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-kdump = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-kdump = "fence-agents-kdump ( =  4.16.0-5.el10_0.6) fence-agents-kdump(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-kubevirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-kubevirt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-kubevirt = "/usr/bin/python3 ( ) python3-requests ( ) python3-pyasn1 ( ) python3-six ( ) python3-oauthlib ( ) python3-dateutil ( ) python3-pyyaml ( ) python3-requests-oauthlib ( ) python3-charset-normalizer ( ) python3-urllib3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-kubevirt = "bundled(python3-kubernetes) ( =  29.0.0) bundled(python3-openshift) ( =  0.13.2) bundled(python3-python-string-utils) ( =  1.0.0) bundled(python3-websocket-client) ( =  1.7.0) fence-agents-kubevirt ( =  4.16.0-5.el10_0.6) fence-agents-kubevirt(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-lpar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-lpar-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-lpar = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-lpar = "fence-agents-lpar ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-mpath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-mpath-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-mpath = "/usr/bin/python3 ( ) device-mapper-multipath ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-mpath = "fence-agents-mpath ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-openstack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-openstack-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-openstack = "/usr/bin/python3 ( ) python3-requests ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-openstack = "fence-agents-openstack ( =  4.16.0-5.el10_0.6) fence-agents-openstack(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-redfish = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-redfish-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-agents-redfish = "/usr/bin/python3 ( ) python3-requests ( ) fence-agents-common ( >=  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-redfish = "fence-agents-redfish ( =  4.16.0-5.el10_0.6) fence-agents-redfish(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-rhevm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rhevm-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rhevm = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-rhevm = "fence-agents-rhevm ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-rsa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rsa-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rsa = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-rsa = "fence-agents-rsa ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-rsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-rsb-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-rsb = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-rsb = "fence-agents-rsb ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-sbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-sbd-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-sbd = "/usr/bin/python3 ( ) sbd ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-sbd = "fence-agents-sbd ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-scsi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-scsi-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-scsi = "/usr/bin/python3 ( ) sg3_utils ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-scsi = "fence-agents-scsi ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-virsh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-virsh-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-virsh = "/usr/bin/python3 ( ) openssh-clients ( ) /usr/bin/virsh ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-virsh = "fence-agents-virsh ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-vmware-rest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-vmware-rest-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-vmware-rest = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-vmware-rest = "fence-agents-vmware-rest ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-vmware-soap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-vmware-soap-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-vmware-soap = "/usr/bin/python3 ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-vmware-soap = "fence-agents-vmware-soap ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-wti = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-agents-wti-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-wti = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-wti = "fence-agents-wti ( =  4.16.0-5.el10_0.6)"

URI_fence-virt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virt = "systemd-units ( ) systemd-sysv ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnss3.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( )"
RPROVIDES:fence-virt = "fence-virt ( =  4.16.0-5.el10_0.6) fence-virt(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( )"
RPROVIDES:fence-virtd = "config(fence-virtd) ( =  4.16.0-5.el10_0.6) fence-virtd ( =  4.16.0-5.el10_0.6) fence-virtd(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd-cpg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-cpg-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-cpg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libvirt.so.0()(64bit) ( ) libvirt.so.0(LIBVIRT_0.0.3)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.1)(64bit) ( ) fence-virtd ( ) libvirt.so.0(LIBVIRT_0.9.13)(64bit) ( ) libqb.so.100()(64bit) ( ) libcpg.so.4()(64bit) ( ) libcpg.so.4(COROSYNC_CPG_1.0)(64bit) ( ) corosynclib ( )"
RPROVIDES:fence-virtd-cpg = "fence-virtd-cpg ( =  4.16.0-5.el10_0.6) fence-virtd-cpg(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd-libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-libvirt-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-libvirt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libvirt.so.0()(64bit) ( ) libvirt.so.0(LIBVIRT_0.0.3)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.1)(64bit) ( ) libvirt.so.0(LIBVIRT_0.9.8)(64bit) ( ) fence-virtd ( ) libvirt.so.0(LIBVIRT_0.9.13)(64bit) ( ) libvirt ( >=  0.6.0)"
RPROVIDES:fence-virtd-libvirt = "fence-virtd-libvirt ( =  4.16.0-5.el10_0.6) fence-virtd-libvirt(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd-multicast = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-multicast-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-multicast = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) fence-virtd ( )"
RPROVIDES:fence-virtd-multicast = "fence-virtd-multicast ( =  4.16.0-5.el10_0.6) fence-virtd-multicast(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-serial-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-serial = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libvirt.so.0()(64bit) ( ) libvirt.so.0(LIBVIRT_0.0.3)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.0)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.1)(64bit) ( ) libvirt.so.0(LIBVIRT_0.9.8)(64bit) ( ) fence-virtd ( ) libvirt.so.0(LIBVIRT_0.5.0)(64bit) ( ) libvirt.so.0(LIBVIRT_0.9.0)(64bit) ( ) libvirt.so.0(LIBVIRT_0.10.0)(64bit) ( ) libvirt.so.0(LIBVIRT_0.6.0)(64bit) ( ) libvirt ( >=  0.6.2)"
RPROVIDES:fence-virtd-serial = "fence-virtd-serial ( =  4.16.0-5.el10_0.6) fence-virtd-serial(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-virtd-tcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fence-virtd-tcp-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:fence-virtd-tcp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) fence-virtd ( )"
RPROVIDES:fence-virtd-tcp = "fence-virtd-tcp ( =  4.16.0-5.el10_0.6) fence-virtd-tcp(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_ha-cloud-support = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ha-cloud-support-4.16.0-5.el10_0.6.x86_64_v2.rpm;unpack=0"
RDEPENDS:ha-cloud-support = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( ) python3-requests ( ) python3-pyasn1 ( ) python3-six ( ) python3-cryptography ( ) python3-oauthlib ( ) python3-dateutil ( ) python3-packaging ( ) python3-pyyaml ( ) python3-requests-oauthlib ( ) awscli2 ( ) python3-charset-normalizer ( ) python3-urllib3 ( ) python3-cffi ( ) python3-jmespath ( ) python3-protobuf ( ) python3-colorama ( ) python3-docutils ( ) python3-idna ( ) python3-pyparsing ( ) python3-typing-extensions ( ) python3-pycparser ( )"
RPROVIDES:ha-cloud-support = "ha-cloud-support ( =  4.16.0-5.el10_0.6) bundled(aliyun-cli) ( =  3.0.198) bundled(aliyun-openapi-meta) ( =  5cf98b660) bundled(python-pyroute2) ( =  0.7.12) bundled(python-pyroute2-core) ( =  0.6.13) bundled(python-pyroute2-ethtool) ( =  0.6.13) bundled(python-pyroute2-ipdb) ( =  0.6.13) bundled(python-pyroute2-ipset) ( =  0.6.13) bundled(python-pyroute2-ndb) ( =  0.6.13) bundled(python-pyroute2-nftables) ( =  0.6.13) bundled(python-pyroute2-nslink) ( =  0.6.13) bundled(python3-PyJWT) ( =  2.10.1) bundled(python3-adal) ( =  1.2.7) bundled(python3-aliyun-python-sdk-core) ( =  2.14.0) bundled(python3-aliyun-python-sdk-ecs) ( =  4.24.71) bundled(python3-azure-common) ( =  1.1.28) bundled(python3-azure-core) ( =  1.32.0) bundled(python3-azure-identity) ( =  1.19.0) bundled(python3-azure-mgmt-compute) ( =  34.0.0) bundled(python3-azure-mgmt-core) ( =  1.5.0) bundled(python3-azure-mgmt-network) ( =  28.1.0) bundled(python3-cachetools) ( =  5.3.2) bundled(python3-certifi) ( =  2025.1.31) bundled(python3-chardet) ( =  3.0.4) bundled(python3-google-api-core) ( =  1.34.1) bundled(python3-google-api-python-client) ( =  1.12.8) bundled(python3-google-auth) ( =  2.28.1) bundled(python3-google-auth-httplib2) ( =  0.2.0) bundled(python3-googleapis-common-protos) ( =  1.62.0) bundled(python3-httplib2) ( =  0.22.0) bundled(python3-isodate) ( =  0.6.1) bundled(python3-jmespath) ( =  0.10.0) bundled(python3-msal) ( =  1.31.1) bundled(python3-msal-extensions) ( =  1.2.0) bundled(python3-msrest) ( =  0.7.1) bundled(python3-msrestazure) ( =  0.6.4.post1) bundled(python3-portalocker) ( =  2.10.1) bundled(python3-pyasn1) ( =  0.5.1) bundled(python3-pyasn1_modules) ( =  0.3.0) bundled(python3-rsa) ( =  4.9) bundled(python3-uritemplate) ( =  3.0.1) bundled(python3-boto3) ( =  1.40.13) bundled(python3-botocore) ( =  1.40.13) bundled(python3-s3transfer) ( =  0.13.1) ha-cloud-support(x86-64) ( =  4.16.0-5.el10_0.6)"

URI_fence-agents-lpar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fence-agents-lpar-4.16.0-5.el10_0.6.noarch.rpm;unpack=0"
RDEPENDS:fence-agents-lpar = "/usr/bin/python3 ( ) openssh-clients ( ) fence-agents-common ( =  4.16.0-5.el10_0.6)"
RPROVIDES:fence-agents-lpar = "fence-agents-lpar ( =  4.16.0-5.el10_0.6)"
