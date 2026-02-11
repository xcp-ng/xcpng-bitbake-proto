
inherit dnf-bridge

PN = "strace"
PE = "0"
PV = "6.12"
PR = "1.el10"
PACKAGES = "strace"


URI_strace = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/strace-6.12-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:strace = " \
 glibc \
 libselinux \
 bash \
 elfutils-libs \
"
