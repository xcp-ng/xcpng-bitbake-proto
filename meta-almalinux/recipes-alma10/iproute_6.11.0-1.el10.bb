
inherit dnf-bridge

PN = "iproute"
PE = "0"
PV = "6.11.0"
PR = "1.el10"
PACKAGES = "iproute iproute-tc iproute-devel iproute-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iproute-6.11.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iproute = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iproute-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iproute}"
RDEPENDS:iproute = " \
 libmnl \
 libbpf \
 elfutils-libelf \
 libcap \
 glibc \
 libselinux \
 psmisc \
"

URI_iproute-tc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iproute-tc-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iproute-tc}"
RDEPENDS:iproute-tc = " \
 iproute \
 libmnl \
 libbpf \
 iptables-libs \
 elfutils-libelf \
 libcap \
 glibc \
"

URI_iproute-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/iproute-devel-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iproute-devel}"
RDEPENDS:iproute-devel = " \
 iproute \
"

URI_iproute-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iproute-doc-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iproute-doc}"
RDEPENDS:iproute-doc = " \
 iproute \
"
