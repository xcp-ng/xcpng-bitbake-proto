
inherit dnf-bridge

PN = "rpcbind"
PE = "0"
PV = "1.2.7"
PR = "3.el10"
PACKAGES = "rpcbind"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/rpcbind-1.2.7-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpcbind = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpcbind-1.2.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rpcbind}"
RDEPENDS:rpcbind = " \
 glibc-common \
 setup \
 shadow-utils \
 systemd \
 systemd-libs \
 libtirpc \
 bash \
 glibc \
 coreutils \
"
