
inherit dnf-bridge

PN = "xdg-user-dirs"
PE = "0"
PV = "0.18"
PR = "6.el10_0.1"
PACKAGES = "xdg-user-dirs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xdg-user-dirs-0.18-6.el10_0.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xdg-user-dirs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-user-dirs-0.18-6.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xdg-user-dirs}"
RDEPENDS:xdg-user-dirs = " \
 glibc \
 filesystem \
 bash \
"
