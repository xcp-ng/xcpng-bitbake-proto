
inherit dnf-bridge

PN = "dialog"
PE = "0"
PV = "1.3"
PR = "52.20240101.el10"
PACKAGES = "dialog dialog-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dialog-1.3-52.20240101.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dialog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dialog-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dialog}"
RDEPENDS:dialog = " \
 glibc \
 ncurses-libs \
"

URI_dialog-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dialog-devel-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dialog-devel}"
RDEPENDS:dialog-devel = " \
 ncurses-devel \
 dialog \
 bash \
 pkgconf-pkg-config \
"
