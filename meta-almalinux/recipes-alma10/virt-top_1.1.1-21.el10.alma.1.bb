
inherit dnf-bridge

PN = "virt-top"
PE = "0"
PV = "1.1.1"
PR = "21.el10.alma.1"
PACKAGES = "virt-top"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/virt-top-1.1.1-21.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_virt-top = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-top-1.1.1-21.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_virt-top}"
RDEPENDS:virt-top = " \
 python3 \
 libxml2 \
 ncurses-libs \
 glibc \
 libvirt-libs \
"
