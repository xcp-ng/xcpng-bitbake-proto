
PN = "frr"
PE = "0"
PV = "10.1"
PR = "10.el10"
PACKAGES = "frr frr-selinux"


URI_frr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/frr-10.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:frr = "
 python3
 systemd
 ncurses
 json-c
 libcap
 frr-selinux
 shadow-utils
 net-snmp
 net-snmp-agent-libs
 net-snmp-libs
 libxcrypt
 libgcc
 openssl-libs
 bash
 c-ares
 libyang
 readline
 hostname
 glibc
 protobuf-c
 rpm-libs
"

URI_frr-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/frr-selinux-10.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:frr-selinux = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"
