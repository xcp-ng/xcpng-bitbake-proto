
inherit dnf-bridge

PN = "virt-what"
PE = "0"
PV = "1.27"
PR = "2.el10"
PACKAGES = "virt-what"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/virt-what-1.27-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_virt-what = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/virt-what-1.27-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_virt-what}"
RDEPENDS:virt-what = " \
 util-linux \
 dmidecode \
 bash \
 which \
 glibc \
"
