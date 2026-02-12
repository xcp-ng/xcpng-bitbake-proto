
inherit dnf-bridge

PN = "hostname"
PE = "0"
PV = "3.23"
PR = "14.el10"
PACKAGES = "hostname"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/hostname-3.23-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hostname = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hostname-3.23-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hostname}"
RDEPENDS:hostname = " \
 glibc \
 bash \
"
