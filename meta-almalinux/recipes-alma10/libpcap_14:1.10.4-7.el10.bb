
inherit dnf-bridge

PN = "libpcap"
PE = "14"
PV = "1.10.4"
PR = "7.el10"
PACKAGES = "libpcap libpcap-devel"


URI_libpcap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpcap-1.10.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpcap = " \
 glibc \
 libibverbs \
"

URI_libpcap-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpcap-devel-1.10.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpcap-devel = " \
 libpcap \
 bash \
 pkgconf-pkg-config \
 rdma-core-devel \
"
