
PN = "keepalived"
PE = "0"
PV = "2.2.8"
PR = "9.el10"
PACKAGES = "keepalived"


URI_keepalived = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keepalived-2.2.8-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keepalived = " \
 systemd \
 net-snmp-agent-libs \
 systemd-libs \
 net-snmp-libs \
 openssl-libs \
 libnl3 \
 libmnl \
 bash \
 libnftnl \
 glibc \
 file-libs \
"
