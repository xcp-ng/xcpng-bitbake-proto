
PN = "lldpd"
PE = "0"
PV = "1.0.19"
PR = "1.el10"
PACKAGES = "lldpd lldpd-devel"


URI_lldpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldpd-1.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpd = "
 shadow-utils
 systemd
 net-snmp-agent-libs
 net-snmp-libs
 libevent
 readline
 libxml2
 bash
 glibc
"

URI_lldpd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldpd-devel-1.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpd-devel = "
 pkgconf-pkg-config
 lldpd
"
