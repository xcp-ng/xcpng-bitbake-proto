
inherit dnf-bridge

PN = "mptcpd"
PE = "0"
PV = "0.12"
PR = "6.el10"
PACKAGES = "mptcpd mptcpd-devel"


URI_mptcpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mptcpd-0.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mptcpd = " \
 glibc \
 libell \
 systemd \
"

URI_mptcpd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mptcpd-devel-0.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mptcpd-devel = " \
 mptcpd \
 pkgconf-pkg-config \
 libell-devel \
"
