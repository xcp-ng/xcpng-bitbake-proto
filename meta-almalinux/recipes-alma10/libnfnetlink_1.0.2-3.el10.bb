
PN = "libnfnetlink"
PE = "0"
PV = "1.0.2"
PR = "3.el10"
PACKAGES = "libnfnetlink libnfnetlink-devel"


URI_libnfnetlink = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnfnetlink-1.0.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfnetlink = "
 glibc
"

URI_libnfnetlink-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnfnetlink-devel-1.0.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfnetlink-devel = "
 libnfnetlink
 kernel-headers
 pkgconf-pkg-config
"
