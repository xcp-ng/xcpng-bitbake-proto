
inherit dnf-bridge

PN = "iputils"
PE = "0"
PV = "20240905"
PR = "2.el10_0.1"
PACKAGES = "iputils"


URI_iputils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iputils-20240905-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:iputils = " \
 glibc \
 libidn2 \
 libcap \
"
