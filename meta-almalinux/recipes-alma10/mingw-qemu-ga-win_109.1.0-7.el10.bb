
inherit dnf-bridge

PN = "mingw-qemu-ga-win"
PE = "0"
PV = "109.1.0"
PR = "7.el10"
PACKAGES = "mingw-qemu-ga-win"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mingw-qemu-ga-win-109.1.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw-qemu-ga-win = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mingw-qemu-ga-win-109.1.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw-qemu-ga-win}"
RDEPENDS:mingw-qemu-ga-win = " \
 systemd \
"
