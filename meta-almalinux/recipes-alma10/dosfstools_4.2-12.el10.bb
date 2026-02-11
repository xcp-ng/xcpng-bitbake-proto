
inherit dnf-bridge

PN = "dosfstools"
PE = "0"
PV = "4.2"
PR = "12.el10"
PACKAGES = "dosfstools"


URI_dosfstools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dosfstools-4.2-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dosfstools = " \
 glibc \
"
